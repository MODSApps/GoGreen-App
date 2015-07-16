package org.example.sudoku;

/**
 * Created by Alissa on 7/12/2015.
 */
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;

public class TripMaterials extends Activity {
    private static final String TAG="Go Green";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "materials screen");
        setContentView(R.layout.trip_materials);
    }
}
