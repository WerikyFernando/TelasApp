package com.example.aluno.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button sobre;
    private Button Lab1;
    private Button Lab2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sobre = (Button) findViewById(R.id.buttonsobre);
        Lab1 = (Button) findViewById(R.id.buttonLab1);
        Lab2 = (Button) findViewById(R.id.buttonLab2);


        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Indo para a outra tela", Toast.LENGTH_SHORT).show();

                //comando para chamar outra tela

                startActivity(new Intent(MainActivity.this, SobreActivity.class));
            }
        });

        Lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Indo para a outra tela", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Lab1Activity.class));
            }
        });

        Lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Indo para a outra tela", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Lab2Activity.class));
            }
        });

    }
}
