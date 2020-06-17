package com.flowz.motionlayoutexample.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.flowz.motionlayoutexample.R;

public class ViewPagerExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        ViewPager myViewPager = findViewById(R.id.my_view_pager);

        myViewPager.setAdapter(new CustomPagerAdapter(this));

    }
}
