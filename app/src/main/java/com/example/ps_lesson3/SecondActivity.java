package com.example.ps_lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lvDg;
    ArrayAdapter aaModule;
    ArrayList<DailyCA> C302;
    ArrayList<DailyCA> C347;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        lvDg = (ListView) this.findViewById(R.id.ListViewCAG);
        Intent i = getIntent();
        String module = i.getStringExtra(Intent.EXTRA_TEXT);
        C302 = new ArrayList<DailyCA>();
        C302.add(new DailyCA("C", "C302", 1));
        C302.add(new DailyCA("C", "C302", 2));
        C302.add(new DailyCA("B", "C302", 3));
        C347 = new ArrayList<DailyCA>();
        C347.add(new DailyCA("B", "C347", 1));
        C347.add(new DailyCA("C", "C347", 2));
        C347.add(new DailyCA("A", "C347", 3));
        if (module.equals("C302")) {
            aaModule = new DailyAdapter(this, R.layout.row, C302);
            lvDg.setAdapter(aaModule);
            lvDg.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    DailyCA selectedDg = C302.get(position);
                }
            });
        } else {
            aaModule = new DailyAdapter(this, R.layout.row, C347);
            lvDg.setAdapter(aaModule);
            lvDg.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    DailyCA selectedDg = C347.get(position);
                }
            });
        }
    }
}
