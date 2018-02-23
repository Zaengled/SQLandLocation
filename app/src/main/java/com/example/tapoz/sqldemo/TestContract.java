package com.example.tapoz.sqldemo;

import android.provider.BaseColumns;

/**
 * Created by tapoz on 2/21/2018.
 */

public final class TestContract {
    private TestContract(){}

    public static class TestEntry implements BaseColumns {
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";
    }
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TestEntry.TABLE_NAME + " (" +
                    TestEntry._ID + " INTEGER PRIMARY KEY," +
                    TestEntry.COLUMN_NAME_TITLE + " TEXT," +
                    TestEntry.COLUMN_NAME_SUBTITLE + " TEXT)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + TestEntry.TABLE_NAME;
}


