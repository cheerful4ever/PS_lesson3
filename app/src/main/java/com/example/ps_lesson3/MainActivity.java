package com.example.ps_lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC347;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC347 = (TextView) findViewById(R.id.textViewC347);

        tvC347.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                DailyCA dailyGrade = new DailyCA("B", "C347", 1);
                Intent i = new Intent(MainActivity.this,
                        SecondActivity.class);

                i.putExtra("DailyCA", dailyGrade);
                startActivity(i);
            }});

    }
}
