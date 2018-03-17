package com.example.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView auto_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auto_tv=(AutoCompleteTextView) findViewById(R.id.auto_tv);
        String[] arr={"上海宝山区","上海浦东区","上海闵行区","上海黄浦区","上海闸北区","北京中关村","北京海淀区","北京朝阳区","北京丰台区","北京东城区"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.ui_textview,arr);
        auto_tv.setAdapter(adapter);
    }
}
