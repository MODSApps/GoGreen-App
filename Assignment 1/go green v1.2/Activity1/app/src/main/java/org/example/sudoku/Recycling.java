package org.example.sudoku;

import android.os.Bundle;
import android.util.Log;
import android.app.Activity;

public class Recycling extends Activity{
    private static final String TAG="Go Green";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Rec at Mods");
        setContentView(R.layout.rec_at_mods);
    }

}
