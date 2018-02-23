package com.example.tapoz.sqldemo;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class SQLite extends AppCompatActivity {

    private DBHelper mydb;
    TextView myString;

    String query = "select sqlite_version() AS sqlite_version";
    SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(":memory:", null);
    Cursor cursor = db.rawQuery(query, null);
    String sqliteVersion = "";
    if (cursor.moveToNext()) {
        sqliteVersion = cursor.getString(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);
    }
}
