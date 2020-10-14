package com.example.calculadorasenai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display1;
    private TextView display2;
    private String primeiroNumero = "";
    private String segundoNumero = "";
    private String operacao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display1 = findViewById(R.id.tv_display);
        display2 = findViewById(R.id.tv_displayResultado);

    }


    public void onClickBotao1 (View v) {
        atualizarNumeroDigitado("1");
        atualizarDisplay1 ("1");
    }

    public void onClickBotao2 (View v) {
        atualizarNumeroDigitado("2");
        atualizarDisplay1 ("2");
    }

    public void onClickBotao3 (View v) {
        atualizarNumeroDigitado("3");
        atualizarDisplay1 ("3");
    }

    public void onClickBotao4 (View v) {
        atualizarNumeroDigitado("4");
        atualizarDisplay1 ("4");
    }

    public void onClickBotao5 (View v) {
        atualizarNumeroDigitado("5");
        atualizarDisplay1 ("5");
    }

    public void onClickBotao6 (View v) {
        atualizarNumeroDigitado("6");
        atualizarDisplay1 ("6");
    }

    public void onClickBotao7 (View v) {
        atualizarNumeroDigitado("7");
        atualizarDisplay1 ("7");
    }

    public void onClickBotao8 (View v) {
        atualizarNumeroDigitado("8");
        atualizarDisplay1 ("8");
    }

    public void onClickBotao9 (View v) {
        atualizarNumeroDigitado("9");
        atualizarDisplay1 ("9");
    }

    public void onClickBotao0 (View v) {
        atualizarNumeroDigitado("0");
        atualizarDisplay1 ("0");
    }

    public void onClickBotaoAdicao(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "+";
            atualizarDisplay1("+");
        } else {
            atualizarDisplay1("ERRO");
        }
    }

    public void onClickBotaoSubtracao(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "-";
            atualizarDisplay1("-");
        } else {
            atualizarDisplay1("ERRO");
        }
    }

    public void onClickBotaoMultiplicacao(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "*";
            atualizarDisplay1("*");
        } else {
            atualizarDisplay1("ERRO");
        }
    }

    public void onClickBotaoDivisao(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "/";
            atualizarDisplay1("/");
        } else {
            atualizarDisplay1("ERRO");
        }
    }

    public void onClickBotaoIgual (View v) {
        if (!primeiroNumero.isEmpty() && !segundoNumero.isEmpty()) {
            Double numero1 = numeroReal(primeiroNumero);
            Double numero2 = numeroReal(segundoNumero);

            if (operacao.equals("+")) {
                Double resultado = numero1 + numero2;
                display2.setText(String.valueOf(resultado));
            } else if (operacao.equals("-")) {
                Double resultado = numero1 - numero2;
                display2.setText(String.valueOf(resultado));
            } else if (operacao.equals("*")) {
                Double resultado = numero1 * numero2;
                display2.setText(String.valueOf(resultado));
            } else if (operacao.equals("/")) {
                if (!segundoNumero.equals("0")) {
                    Double resultado = numero1 / numero2;
                    display2.setText(String.valueOf(resultado));
                } else {
                    atualizarDisplay2("ERRO");
                }
            }
        }
    }

    private void atualizarDisplay1 (String texto) {
        String textoDisplay = display1.getText().toString();
        textoDisplay = textoDisplay + texto;
        display1.setText(textoDisplay);
    }

    private void atualizarDisplay2 (String texto1) {
        String textoDisplay = display2.getText().toString();
        textoDisplay= textoDisplay + texto1;
        display2.setText(textoDisplay);
    }

    private void atualizarNumeroDigitado (String numero) {
        if (operacao.isEmpty()) {
            primeiroNumero = primeiroNumero + numero;
        } else {
            segundoNumero = segundoNumero + numero;
        }
    }

    public Double numeroReal(String num){
        Double numero = Double.parseDouble(num);
        return numero;
    }

    public void onClickBtnLimpar(View v) {
        display1.setText("");
        display2.setText("");
        primeiroNumero = "";
        segundoNumero = "";
        operacao = "";
    }
}