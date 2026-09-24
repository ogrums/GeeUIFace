package com.geeui.face.gesture;


import androidx.annotation.NonNull;

import com.renhejia.robot.commandlib.log.LogUtils;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Single-thread gesture runner. Submitting a new pose cancels the previous one
 * via thread interrupt — callers must treat InterruptedException as a stop,
 * not as a fatal error (otherwise this executor dies and all later poses hang).
 */
public class GestureDataThreadExecutor implements Executor {
    private Future<?> currentTask = null;
    private static volatile GestureDataThreadExecutor gestureDataThreadExecutor;

    public static GestureDataThreadExecutor getInstance() {
        if (gestureDataThreadExecutor == null) {
            synchronized (GestureDataThreadExecutor.class) {
                if (gestureDataThreadExecutor == null) {
                    gestureDataThreadExecutor = new GestureDataThreadExecutor();
                }
            }
        }
        return gestureDataThreadExecutor;
    }

    private final ExecutorService mExecutorService;

    private GestureDataThreadExecutor() {
        mExecutorService = Executors.newSingleThreadExecutor(r -> {
            Thread t = new Thread(r, "geeui-gesture");
            t.setDaemon(true);
            return t;
        });
    }

    @Override
    public void execute(@NonNull Runnable task) {
        synchronized (this) {
            if (currentTask != null && !currentTask.isDone()) {
                LogUtils.logd("GestureDataThreadExecutor", "execute: cancel thread");
                currentTask.cancel(true);
            }
            currentTask = mExecutorService.submit(task);
        }
    }
}
