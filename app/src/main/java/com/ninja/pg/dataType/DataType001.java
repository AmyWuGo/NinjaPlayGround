package com.ninja.pg.dataType;

public class DataType001 {
    public final int id;
    public final String content;
    public final String details;

    public DataType001(int id, String content, String details) {
        this.id = id;
        this.content = content;
        this.details = details;
    }

    @Override
    public String toString() {
        return content;
    }
}
