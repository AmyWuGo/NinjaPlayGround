package com.ninja.pg.constant;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

public class KotolinPageCategoryType {
    @Retention(SOURCE)
    @IntDef({KOTOLIN_001_J, KOTOLIN_001_K})
    public @interface Type {
    }

    public static final int KOTOLIN_001_J = 0;
    public static final int KOTOLIN_001_K = 1;

}
