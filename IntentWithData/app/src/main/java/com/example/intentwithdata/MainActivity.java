package com.example.intentwithdata;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button jodd;
        jodd = findViewById(R.id.jodd);
        EditText notjodd;
        notjodd = findViewById(R.id.notjodd);

        jodd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                String str = notjodd.getText().toString();
                Intent intent1 = new Intent(getApplicationContext(), Second_Activity.class);

                intent1.putExtra("msg", str);

                startActivity(intent1);
            }
        });
        }
    }
