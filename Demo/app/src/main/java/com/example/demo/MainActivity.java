package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
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

import com.example.demo.word.word;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;

import com.example.demo.databinding.ActivityMainBinding;
import com.google.gson.reflect.TypeToken;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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

        //test json
        String dataJSON = loadJSONFromAsset("wordjson.json");
        Gson gson = new Gson();

        Type listType = new TypeToken<List<word>>(){}.getType();
        List<word> vocab = gson.fromJson(dataJSON, listType);

        binding.txtHoTen.setText(vocab.get(0).id);
    }

    private String loadJSONFromAsset(String filename) {
        String json;
        try {
            AssetManager assetManager = getAssets();
            InputStream inputStream = assetManager.open(filename);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            inputStream.close();
            json = stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return json;
    }
}