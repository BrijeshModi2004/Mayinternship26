package com.example.mayinternship26;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class SplashActivity extends AppCompatActivity {

    ImageView image;

    SharedPreferences sp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sp = getSharedPreferences(ConstantSp.pref,MODE_PRIVATE);

        image=findViewById(R.id.splash_image);

        Glide.with(SplashActivity.this).asGif()
                .load("https://media.tenor.com/i6oIiEOUH5wAAAAj/talking-tom-%D0%B3%D0%BE%D0%B2%D0%BE%D1%80%D1%8F%D1%89%D0%B8%D0%B9-%D1%82%D0%BE%D0%BC.gif")
                .placeholder(R.mipmap.ic_launcher).into(image);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(sp.getString(ConstantSp.userid,"").equals("")){
                    Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);
                }

                else {
                    Intent intent = new Intent(SplashActivity.this,DashboardActivity.class);
                    startActivity(intent);
                }
            }

        },3000);

    }
}