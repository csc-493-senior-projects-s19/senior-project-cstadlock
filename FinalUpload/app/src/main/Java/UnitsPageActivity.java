package com.tadlockc.ffbearmory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UnitsPageActivity extends AppCompatActivity {

    // This is just declaring all the buttons for coding with them below.
    Button button_series_ff1;
    Button button_series_ff2;
    Button button_series_ff3;
    Button button_series_ff4;
    Button button_series_ff5;
    Button button_series_ff6;
    Button button_series_ff7;
    Button button_series_ff8;
    Button button_series_ff9;
    Button button_series_ff10;
    Button button_series_ff11;
    Button button_series_ff12;
    Button button_series_ff13;
    Button button_series_ff14;
    Button button_series_ff15;
    Button button_series_fftactics;
    Button button_series_fftype0;
    Button button_series_ffbe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units_page);

        // FF1
        button_series_ff1 = (Button) findViewById(R.id.button_series_ff1);
        button_series_ff1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFF1 = new Intent(UnitsPageActivity.this, SelectionSeriesFF1.class);
                startActivity(intentSelectionSeriesFF1);
            }
        });

        // FF2
        button_series_ff2 = (Button) findViewById(R.id.button_series_ff2);
        button_series_ff2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFF2 = new Intent(UnitsPageActivity.this, SelectionSeriesFF2.class);
                startActivity(intentSelectionSeriesFF2);
            }
        });

        // FF3
        button_series_ff3 = (Button) findViewById(R.id.button_series_ff3);
        button_series_ff3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFF3 = new Intent(UnitsPageActivity.this, SelectionSeriesFF3.class);
                startActivity(intentSelectionSeriesFF3);
            }
        });

        // FF4
        button_series_ff4 = (Button) findViewById(R.id.button_series_ff4);
        button_series_ff4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFF4 = new Intent(UnitsPageActivity.this, SelectionSeriesFF4.class);
                startActivity(intentSelectionSeriesFF4);
            }
        });

        // FF5
        button_series_ff5 = (Button) findViewById(R.id.button_series_ff5);
        button_series_ff5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFF5 = new Intent(UnitsPageActivity.this, SelectionSeriesFF5.class);
                startActivity(intentSelectionSeriesFF5);
            }
        });

        // FF6
        button_series_ff6 = (Button) findViewById(R.id.button_series_ff6);
        button_series_ff6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFF6 = new Intent(UnitsPageActivity.this, SelectionSeriesFF6.class);
                startActivity(intentSelectionSeriesFF6);
            }
        });

        // FF7
        button_series_ff7 = (Button) findViewById(R.id.button_series_ff7);
        button_series_ff7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFF7 = new Intent(UnitsPageActivity.this, SelectionSeriesFF7.class);
                startActivity(intentSelectionSeriesFF7);
            }
        });

        // FF8
        button_series_ff8 = (Button) findViewById(R.id.button_series_ff8);
        button_series_ff8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFF8 = new Intent(UnitsPageActivity.this, SelectionSeriesFF8.class);
                startActivity(intentSelectionSeriesFF8);
            }
        });

        // FF9
        button_series_ff9 = (Button) findViewById(R.id.button_series_ff9);
        button_series_ff9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFF9 = new Intent(UnitsPageActivity.this, SelectionSeriesFF9.class);
                startActivity(intentSelectionSeriesFF9);
            }
        });

        // FF10
        button_series_ff10 = (Button) findViewById(R.id.button_series_ff10);
        button_series_ff10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFF10 = new Intent(UnitsPageActivity.this, SelectionSeriesFF10.class);
                startActivity(intentSelectionSeriesFF10);
            }
        });

        // FF11
        button_series_ff11 = (Button) findViewById(R.id.button_series_ff11);
        button_series_ff11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFF11 = new Intent(UnitsPageActivity.this, SelectionSeriesFF11.class);
                startActivity(intentSelectionSeriesFF11);
            }
        });

        // FF12
        button_series_ff12 = (Button) findViewById(R.id.button_series_ff12);
        button_series_ff12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFF12 = new Intent(UnitsPageActivity.this, SelectionSeriesFF12.class);
                startActivity(intentSelectionSeriesFF12);
            }
        });

        // FF13
        button_series_ff13 = (Button) findViewById(R.id.button_series_ff13);
        button_series_ff13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFF13 = new Intent(UnitsPageActivity.this, SelectionSeriesFF13.class);
                startActivity(intentSelectionSeriesFF13);
            }
        });

        // FF14
        button_series_ff14 = (Button) findViewById(R.id.button_series_ff14);
        button_series_ff14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFF14 = new Intent(UnitsPageActivity.this, SelectionSeriesFF14.class);
                startActivity(intentSelectionSeriesFF14);
            }
        });

        // FF15
        button_series_ff15 = (Button) findViewById(R.id.button_series_ff15);
        button_series_ff15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFF15 = new Intent(UnitsPageActivity.this, SelectionSeriesFF15.class);
                startActivity(intentSelectionSeriesFF15);
            }
        });

        // FF Tactics
        button_series_fftactics = (Button) findViewById(R.id.button_series_fftactics);
        button_series_fftactics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFFTactics = new Intent(UnitsPageActivity.this, SelectionSeriesFFTactics.class);
                startActivity(intentSelectionSeriesFFTactics);
            }
        });

        // FF Type 0
        button_series_fftype0 = (Button) findViewById(R.id.button_series_fftype0);
        button_series_fftype0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFFType0 = new Intent(UnitsPageActivity.this, SelectionSeriesFFType0.class);
                startActivity(intentSelectionSeriesFFType0);
            }
        });

        // FFBE
        button_series_ffbe = (Button) findViewById(R.id.button_series_ffbe);
        button_series_ffbe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectionSeriesFFBE = new Intent(UnitsPageActivity.this, SelectionSeriesFFBE.class);
                startActivity(intentSelectionSeriesFFBE);
            }
        });


    }
}
