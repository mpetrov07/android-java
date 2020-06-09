package com.example.tetris;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class HighScoresDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "HighScores";
    private static final int DATABASE_VERSION = 1;

    HighScoresDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        HighScoresDb.onCreate(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        HighScoresDb.onUpgrade(db);
    }


}
