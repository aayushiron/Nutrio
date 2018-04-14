package com.example.aayushiron.nutrio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextBox extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_box);
        t = findViewById(R.id.textView2);
        t.setText(TextScanner.words);
    }
}
