package com.example.samdi.educationexploration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class ZenModeRandom extends AppCompatActivity {

    int ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zen_mode_random);
        Random inGen = new Random();
        int probType = inGen.nextInt(3);
        int r1 = inGen.nextInt(10);
        int r2 = inGen.nextInt(10);
        if (probType == 1){
            String p = "Tell me what " + r1 + " x " + r2 + " is, and I'll leave you alone!";
            TextView pPrint = (TextView) findViewById(R.id.EE_ZenLevel_Problem);
            pPrint.setText(p);
            ans = r1 * r2;
        }
        else if (probType == 2){
            String p = "Tell me what " + r1 + " + " + r2 + " is, and I'll leave you alone!";
            TextView pPrint = (TextView) findViewById(R.id.EE_ZenLevel_Problem);
            pPrint.setText(p);
            ans = r1 + r2;
        }
        else{
            if (r1 >= r2){
                String p = "Tell me what " + r1 + " - " + r2 + " is, and I'll leave you alone!";
                TextView pPrint = (TextView) findViewById(R.id.EE_ZenLevel_Problem);
                pPrint.setText(p);
                ans = r1 - r2;
            }
            else {
                String p = "Tell me what " + r2 + " - " + r1 + " is, and I'll leave you alone!";
                TextView pPrint = (TextView) findViewById(R.id.EE_ZenLevel_Problem);
                pPrint.setText(p);
                ans = r2 - r1;
            }
        }
    }

    public void checkIn(View v){
        TextView in = (TextView) findViewById(R.id.EE_ZenLevel_Input);
        TextView prob = (TextView) findViewById(R.id.EE_ZenLevel_Problem);
        int b = Integer.parseInt(in.getText().toString());
        if (ans == b){
            prob.setText("Correct!");
            Log.i("buton click", "buton click");
            Intent toSecondZen = new Intent(getApplicationContext(), ZenModeRandom.class);
            startActivity(toSecondZen);
        }
        else{
            prob.setText("Incorrect :(");
            Log.i("buton click", "buton click");
            Intent toLevSel = new Intent(getApplicationContext(), LevelSelect.class);
            startActivity(toLevSel);

        }
    }
}
