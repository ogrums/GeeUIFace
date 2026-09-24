package com.renhejia.robot.commandlib.parser.clock;

import java.util.Arrays;

public class ClockListData {

    private int total;
    private int current_page;
    private int page_count;
    private boolean has_more;
    private ClockInfo[] clock_list;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getPage_count() {
        return page_count;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }

    public boolean isHas_more() {
        return has_more;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }

    public ClockInfo[] getClock_list() {
        return clock_list;
    }

    public void setClock_list(ClockInfo[] clock_list) {
        this.clock_list = clock_list;
    }

    @Override
    public String toString() {
        return "ClockListData{" +
                "total=" + total +
                ", current_page=" + current_page +
                ", page_count=" + page_count +
                ", has_more=" + has_more +
                ", clock_list=" + Arrays.toString(clock_list) +
                '}';
    }
}
