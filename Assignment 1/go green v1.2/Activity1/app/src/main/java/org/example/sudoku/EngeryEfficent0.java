package org.example.sudoku;

/**
 * Created by Alissa on 7/13/2015.
 */

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

public class EngeryEfficent0 extends Activity implements View.OnClickListener {
    private static final String TAG="Go Green";

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Energy Efficency Screen");
        setContentView(R.layout.outside);
        View energy = findViewById(R.id.door_button);
        energy.setOnClickListener(this);

    }


    public void onClick(View v){
        switch (v.getId()) {
            case R.id.door_button:
                Intent i = new Intent(this,EnergyEfficient.class);
                startActivity(i);
                break;
        }
    }
}
