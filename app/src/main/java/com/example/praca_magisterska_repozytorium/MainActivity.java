package com.example.praca_magisterska_repozytorium;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_wifi,button_bt;
    TextView text1;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_wifi = findViewById(R.id.button);
        button_bt = findViewById(R.id.button2);
        text1 = findViewById(R.id.textView);

        text1.setText("Welcome to my App");
        button_bt.setText("Connect by Bluetooth");
        button_wifi.setText("Connect by Wi-Fi");

        button_bt.setOnClickListener(v -> {


            Toast.makeText(MainActivity.this, "Connect", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, MainActivity_BT.class);
            startActivity(intent);
        });

        button_wifi.setOnClickListener(v -> {


            Toast.makeText(MainActivity.this, "Connect", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, MainActivity_WiFi.class);
            startActivity(intent);
        });
    }
}