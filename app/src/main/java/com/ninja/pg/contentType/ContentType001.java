package com.ninja.pg.contentType;

import com.ninja.pg.dataType.DataType001;

import java.util.ArrayList;
import java.util.List;

public class ContentType001 {

    public static final List<DataType001> ITEMS = new ArrayList<>();
    private static final int COUNT = 25;

    static {
        int startIndex = 0;
        addItem(new DataType001(String.valueOf(startIndex), "Kotlin", "Kotlin play ground"));
        startIndex++;

        for (int i = startIndex; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DataType001 item) {
        ITEMS.add(item);
    }

    private static DataType001 createDummyItem(int position) {
        return new DataType001(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

}
