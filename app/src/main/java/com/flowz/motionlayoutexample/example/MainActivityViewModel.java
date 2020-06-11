package com.flowz.motionlayoutexample.example;

import android.util.Log;

import java.util.Random;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private String TAG = this.getClass().getSimpleName();
    private MutableLiveData<String> myRandomNumber;

    public MutableLiveData<String> getNumber(){
        Log.i(TAG, "getNumber ");

        if (myRandomNumber==null){

            myRandomNumber = new MutableLiveData<>();

            createRandomNumber();
        }
        return myRandomNumber;
    }

    public void createRandomNumber() {

        Log.i(TAG, "createRandomNumber");
        Random myrandomNum = new Random();

//        myRandomNumber = "Random Number : " + (myrandomNum.nextInt(100-1)+1);
        myRandomNumber.setValue("Random Number : " + (myrandomNum.nextInt(100-1)+1));

    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG, "ViewModel is Destroyed ");
    }
}
