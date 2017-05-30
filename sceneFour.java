package com.example.samdi.educationexploration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class sceneFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_four);
    }

    public void start(View v){
        Log.i("buton click", "buton click");
        Intent toSceneFive = new Intent(getApplicationContext(), sceneFive.class);
        startActivity(toSceneFive);
    }
}
