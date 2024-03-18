package com.example.vidu_edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtNhapTK, edtNhapMK;
        edtNhapTK = findViewById(R.id.edt_NhapTK);
        edtNhapMK = findViewById(R.id.edt_NhapMK);
        String TK, MK;
        TK= edtNhapTK.getText().toString();
        MK= edtNhapMK.getText().toString();
    }
}