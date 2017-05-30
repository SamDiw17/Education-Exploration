package com.example.samdi.educationexploration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
    }

    public void start(View v){
        Log.i("buton click", "buton click");
        Intent toSceneTwo = new Intent(getApplicationContext(), sceneTwo.class);
        startActivity(toSceneTwo);
    }

}
