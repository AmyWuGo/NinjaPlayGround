package com.ninja.pg.constant;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

public class MainPageCategoryType {
    @Retention(SOURCE)
    @IntDef({KOTOLIN})
    public @interface Type {
    }

    public static final int KOTOLIN = 0;

}
