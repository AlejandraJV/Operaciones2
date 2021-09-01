package com.example.operaciones;
//Biblioteca de clases
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaro datos
    private EditText edit1, edit2;
    private TextView texto;

    //Ciclo de vida OnCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Busca elementos gráficos por id
        edit1 = (EditText)findViewById(R.id.et1);
        edit2 = (EditText)findViewById(R.id.et2);
        texto = (TextView)findViewById(R.id.tv);
    }
    //Suma dos números
    public void Suma(View view)
    {
        int num1 = Integer.parseInt(edit1.getText().toString());
        int num2 = Integer.parseInt(edit2.getText().toString());
        int resultado = num1 + num2;

        texto.setText("La suma es: " + resultado);
    }

    public void Resta(View view)
    {
        int num1 = Integer.parseInt(edit1.getText().toString());
        int num2 = Integer.parseInt(edit2.getText().toString());
        int resultado = num1 - num2;

        texto.setText("La resta es: " + resultado);
    }

    public void Multiplicacion(View view)
    {
        int num1 = Integer.parseInt(edit1.getText().toString());
        int num2 = Integer.parseInt(edit2.getText().toString());
        int resultado = num1 * num2;

        texto.setText("La multiplicación es: " + resultado);
    }

    public void Division(View view)
    {
        try
        {
            int num1 = Integer.parseInt(edit1.getText().toString());
            int num2 = Integer.parseInt(edit2.getText().toString());
            int resultado = num1 / num2;

            texto.setText("La división es: " + resultado);
        }
        catch(ArithmeticException exception) //Captura error
        {
            texto.setText("error: Ha dividido por 0");
        }


    }
}