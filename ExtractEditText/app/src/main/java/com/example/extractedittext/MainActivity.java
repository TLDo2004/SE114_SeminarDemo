package com.example.extractedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.inputmethodservice.ExtractEditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExtractEditText exedt1 = findViewById(R.id.exedt1);

    }
}