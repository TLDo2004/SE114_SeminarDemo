package com.example.vidu_edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText ed1, ed2;


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

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
                edtNhapTK.setText("");
                edtNhapMK.setText("");
                // Ẩn bàn phím ảo
                InputMethodManager imm =
                        (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
            }
        });

        ed1 = findViewById(R.id.edt_NhapTK);
        ed1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.e("OnClick","Nhap tai khoan.");
            }
        });

        ed2 = findViewById(R.id.edt_NhapMK);
        ed2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.e("OnClick","Nhap mat khau.");
            }
        });

        edtNhapMK.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    // Khi người dùng nhấn "Done" trên bàn phím
                    Toast.makeText(getApplicationContext(), "Người dùng đã nhấn 'Done'",
                            Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });


        edtNhapMK.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Hành động trước khi văn bản thay đổi
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Hành động khi văn bản đang thay đổi
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Hành động sau khi văn bản đã thay đổi
            }
        });


    }
}