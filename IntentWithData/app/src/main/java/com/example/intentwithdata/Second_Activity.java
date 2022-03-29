package com.example.intentwithdata;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Second_Activity extends AppCompatActivity {

    TextView receiver_msg;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        receiver_msg = (TextView)findViewById(R.id.received_value_id);
        Intent intent = getIntent();
        String str = intent.getStringExtra("msg");
        receiver_msg.setText(str);
    }
}