package com.cyberteam.pchatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    private Button nRegBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        nRegBtn = (Button) findViewById(R.id.start_reg_btn);

        nRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg_Intent = new Intent(StartActivity.this, RegisterActivity.class);
                startActivity(reg_Intent);
            }
        });
    }
}
