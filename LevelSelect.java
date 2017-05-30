package com.example.samdi.educationexploration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LevelSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);
    }

    public void toZenMode(View v) {
        Log.i("buton click", "buton click");
        Intent toZen = new Intent(getApplicationContext(), ZenMode.class);
        startActivity(toZen);
    }

    public void toZenSubtract(View v) {
        Log.i("buton click", "buton click");
        Intent toSubtract = new Intent(getApplicationContext(), ZenModeSubtraction.class);
        startActivity(toSubtract);
    }

    public void toZenMultiply(View v) {
        Log.i("buton click", "buton click");
        Intent toMultiply = new Intent(getApplicationContext(), ZenModeMultiplication.class);
        startActivity(toMultiply);
    }

    public void toZenRandom (View v) {
        Log.i("buton click", "buton click");
        Intent toRandom = new Intent(getApplicationContext(), ZenModeRandom.class);
        startActivity(toRandom);
    }
}
