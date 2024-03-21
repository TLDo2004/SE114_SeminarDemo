package com.example.vidu_autocompletetext;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] arrTinhThanh = getResources().getStringArray(R.array.arrTinhThanh);
        ArrayAdapter adapterTT = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrTinhThanh);
        AutoCompleteTextView autoTinhThanh = findViewById(R.id.autoTinhThanh);
        autoTinhThanh.setAdapter(adapterTT);

        String[] arrDanToc =getResources().getStringArray(R.array.arrDanToc);
        ArrayAdapter adapterDT = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrDanToc);
        AutoCompleteTextView autoDanToc = findViewById(R.id.autoDanToc);
        autoDanToc.setAdapter(adapterDT);

        autoCompleteTextView = findViewById(R.id.autoTinhThanh);
        autoCompleteTextView.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    // Khi TextView nhận focus
                    Log.e("OnFocusChangeListener",
                            "Đã nhận focus trên autoCompleteTextView tỉnh thành!");
                } else {
                    // Khi TextView mất focus
                    Log.e("OnFocusChangeListener",
                            "Đã mất focus trên autoCompleteTextView tỉnh thành!");
                }
            }
        });




    }
}