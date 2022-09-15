package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] Array={"Lahore","Karachi","Multan",
            "Lahore",
            "Karachi","Multan","Lahore",
            "Karachi","Multan","Lahore","Karachi",
            "Multan","Lahore","Karachi","Multan","Lahore","Karachi","Multan","Lahore","Karachi","Multan","Lahore","Karachi","Multan","Lahore","Karachi","Multan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,Array);
        listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Clicked" ,Toast.LENGTH_SHORT).show();
            }
        });    }
}