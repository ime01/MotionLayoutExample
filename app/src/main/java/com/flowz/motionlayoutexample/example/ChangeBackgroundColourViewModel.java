package com.flowz.motionlayoutexample.example;

import com.flowz.motionlayoutexample.R;

import androidx.lifecycle.ViewModel;

public class ChangeBackgroundColourViewModel extends ViewModel {

//    String backgroundColor = "green";

    int c1 = 0;
    int c2 = 1;
    int c3 = 2;

    public ChangeBackgroundColourViewModel(){
        if (c1 ==0 && c2 ==1 && c3==2){
            c1 = R.color.colorPrimaryDark;
            c2 = R.color.white;
            c3 = R.color.design_default_color_primary_dark;

        }
    }
//    public int getColor2(){
//        if (c2 ==1){
//            c2 = R.color.colorAccent;
//        }return c2;
//    }
//
//    public int getColor3(){
//        if (c3 ==2){
//            c3 = R.color.design_default_color_on_secondary;
//        }return c3;
//    }




}
