package com.example.tp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Chronometer chronometer1;
    Button btnStart,btnEnd;
    RadioButton rdoCal,rdoTime;
    TimePicker timePicker1;
    CalendarView calendarView1;
    TextView tvYear,tvMonth, tvDay, tvHour, tvMinute;
    int sy,sm,sd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("시간 예약");

        btnStart=(Button)findViewById(R.id.btnStart);
        btnEnd=(Button)findViewById(R.id.btnEnd);
        chronometer1=(Chronometer)findViewById(R.id.chronometer1);
        rdoCal=(RadioButton)findViewById(R.id.rdoCal);
        rdoTime=(RadioButton)findViewById(R.id.rdoTime);
        timePicker1=(TimePicker)findViewById(R.id.timePicker1);
        calendarView1 =(CalendarView)findViewById(R.id.calendarView1);

        tvYear=(TextView)findViewById(R.id.tvYear);
        tvMonth=(TextView)findViewById(R.id.tvMonth);
        tvDay=(TextView)findViewById(R.id.tvDay);
        tvHour=(TextView)findViewById(R.id.tvHour);
        tvMinute=(TextView)findViewById(R.id.tvMinute);

        calendarView1.setVisibility(View.INVISIBLE);
        timePicker1.setVisibility(View.INVISIBLE);

        rdoCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendarView1.setVisibility(View.VISIBLE);
                timePicker1.setVisibility(View.INVISIBLE);
            }
        });
        rdoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendarView1.setVisibility(View.INVISIBLE);
                timePicker1.setVisibility(View.VISIBLE);
            }
        });
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer1.setBase(SystemClock.elapsedRealtime());
                chronometer1.start();
                chronometer1.setTextColor(Color.RED);
            }
        });
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer1.stop();
                chronometer1.setTextColor(Color.BLUE);

                tvYear.setText(Integer.toString(sy));
                tvMonth.setText(Integer.toString(sm));
                tvDay.setText(Integer.toString(sd));
                tvHour.setText(Integer.toString(timePicker1.getCurrentHour()));
                tvMinute.setText(Integer.toString(timePicker1.getCurrentMinute()));
            }
        });
        calendarView1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                sy=year;
                sm=month+ 1;
                sd=dayOfMonth;
            }
        });
    }
}
