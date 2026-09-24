package com.geeui.face.gesture;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GestureDataThreadExecutorTest {

    @Test
    public void newPoseInterruptsThePreviousOneAndStillRuns() throws Exception {
        GestureDataThreadExecutor executor = GestureDataThreadExecutor.getInstance();
        CountDownLatch started = new CountDownLatch(1);
        CountDownLatch release = new CountDownLatch(1);
        CountDownLatch secondDone = new CountDownLatch(1);
        AtomicBoolean firstInterrupted = new AtomicBoolean(false);
        AtomicBoolean firstFinished = new AtomicBoolean(false);

        executor.execute(() -> {
            started.countDown();
            try {
                if (release.await(2, TimeUnit.SECONDS)) {
                    firstFinished.set(true);
                }
            } catch (InterruptedException e) {
                firstInterrupted.set(true);
                Thread.currentThread().interrupt();
            }
        });

        assertTrue(started.await(2, TimeUnit.SECONDS));
        executor.execute(secondDone::countDown);

        assertTrue(secondDone.await(2, TimeUnit.SECONDS));
        assertTrue(firstInterrupted.get());
        assertFalse(firstFinished.get());
    }
}
