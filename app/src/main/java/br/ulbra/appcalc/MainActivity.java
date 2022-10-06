package br.ulbra.appcalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


    public class MainActivity extends AppCompatActivity {
        EditText edtValor1, edtValor2;
        Button btnSomar, btnSubtracao, btnMult, btndiv;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            edtValor1 = findViewById(R.id.edtv1);
            edtValor2 = findViewById(R.id.edtv2);
            btnSomar = findViewById(R.id.btnSomar);
            btnSubtracao = findViewById(R.id.btnSub);
            btnMult = findViewById(R.id.btnMult);
            btndiv = findViewById(R.id.btndiv);

            btnSomar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double valor1, valor2, soma;
                    valor1 = Double.parseDouble(
                            edtValor1.getText().toString());

                    valor2 = Double.parseDouble(
                            edtValor2.getText().toString());

                    soma = valor1 + valor2;

                    Toast.makeText(MainActivity.this, "O Resultado é:" + soma,
                            Toast.LENGTH_LONG).show();


                }
            });
            btnSubtracao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double valor1, valor2, sub;

                    valor1 = Double.parseDouble(
                            edtValor1.getText().toString());

                    valor2 = Double.parseDouble(
                            edtValor2.getText().toString());

                    sub = valor1 - valor2;

                    Toast.makeText(MainActivity.this, "O Resultado é:" + sub,
                            Toast.LENGTH_LONG).show();


                }
            });
            btnMult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double valor1, valor2, mult;

                    valor1 = Double.parseDouble(
                            edtValor1.getText().toString());

                    valor2 = Double.parseDouble(
                            edtValor2.getText().toString());

                    mult = valor1 * valor2;

                    Toast.makeText(MainActivity.this, "O Resultado é:" + mult,
                            Toast.LENGTH_LONG).show();


                }
            });
            btndiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double valor1, valor2, div;

                    valor1 = Double.parseDouble(
                            edtValor1.getText().toString());

                    valor2 = Double.parseDouble(
                            edtValor2.getText().toString());

                    div = valor1 / valor2;

                    Toast.makeText(MainActivity.this, "O Resultado é:" + div,
                            Toast.LENGTH_LONG).show();


                }
            });
        }
    }






