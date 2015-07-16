package org.example.sudoku;


import android.os.Bundle;
import android.util.Log;
import android.app.Activity;

public class HouseGarage extends Activity{
    private static final String TAG="Go Green";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "house garage");
        setContentView(R.layout.house_garage);
    }

}

