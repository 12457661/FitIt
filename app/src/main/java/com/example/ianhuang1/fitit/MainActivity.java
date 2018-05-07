package com.example.ianhuang1.fitit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button stepsActivityBtn = (Button)findViewById(R.id.stepsActivityBtn);
        stepsActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), StepsActivity.class);
                startActivity(startIntent);
            }
        });

        Button heartRateActivityBtn = (Button)findViewById(R.id.heartRateActivityBtn);
        heartRateActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), HeartRateActivity.class);
                startActivity(startIntent);
            }
        });

        Button profileActivityBtn = (Button)findViewById(R.id.profileActivityBtn);
        profileActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(startIntent);
            }
        });
    }
}

