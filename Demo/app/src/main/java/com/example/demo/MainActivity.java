package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoNoiSinh = findViewById(R.id.autoNoiSinh);
        String[] arrTinhThanh = getResources().getStringArray(R.array.arrTinhThanh);
        ArrayAdapter adapterTT = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrTinhThanh
        );
        autoNoiSinh.setAdapter(adapterTT);

        EditText edtMSSV = findViewById(R.id.edtMSSV);
        edtMSSV.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    if (edtMSSV.getText().length() != 8) {
                        Toast.makeText(getApplicationContext(), "MSSV phải có đúng 8 kí tự", Toast.LENGTH_SHORT).show();
                    }
                }
                return false;
            }
        });

        CheckedTextView cktxtIT001 = findViewById(R.id.cktxtIT001);
        CheckedTextView cktxtIT002 = findViewById(R.id.cktxtIT002);
        CheckedTextView cktxtIT003 = findViewById(R.id.cktxtIT003);
        cktxtIT001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean ischeck = cktxtIT001.isChecked();
                cktxtIT001.setChecked(!ischeck);
            }
        });
        cktxtIT002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean ischeck = cktxtIT002.isChecked();
                cktxtIT002.setChecked(!ischeck);
            }
        });
        cktxtIT003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean ischeck = cktxtIT003.isChecked();
                cktxtIT003.setChecked(!ischeck);
            }
        });

        Button btnDK = findViewById(R.id.btnDK);
        btnDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Đã đăng ký", Toast.LENGTH_SHORT).show();
            }
        });
    }
}