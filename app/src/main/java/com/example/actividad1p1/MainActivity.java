package com.example.actividad1p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView imagen;
    private Button btnCambiarTxt;
    private Button btnResetTxt;
    private EditText etTexto;
    private TextView tvLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Asociamos a los componentes de xlm con java
    imagen= findViewById(R.id.img);
    tvLabel=findViewById(R.id.tvLabel);
    etTexto=findViewById(R.id.etNombre);
    btnCambiarTxt= findViewById(R.id.btnCambiar);
    btnResetTxt=findViewById(R.id.btnReset);

    //Cargamos la imágen en la variable del tipo ImageView
    imagen.setImageResource(R.drawable.auto);

    //Implementamos el click de este botón acá mismo (fuera del método onClick)
    btnCambiarTxt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            tvLabel.setText(etTexto.getText().toString());
        }
    });

    //El click de este botón está implementado en el método onClick
    btnResetTxt.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnReset){
            tvLabel.setText("Vehiculo eléctrico");
            Toast.makeText(getApplicationContext(),"Texto cambiado para: Vehiculo eléctrico", Toast.LENGTH_LONG).show();
        }
    }
}