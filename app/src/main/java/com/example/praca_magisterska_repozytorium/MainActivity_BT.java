package com.example.praca_magisterska_repozytorium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_BT extends AppCompatActivity {

    Button button_back;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bt);

        button_back = findViewById(R.id.button4);
        text1 = findViewById(R.id.textView3);

        text1.setText("Good Job!\n" +
                "You are connected by Bluetooth.");
        button_back.setText("Disconnect");

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity_BT.this, "Disconnect", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity_BT.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}