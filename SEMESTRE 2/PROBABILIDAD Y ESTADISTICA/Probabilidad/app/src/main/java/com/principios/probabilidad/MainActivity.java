package com.principios.probabilidad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int EleccionUsuario=0;
    private Button BtnReset;
    private Button BtnCalcular;
    private Button BtnNumeroNuevo;
    private TextView TextResultado;
    private EditText TextNumeroNuevo;
    private RadioButton PrincipioAdicion;
    private RadioButton PrincipioMultiplicativo;
    private RadioButton PrincipioFactorial;
    public double Resultado = 0.0;
    public double NumNuevo = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PrincipioAdicion= findViewById(R.id.radioButton_Adicion);
        PrincipioMultiplicativo=findViewById(R.id.radioButton_Multiplicativo);
        PrincipioFactorial=findViewById(R.id.radioButton_factorial);
        BtnReset= findViewById(R.id.button2);
        BtnNumeroNuevo= findViewById(R.id.button_NuevoNum);
        TextResultado=findViewById(R.id.editTextTextPersonName2);
        TextNumeroNuevo=findViewById(R.id.editTextTextPersonName);
        BtnNumeroNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Eleccion();
            }
        });
        BtnReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                resetAll();
            }
        });
        TextNumeroNuevo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                TextNumeroNuevo.setText("");
            }
        });
    }
    public double factorial (double a){
        double fact=1;
        while ( a!=0) {
            fact=fact*a; a--;
        }
        return fact;
    }
    public void Eleccion(){
        NumNuevo = Double.parseDouble(String.valueOf(TextNumeroNuevo.getText()));
        if (PrincipioAdicion.isChecked()){
            EleccionUsuario=1;
        }
        if (PrincipioMultiplicativo.isChecked()){
            EleccionUsuario=2;
        }
        if (PrincipioFactorial.isChecked()){
            EleccionUsuario=3;
        }
        switch (EleccionUsuario) {
            case 1:
                Resultado += NumNuevo;
                break;
            case 2:
                if (Resultado==0){
                    Resultado=1;
                }
                Resultado=Resultado*NumNuevo;
                break;
            case 3:
                Resultado=factorial(NumNuevo);
                break;
            default : //El usuario no selecciono principio
                break;
        }
        TextResultado.setText(String.valueOf(Resultado));
    }
    public void resetAll(){
        TextResultado.setText("0");
        TextNumeroNuevo.setText("0");
        Resultado = 0.0;
        NumNuevo = 0.0;
    }
}