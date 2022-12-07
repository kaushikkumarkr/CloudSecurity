package com.example.cloud_security;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // For Create in main page
        TextView create = findViewById(R.id.Create);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openforget_password();
            }
        });
    }

    public void openforget_password()
    {
        Intent intent=new Intent(this,ForgotPassword1Activity.class);
        startActivity(intent);
    }
}