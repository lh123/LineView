package com.lh.lineview;

/**
 * Created by home on 2017/1/13.
 */

public class Data {
    private String index;
    private float value;

    public Data(String index, float value) {
        this.index = index;
        this.value = value;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
