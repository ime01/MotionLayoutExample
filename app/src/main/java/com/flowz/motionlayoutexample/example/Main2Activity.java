package com.flowz.motionlayoutexample.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.flowz.motionlayoutexample.R;

public class Main2Activity extends AppCompatActivity{
    TextView showNum;
    Button getRandomNum;
    private String TAG = this.getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        showNum = findViewById(R.id.showNum);
        getRandomNum = findViewById(R.id.getRandomNum);


//        MainActivityViewModel myGenerator = new MainActivityViewModel();

        //getting View Model
        final MainActivityViewModel vModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);

        final LiveData <String> myNumber = vModel.getNumber();

        myNumber.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                showNum.setText(s);
                Log.i(TAG, "Data updated on screen");
            }
        });

        getRandomNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               vModel.createRandomNumber();
            }
        });

    }

}
