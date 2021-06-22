package com.ruhul.mvvmpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private TextView randomenumber_txt;
    private String randomenumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomenumber_txt=findViewById(R.id.randomevaluprint_id);

        MyviewModel myviewModel = new ViewModelProvider(this).get(MyviewModel.class);
        randomenumber=myviewModel.getrendomvalue();
        randomenumber_txt.setText("Rendom number set: "+ String.valueOf(randomenumber));


    }

    /*

    public int Getrandomevalue()
    {


        Random random = new Random();
        randomenumber=random.nextInt(10-1);
        return randomenumber+1;

    }

     */
}