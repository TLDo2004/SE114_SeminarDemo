package com.example.eventlistener;

import static android.net.Uri.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtView = findViewById(R.id.txtView);
        Intent intent = new Intent(Intent.ACTION_VIEW, parse("https://student.uit.edu.vn"));

        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Đã đăng ký", Toast.LENGTH_SHORT).show();
            }
        });

        txtView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "Đang mở trang web", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                return true;
            }
        });
    }
}