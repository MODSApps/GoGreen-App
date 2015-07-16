package edu.fau.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    TextView tv_qq, tv_title;
    EditText et_answer;
    Button btn_submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv_qq = (TextView) findViewById(R.id.tv_qq);
        tv_title = (TextView) findViewById(R.id.tv_title);
        et_answer = (EditText) findViewById(R.id.editText);
        btn_submit = (Button) findViewById(R.id.btn_submit);

        tv_qq.setText("How are you feeling?");

//        btn_submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                checkAnswer(v);
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void checkAnswer(View view){
        if ( et_answer.getText().toString().equalsIgnoreCase("Good")){
            tv_title.setText("!!!This is correct!!!");
        }
        else {
            tv_title.setText("This is incorrect :(");
        }
    }
}
