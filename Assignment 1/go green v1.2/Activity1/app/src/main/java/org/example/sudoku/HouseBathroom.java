package org.example.sudoku;

/**
 * Created by Alissa on 7/13/2015.
 */
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;

public class HouseBathroom extends Activity {
    private static final String TAG="Go Green";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "house bedroom");
        setContentView(R.layout.house_bathroom);
    }
}
