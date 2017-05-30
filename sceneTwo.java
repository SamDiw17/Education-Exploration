package com.example.samdi.educationexploration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class sceneTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_two);
    }
    public void start(View v){
        Log.i("buton click", "buton click");
        Intent toSceneThree = new Intent(getApplicationContext(), sceneThree.class);
        startActivity(toSceneThree);
    }

}
