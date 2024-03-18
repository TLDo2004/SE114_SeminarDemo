package com.example.checkedtextview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckedTextView cktxtIE101 = findViewById(R.id.cktxtIE101);
        CheckedTextView cktxtIE103 = findViewById(R.id.cktxtIE103);
        CheckedTextView cktxtIE104 = findViewById(R.id.cktxtIE104);
        CheckedTextView cktxtIE105 = findViewById(R.id.cktxtIE105);
        CheckedTextView cktxtIE106 = findViewById(R.id.cktxtIE106);
        CheckedTextView cktxtIE108 = findViewById(R.id.cktxtIE108);
        CheckedTextView cktxtIS402 = findViewById(R.id.cktxtIS402);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        Button btnReset = findViewById(R.id.btnReset);

        cktxtIE101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cktxtIE101.isChecked()){
                    cktxtIE101.setChecked(false);
                    cktxtIE101.setTextColor(Color.BLACK);
                }
                else {
                    cktxtIE101.setChecked(true);
                    cktxtIE101.setTextColor(Color.RED);
                }
            }
        });
        cktxtIE103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cktxtIE103.isChecked()){
                    cktxtIE103.setChecked(false);
                    cktxtIE103.setTextColor(Color.BLACK);
                }
                else {
                    cktxtIE103.setChecked(true);
                    cktxtIE103.setTextColor(Color.RED);
                }
            }
        });
        cktxtIE104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cktxtIE104.isChecked()){
                    cktxtIE104.setChecked(false);
                    cktxtIE104.setTextColor(Color.BLACK);
                }
                else {
                    cktxtIE104.setChecked(true);
                    cktxtIE104.setTextColor(Color.RED);
                }
            }
        });
        cktxtIE105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cktxtIE105.isChecked()){
                    cktxtIE105.setChecked(false);
                    cktxtIE105.setTextColor(Color.BLACK);
                }
                else {
                    cktxtIE105.setChecked(true);
                    cktxtIE105.setTextColor(Color.RED);
                }
            }
        });
        cktxtIE106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cktxtIE106.isChecked()){
                    cktxtIE106.setChecked(false);
                    cktxtIE106.setTextColor(Color.BLACK);
                }
                else {
                    cktxtIE106.setChecked(true);
                    cktxtIE106.setTextColor(Color.RED);
                }
            }
        });
        cktxtIE108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cktxtIE108.isChecked()){
                    cktxtIE108.setChecked(false);
                    cktxtIE108.setTextColor(Color.BLACK);
                }
                else {
                    cktxtIE108.setChecked(true);
                    cktxtIE108.setTextColor(Color.RED);
                }
            }
        });
        cktxtIS402.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cktxtIS402.isChecked()){
                    cktxtIS402.setChecked(false);
                    cktxtIS402.setTextColor(Color.BLACK);
                }
                else {
                    cktxtIS402.setChecked(true);
                    cktxtIS402.setTextColor(Color.RED);
                }
            }
        });
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Đã lưu lựa chọn của bạn", Toast.LENGTH_SHORT).show();
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cktxtIE101.setChecked(false);
                cktxtIE101.setTextColor(Color.BLACK);
                cktxtIE103.setChecked(false);
                cktxtIE103.setTextColor(Color.BLACK);
                cktxtIE104.setChecked(false);
                cktxtIE104.setTextColor(Color.BLACK);
                cktxtIE105.setChecked(false);
                cktxtIE105.setTextColor(Color.BLACK);
                cktxtIE106.setChecked(false);
                cktxtIE106.setTextColor(Color.BLACK);
                cktxtIE108.setChecked(false);
                cktxtIE108.setTextColor(Color.BLACK);
                cktxtIS402.setChecked(false);
                cktxtIS402.setTextColor(Color.BLACK);
                Toast.makeText(getApplicationContext(), "Đã xoá tất cả lựa chọn", Toast.LENGTH_SHORT).show();
            }
        });
    }
}