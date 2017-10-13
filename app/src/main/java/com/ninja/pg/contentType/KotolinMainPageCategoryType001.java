package com.ninja.pg.contentType;

import com.ninja.pg.constant.KotolinPageCategoryType;
import com.ninja.pg.dataType.DataType001;

import java.util.ArrayList;
import java.util.List;

public class KotolinMainPageCategoryType001 {

    public static final List<DataType001> ITEMS = new ArrayList<>();
    private static final int COUNT = 25;

    static {
        int startIndex = 0;
        addItem(new DataType001(KotolinPageCategoryType.KOTOLIN_001_J, "001 Java", "001 Java"));
        startIndex++;

        addItem(new DataType001(KotolinPageCategoryType.KOTOLIN_001_K, "001 Kotolin", "001 Kotolin"));
        startIndex++;

        for (int i = startIndex; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DataType001 item) {
        ITEMS.add(item);
    }

    private static DataType001 createDummyItem(int position) {
        return new DataType001(position, "Item " + position, makeDetails(position));
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
