package com.example.tapoz.sqldemo;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    EditText text_label = (EditText) findViewById(R.id.editText);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void saveToDB() {

        SQLiteDatabase database = new TestContractHelper(this).getWritableDatabase();   // Create our new database
        ContentValues values = new ContentValues();                                             // Create a group of values to be placed in our database later

        // Add content to our group of values
        values.put(TestContract.Location.COLUMN_TEXT, text_label.getText().toString());


        // This will need to be changed when I have location working.
        // It can go in the conditional if location is denied.
        values.put(TestContract.Location.COLUMN_LAT, 44.5);
        values.put(TestContract.Location.COLUMN_LON, -123.2);

        long newRowId = database.insert(TestContract.Location.TABLE_NAME, null, values);
        Toast.makeText(this, "The new Row ID is: " + newRowId, Toast.LENGTH_LONG).show();
    }
}
