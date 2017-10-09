package com.example.anastasiaafanasyeva.sendingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String user = "Кот";
        String gift = "дырку от бублика";

        Intent intent = getIntent();
        user = intent.getStringExtra("username");
        gift = intent.getStringExtra("gift");

        TextView infoTextView = (TextView)findViewById(R.id.textView);
        infoTextView.setText(user + " gives you " + gift);
    }
}
