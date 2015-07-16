package org.example.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Recycling extends Activity implements View.OnClickListener{
    private static final String TAG="Go Green";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Rec at Mods");
        setContentView(R.layout.rec_at_mods);
        View energy = findViewById(R.id.back_rec_button);
        energy.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.back_rec_button:
                finish();
                break;
        }
    }
}
