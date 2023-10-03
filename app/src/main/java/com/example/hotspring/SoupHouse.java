package com.example.hotspring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoupHouse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soup_house);

        Button PrivateRoom1 = findViewById(R.id.PrivateRoom1);
        PrivateRoom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建一个 Intent 来启动 HomePageActivity
                Intent intent = new Intent(SoupHouse.this, PrivateRoom.class);
                startActivity(intent);
            }
        }); //當按下包廂鍵就會跳轉到PrivateRoom畫面
    }
}