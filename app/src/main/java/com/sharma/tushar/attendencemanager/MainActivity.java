package com.sharma.tushar.attendencemanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import com.sharma.tushar.attendencemanager.Data.AddSubject;
import com.sharma.tushar.attendencemanager.Data.SubjectAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.subject_list);
        SubjectAdapter adapter = new SubjectAdapter(MainActivity.this, null);
        listView.setAdapter(null);
        FloatingActionButton fab = findViewById(R.id.add_subject);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addSub = new Intent(MainActivity.this, AddSubject.class);
                startActivity(addSub);
            }
        });
    }
}
