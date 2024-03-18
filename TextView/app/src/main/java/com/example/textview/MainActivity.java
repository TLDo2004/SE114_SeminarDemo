package com.example.textview;

import static android.net.Uri.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtLink1 = findViewById(R.id.txtLink1);

        SpannableString str = new SpannableString("Visit facebook!!!");
        ClickableSpan linkYoutube = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(Intent.ACTION_VIEW, parse("https://www.facebook.com"));
                startActivity(intent);
            }
        };
        str.setSpan(linkYoutube, 0, str.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txtLink1.setText(str);
        txtLink1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}