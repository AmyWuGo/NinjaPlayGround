package com.ninja.pg.constant;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

public class ListContentType {
    @Retention(SOURCE)
    @IntDef({MAIN_PAGE_CATEGORY, KOTOLIN_MAIN_PAGE_CATEGORY, NAVIGATION_MODE_TABS})
    public @interface Type {
    }

    public static final int MAIN_PAGE_CATEGORY = 0;
    public static final int KOTOLIN_MAIN_PAGE_CATEGORY = 1;
    public static final int NAVIGATION_MODE_TABS = 2;

}
