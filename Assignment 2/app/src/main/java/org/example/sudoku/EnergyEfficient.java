package org.example.sudoku;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;



public class EnergyEfficient extends Activity implements View.OnClickListener{
    private static final String TAG="Go Green";

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Energy Efficency Screen");
        setContentView(R.layout.house);
        View energy = findViewById(R.id.garage_button);
        energy.setOnClickListener(this);
        View robot= findViewById(R.id.kitchen_button);
        robot.setOnClickListener(this);
        //View robo= findViewById(R.id.roof_button);
        //robo.setOnClickListener(this);
        View rob= findViewById(R.id.bedroom_button);
        rob.setOnClickListener(this);
        View robt= findViewById(R.id.bathroom_button);
        robt.setOnClickListener(this);
    }


    public void onClick(View v){
        switch (v.getId()) {
            case R.id.garage_button:
                Intent i = new Intent(this,HouseGarage.class);
                startActivity(i);
                break;
            case R.id.kitchen_button:
                Log.d(TAG,"kitchen");
                Intent h=new Intent(this,HouseKitchen.class);
                startActivity(h);
                break;
            case R.id.bedroom_button:
                Intent k = new Intent(this,HouseBedroom.class);
                startActivity(k);
                break;
            case R.id.bathroom_button:
                Intent p = new Intent(this,HouseBathroom.class);
                startActivity(p);
                break;
        }
    }
}

