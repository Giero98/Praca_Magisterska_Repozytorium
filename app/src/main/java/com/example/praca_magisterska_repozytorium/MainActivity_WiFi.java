package com.example.praca_magisterska_repozytorium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_WiFi extends AppCompatActivity {

    Button button_back;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_wi_fi);

        button_back = findViewById(R.id.button3);
        text1 = findViewById(R.id.textView2);

        text1.setText("Good Job!\n" +
                "You are connected by Wi-Fi.");
        button_back.setText("Disconnect");

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity_WiFi.this, "Disconnect", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity_WiFi.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}