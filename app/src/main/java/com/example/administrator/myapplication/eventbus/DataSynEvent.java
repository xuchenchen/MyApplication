package com.example.administrator.myapplication.eventbus;

/**
 * Created by Administrator on 2017/7/25.
 */

public class DataSynEvent {
    public DataSynEvent(int count) {
        this.count = count;
    }

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
