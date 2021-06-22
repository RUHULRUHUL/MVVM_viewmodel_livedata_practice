package com.ruhul.mvvmpractice;

import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MyviewModel extends ViewModel {
    private String random_data;

    public String getrendomvalue()
    {
        Log.d("getvalue", "getrandomvalue");
        if (random_data == null)
        {
            createrandomvalue();

        }

        return random_data;
    }

    public void createrandomvalue()
    {
        Log.d("getrendomenumber","create random value");
        Random random = new Random();
        random_data = String.valueOf(random.nextInt(10-1));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d("onCleared","data clear viewmodel");

    }
}

