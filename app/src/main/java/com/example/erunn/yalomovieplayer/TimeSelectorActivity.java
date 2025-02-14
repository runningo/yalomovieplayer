package com.example.erunn.yalomovieplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by erunn on 2017-09-26.
 */

public class TimeSelectorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_timeselector);

        Button timeButton = (Button)findViewById(R.id.button4);

        timeButton.setOnClickListener(listener);
        timeButton.setOnClickListener(listener);
        timeButton.setOnClickListener(listener);

        TextView timeTitle = (TextView)findViewById(R.id.select_time_textview);

        SharedPrefUtil sharedPrefUtil = new SharedPrefUtil(TimeSelectorActivity.this);
        switch (sharedPrefUtil.getSharedTest()){
            case "korean" :
                timeTitle.setText(R.string.timeTitle);
                break;
            case "english" :
                timeTitle.setText(R.string.etimeTitle);
                break;
            case "china" :
                timeTitle.setText(R.string.ctimeTitle);
                break;
        }



    }

    private View.OnClickListener listener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()){
                case  R.id.button4 :
                    Intent toTime = new Intent(TimeSelectorActivity.this, WaitActivity.class);
                    startActivity(toTime);
                    finish();
                    break;
                case R.id.button5 :
                    break;


                default:
                    break;
            }
        }
    };
}
