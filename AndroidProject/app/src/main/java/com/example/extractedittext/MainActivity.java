package com.example.extractedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.inputmethodservice.ExtractEditText;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.view.ViewGroup.LayoutParams;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tạo một ExtractEditText
        ExtractEditText extractEditText = new ExtractEditText(this);
        extractEditText.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        extractEditText.setHint("Nhập văn bản");
        extractEditText.requestFocus();

        // Thêm thành phần vào layout
        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        linearLayout.addView(extractEditText);

        extractEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Hành động trước khi văn bản thay đổi
                // Lấy văn bản hiện tại
                String currentText = s.toString();
                // Log văn bản hiện tại
                Log.d("BeforeTextChanged", "Văn bản hiện tại: " + currentText);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Hành động khi văn bản đang được thay đổi
                // Lấy văn bản mới
                String newText = s.toString();

                // Log văn bản mới
                Log.d("OnTextChanged", "Văn bản đang được thay đổi." + newText);
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Lấy văn bản mới
                String newText = s.toString();

                Toast.makeText(MainActivity.this, "Văn bản mới: " + newText, Toast.LENGTH_SHORT).show();

            }

        });

    }


}