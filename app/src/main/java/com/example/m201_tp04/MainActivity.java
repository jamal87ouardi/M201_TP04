package com.example.m201_tp04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalculer = findViewById(R.id.calc);

        btnCalculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editA = findViewById(R.id.edit_a);
                EditText editB = findViewById(R.id.edit_b);
                EditText editC = findViewById(R.id.edit_c);

                double a = Double.parseDouble(editA.getText().toString());
                double b = Double.parseDouble(editB.getText().toString());
                double c = Double.parseDouble(editC.getText().toString());

                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("varA",a);
                i.putExtra("varB",b);
                i.putExtra("varC",c);
                startActivity(i);









            }
        });


    }
}