package org.example.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by Alissa on 7/12/2015.
 */

//DO THE BUTTONS AND ALL THE STUFF
public class Tip extends Activity implements View.OnClickListener {
    private static final String TAG="Go Green";

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG, "tips");
        setContentView(R.layout.tip);
        View energy = findViewById(R.id.waste_button);
        energy.setOnClickListener(this);
        //View robot= findViewById(R.id.trip_materials_button);
        //robot.setOnClickListener(this);
    }



    public void onClick(View v){
        switch (v.getId()) {
            case R.id.waste_button:
                Intent i = new Intent(this, Waste.class);
                startActivity(i);
                break;
        }
    }
 }
