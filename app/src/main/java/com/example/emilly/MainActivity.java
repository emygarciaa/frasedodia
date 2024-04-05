package com.example.emilly;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }


    public void Sortear(View view){
        int resultado = new Random().nextInt(4);

        if(resultado == 0){
            TextView textResultado = findViewById(R.id.textResultado);
            textResultado.setText("Não desista dos seus sonhos!");
        } else if(resultado == 1){
            TextView textResultado = findViewById(R.id.textResultado);
            textResultado.setText("Seja você mesmo!");
        } else if(resultado == 2){
            TextView textResultado = findViewById(R.id.textResultado);
            textResultado.setText("Você é incrível!");
        } else if(resultado == 3){
            TextView textResultado = findViewById(R.id.textResultado);
            textResultado.setText("A persistência é o caminho do êxito.");
        } else if(resultado == 4){
            TextView textResultado = findViewById(R.id.textResultado);
            textResultado.setText("Seja a mudança que você deseja ver no mundo.");
        }


    }

}