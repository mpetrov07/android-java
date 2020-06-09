package com.example.tetris;

import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.view.View;

public class SettingsHighscoresActivity  extends PreferenceActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int backgroundColor = Color.parseColor("#ff72abff");
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(backgroundColor);
        addPreferencesFromResource(R.xml.preferences_highscores);

        PreferenceManager.setDefaultValues(this, R.xml.preferences, true); // !?!?
    }

}
