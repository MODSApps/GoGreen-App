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

/**
 * Created by Alissa on 7/12/2015.
 */
public class Trip extends Activity implements View.OnClickListener{
    private static final String TAG="Go Green";

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG, "TRIP");
        setContentView(R.layout.trip);
        View energy = findViewById(R.id.trip_lyrics_button);
        energy.setOnClickListener(this);
        View robot= findViewById(R.id.trip_materials_button);
        robot.setOnClickListener(this);
    }



    public void onClick(View v){
        switch (v.getId()) {
            case R.id.trip_lyrics_button:
                Intent i = new Intent(this, TripLyrics.class);
                startActivity(i);
                break;
            case R.id.trip_materials_button:
                Log.d(TAG,"TRIP");
                Intent h=new Intent(this,TripMaterials.class);
                startActivity(h);
                break;
        }
    }
}
