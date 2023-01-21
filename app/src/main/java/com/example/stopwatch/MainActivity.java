package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Chronometer;
import android.widget.Button;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    Chronometer chronometer;
    Button start, stop, hold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer = (Chronometer) findViewById(R.id.chronometer);
        start = (Button) findViewById(R.id.startbutton);
        hold = (Button) findViewById(R.id.holdbutton);
        stop = (Button) findViewById(R.id.stopbutton);


        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                chronometer.start();
            }
        });

        hold.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                chronometer.stop();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                chronometer.setBase(SystemClock.elapsedRealtime());
            }
        });
    }
}