package com.sharma.tushar.attendencemanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;

import java.text.SimpleDateFormat;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        int date = getDate();


    }

    private int getDate() {
        CalendarView calendarView = findViewById(R.id.cal_view);
        long curDate = calendarView.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddmmy");
        return Integer.parseInt(dateFormat.format(curDate));
    }
}
