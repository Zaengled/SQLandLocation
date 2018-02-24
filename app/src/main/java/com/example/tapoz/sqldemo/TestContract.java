package com.example.tapoz.sqldemo;

import android.provider.BaseColumns;

/**
 * Created by tapoz on 2/21/2018.
 */

public final class TestContract {

    private TestContract(){}

    public static class Location implements BaseColumns {
        public static final String TABLE_NAME = "locationTable";
        public static final String COLUMN_TEXT = "text";
        public static final String COLUMN_LAT = "latitude";
        public static final String COLUMN_LON = "longitude";

        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME + " (" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TEXT + " TEXT, " + COLUMN_LAT + " INTEGER, " + COLUMN_LON +
                " INTEGER" + ")";
    }


}


