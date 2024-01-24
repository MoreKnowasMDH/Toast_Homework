package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView texty;
    Button buttonly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texty = findViewById(R.id.text);
        buttonly = findViewById(R.id.button);
        buttonly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texty.setText("Spoooky~~~");
                texty.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, "Hello, ", Toast.LENGTH_LONG).show();
            }
        });
    }
}
}