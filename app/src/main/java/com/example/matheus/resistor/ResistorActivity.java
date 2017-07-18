package com.example.matheus.resistor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.example.matheus.resistor.R.id.radioGroup1;
import static com.example.matheus.resistor.R.id.radioGroup2;
import static com.example.matheus.resistor.R.id.radioGroup3;
import static com.example.matheus.resistor.R.id.radioGroup4;

public class ResistorActivity extends AppCompatActivity {

private float value, value2, value3, re;
private String value4;
private TextView resultadoFinal;
private TextView resultado, resultado2, resultado3, resultado4;
private Button botao;
private RadioGroup rg, rg2, rg3, rg4;
private RadioButton radioEscolhido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resistor);

        rg = (RadioGroup) findViewById(radioGroup1);
        rg2 = (RadioGroup) findViewById(radioGroup2);
        rg3 = (RadioGroup) findViewById(radioGroup3);
        rg4 = (RadioGroup) findViewById(radioGroup4);

        resultado = (TextView) findViewById(R.id.textView6);
        resultado2 = (TextView) findViewById(R.id.textView7);
        resultado3 = (TextView) findViewById(R.id.textView8);
        resultado4 = (TextView) findViewById(R.id.textView9);
        resultadoFinal = (TextView) findViewById(R.id.textView10);

        botao = (Button)findViewById(R.id.botao);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checked = rg.getCheckedRadioButtonId();
                switch (checked) {
                    case R.id.radio0:
                        radioEscolhido = (RadioButton) findViewById(checked);
                        resultado.setText(String.valueOf(value));
                        value = 0;
                        break;
                    case R.id.radio1:
                        value = 1;
                        radioEscolhido = (RadioButton) findViewById(checked);
                        resultado.setText(String.valueOf(value));
                        break;
                    case R.id.radio2:
                        value = 2;
                        radioEscolhido = (RadioButton) findViewById(checked);
                        resultado.setText(String.valueOf(value));
                        break;
                    case R.id.radio3:
                        value = 3;
                        radioEscolhido = (RadioButton) findViewById(checked);
                        resultado.setText(String.valueOf(value));
                        break;
                    case R.id.radio5:
                        value = 4;
                        radioEscolhido = (RadioButton) findViewById(checked);
                        resultado.setText(String.valueOf(value));
                        break;
                    case R.id.radio6:
                        value = 5;
                        radioEscolhido = (RadioButton) findViewById(checked);
                        resultado.setText(String.valueOf(value));
                        break;
                    case R.id.radio7:
                        value = 6;
                        radioEscolhido = (RadioButton) findViewById(checked);
                        resultado.setText(String.valueOf(value));
                        break;
                    case R.id.radio8:
                        value = 7;
                        radioEscolhido = (RadioButton) findViewById(checked);
                        resultado.setText(String.valueOf(value));
                        break;
                    case R.id.radio9:
                        value = 8;
                        radioEscolhido = (RadioButton) findViewById(checked);
                        resultado.setText(String.valueOf(value));
                        break;
                    case R.id.radio10:
                        value = 9;
                        radioEscolhido = (RadioButton) findViewById(checked);
                        resultado.setText(String.valueOf(value));
                        break;
                }
                int checked2 = rg2.getCheckedRadioButtonId();
                switch (checked2) {
                    case R.id.radio11:
                        radioEscolhido = (RadioButton) findViewById(checked2);
                        resultado2.setText(String.valueOf(value));
                        value2 = 0;
                        break;
                    case R.id.radio12:
                        value2 = 1;
                        radioEscolhido = (RadioButton) findViewById(checked2);
                        resultado2.setText(String.valueOf(value));
                        break;
                    case R.id.radio13:
                        value2 = 2;
                        radioEscolhido = (RadioButton) findViewById(checked2);
                        resultado2.setText(String.valueOf(value));
                        break;
                    case R.id.radio14:
                        value2 = 3;
                        radioEscolhido = (RadioButton) findViewById(checked2);
                        resultado2.setText(String.valueOf(value));
                        break;
                    case R.id.radio15:
                        value2 = 4;
                        radioEscolhido = (RadioButton) findViewById(checked2);
                        resultado2.setText(String.valueOf(value));
                        break;
                    case R.id.radio16:
                        value2 = 5;
                        radioEscolhido = (RadioButton) findViewById(checked2);
                        resultado2.setText(String.valueOf(value));
                        break;
                    case R.id.radio17:
                        value2 = 6;
                        radioEscolhido = (RadioButton) findViewById(checked2);
                        resultado2.setText(String.valueOf(value));
                        break;
                    case R.id.radio18:
                        value2 = 7;
                        radioEscolhido = (RadioButton) findViewById(checked2);
                        resultado2.setText(String.valueOf(value));
                        break;
                    case R.id.radio19:
                        value2 = 8;
                        radioEscolhido = (RadioButton) findViewById(checked2);
                        resultado2.setText(String.valueOf(value));
                        break;
                    case R.id.radio20:
                        value2 = 9;
                        radioEscolhido = (RadioButton) findViewById(checked2);
                        resultado2.setText(String.valueOf(value));
                        break;
                }
                int checked3 = rg3.getCheckedRadioButtonId();
                switch (checked3) {
                    case R.id.radio21:
                        radioEscolhido = (RadioButton) findViewById(checked3);
                        resultado3.setText(String.valueOf(value));
                        value3 = 0;
                        break;
                    case R.id.radio22:
                        value3 = 1;
                        radioEscolhido = (RadioButton) findViewById(checked3);
                        resultado3.setText(String.valueOf(value));
                        break;
                    case R.id.radio23:
                        value3 = 2;
                        radioEscolhido = (RadioButton) findViewById(checked3);
                        resultado3.setText(String.valueOf(value));
                        break;
                    case R.id.radio24:
                        value3 = 3;
                        radioEscolhido = (RadioButton) findViewById(checked3);
                        resultado3.setText(String.valueOf(value));
                        break;
                    case R.id.radio25:
                        value3 = 4;
                        radioEscolhido = (RadioButton) findViewById(checked3);
                        resultado3.setText(String.valueOf(value));
                        break;
                    case R.id.radio26:
                        value3 = 5;
                        radioEscolhido = (RadioButton) findViewById(checked3);
                        resultado3.setText(String.valueOf(value));
                        break;
                    case R.id.radio27:
                        value3 = 6;
                        radioEscolhido = (RadioButton) findViewById(checked3);
                        resultado3.setText(String.valueOf(value));
                        break;
                    case R.id.radio28:
                        value3 = 7;
                        radioEscolhido = (RadioButton) findViewById(checked3);
                        resultado3.setText(String.valueOf(value));
                        break;
                    case R.id.radio29:
                        value3 = 8;
                        radioEscolhido = (RadioButton) findViewById(checked3);
                        resultado3.setText(String.valueOf(value));
                        break;
                    case R.id.radio30:
                        value3 = 9;
                        radioEscolhido = (RadioButton) findViewById(checked3);
                        resultado3.setText(String.valueOf(value));
                        break;
                    case R.id.radio31:
                        value3 = -2;
                        radioEscolhido = (RadioButton) findViewById(checked3);
                        resultado3.setText(String.valueOf(value));
                        break;
                    case R.id.radio32:
                        value3 = -3;
                        radioEscolhido = (RadioButton) findViewById(checked3);
                        resultado3.setText(String.valueOf(value));
                        break;
                }
                int checked4 = rg4.getCheckedRadioButtonId();
                switch (checked4) {
                    case R.id.radio33:
                        radioEscolhido = (RadioButton) findViewById(checked4);
                        resultado4.setText(String.valueOf(value2));
                        value4 = "1";
                        break;
                    case R.id.radio34:
                        value4 = "2";
                        radioEscolhido = (RadioButton) findViewById(checked4);
                        resultado4.setText(String.valueOf(value2));
                        break;
                    case R.id.radio35:
                        value4 = "0.5";
                        radioEscolhido = (RadioButton) findViewById(checked4);
                        resultado4.setText(String.valueOf(value2));
                        break;
                    case R.id.radio36:
                        value4 = "0.25";
                        radioEscolhido = (RadioButton) findViewById(checked4);
                        resultado4.setText(String.valueOf(value2));
                        break;
                    case R.id.radio37:
                        value4 = "0.1";
                        radioEscolhido = (RadioButton) findViewById(checked4);
                        resultado4.setText(String.valueOf(value2));
                        break;
                    case R.id.radio38:
                        value4 = "0.05";
                        radioEscolhido = (RadioButton) findViewById(checked4);
                        resultado4.setText(String.valueOf(value2));
                        break;
                    case R.id.radio39:
                        value4 = "5";
                        radioEscolhido = (RadioButton) findViewById(checked4);
                        resultado4.setText(String.valueOf(value2));
                        break;
                    case R.id.radio40:
                        value4 = "10";
                        radioEscolhido = (RadioButton) findViewById(checked4);
                        resultado4.setText(String.valueOf(value2));
                        break;
                }

                 resultadoFinal.setText(String.valueOf((value * 10 + value2) * Math.pow(10, value3) + "+/-" + value4));
            }
        });

            }

}
