package com.flowz.motionlayoutexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.flowz.motionlayoutexample.example.Main2Activity;

public class MainActivity extends AppCompatActivity {

    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motion_layout);

        pic = findViewById(R.id.header_image);

        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openViewModelExmple = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(openViewModelExmple);
            }
        });
    }
}
