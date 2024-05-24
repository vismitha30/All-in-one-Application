package com.example.all_in_one;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class LoginMenu extends AppCompatActivity {
    TextView textView;
    Button offlineButton, emailButton, gmailButton, otpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_menu);
        textView = findViewById(R.id.textView2);
        emailButton = findViewById(R.id.button51);


        YoYo.with(Techniques.RollIn).duration(1000).repeat(0).playOn(textView);
        YoYo.with(Techniques.RotateInUpRight).duration(2000).repeat(0).playOn(emailButton);




        emailButton.setOnClickListener(v -> {
            Intent intent = new Intent(LoginMenu.this, EmailLoginPage.class);
            startActivity(intent);
            finish();
        });


    }
}