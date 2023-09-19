package com.example.m201_tp04;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();

        double aa = i.getDoubleExtra("varA",0.0);
        double bb = i.getDoubleExtra("varB",0.0);
        double cc = i.getDoubleExtra("varC",0.0);

        double delta = (bb*bb) - (4*aa*cc);

        double Res1 = 0.0;
        double Res2 = 0.0;
        TextView res1 = findViewById(R.id.res1);
        TextView res2 = findViewById(R.id.res2);
        TextView res3 = findViewById(R.id.res3);

        if (delta > 0){
            Res1 = (-bb - Math.sqrt(delta))/ (2*aa);
            String R1 = String.format("%.2f", Res1);

            Res2 = (-bb + Math.sqrt(delta))/ (2*aa);
            String R2 = String.format("%.2f", Res2);


            String t1 = String.valueOf(R1);
            res1.setText(t1);
            String t2 = String.valueOf(R2);
            res2.setText(t2);
        }
        if (delta == 0){
            Res1 = -bb/ (2*aa);
            String R1 = String.format("%.2f", Res1);

            String t1 = String.valueOf(R1);
            res1.setText(t1);
        }
        if(delta < 0) {
            res3.setText("l'equation n'accept aucun solution!");
        }
        if(aa == 0){
            Res1 = -cc/bb;

            String R1 = String.format("%.2f", Res1);

            String t1 = String.valueOf(R1);
            res1.setText(t1);
        }

        TextView resultas = findViewById(R.id.delta);

        String d = String.valueOf(delta);
        resultas.setText(d);







    }
}