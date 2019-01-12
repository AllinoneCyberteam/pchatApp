package com.cyberteam.pchatapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    private Button nRegBtn;
    private Button nLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        nRegBtn = (Button) findViewById(R.id.start_reg_btn);
        nLoginBtn = (Button) findViewById(R.id.start_login_btn);

        nRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg_Intent = new Intent(StartActivity.this, RegisterActivity.class);
                startActivity(reg_Intent);
            }
        });

      nLoginBtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent login_Intent = new Intent(StartActivity.this, LoginActivity.class);
              startActivity(login_Intent);
          }
      });
    }
}
