package com.example.calculadora;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculadora.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    String tela = "";
    String numero1 = "";
    String numero2 = "";
    String operacao = "";
    ActivityMainBinding binding;
    public void contar(String a){
        if(operacao == "") {
            numero1 = numero1 + a;
            tela = tela + a;
            binding.textView.setText(tela);
        }else{
            numero2 = numero2 + a;
            tela = tela + a;
            binding.textView.setText(tela);
        }
    };
    public void limparCampos(){
        numero1="";
        numero2="";
        tela="";
        operacao="";
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Button botaoUm = binding.botao01;
        botaoUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("1");
            }
        });
        Button botaoDois = binding.botao02;
        botaoDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("2");
            }
        });
        Button botaoTres = binding.botao03;
        botaoTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("3");
            }
        });
        Button botaoQuatro = binding.botao04;
        botaoQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("4");
            }
        });
        Button botaoCinco = binding.botao05;
        botaoCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("5");
            }
        });
        Button botaoSeis = binding.botao06;
        botaoSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("6");
            }
        });
        Button botaoSete = binding.botao07;
        botaoSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("7");
            }
        });
        Button botaoOito = binding.botao08;
        botaoOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("8");
            }
        });
        Button botaoNove = binding.botao09;
        botaoNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("9");
            }
        });
        Button botaoZero = binding.botao00;
        botaoZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("0");
            }
        });
        Button virgula = binding.botapVirgula;
        virgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar(".");
            }
        });
        Button multiplicacao = binding.botaoMultiplicacao;
        multiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela = tela +"x";
                operacao = "x";
                binding.textView.setText(tela);
            }
        });
        Button divisao = binding.botaoDivisao;
        divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela = tela +"/";
                operacao = "/";
                binding.textView.setText(tela);
            }
        });
        Button adicao = binding.botao0Soma;
        adicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela = tela +"+";
                operacao = "+";
                binding.textView.setText(tela);
            }
        });
        Button subtracao = binding.botaoSubtracao;
        subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela = tela +"-";
                operacao = "-";
                binding.textView.setText(tela);
            }
        });
        Button igualdade = binding.botaoIgualdade;
        igualdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operacao == "x"){
                    double a = Double.parseDouble(numero1.trim()) * Double.parseDouble(numero2.trim());
                    tela = ""+a;
                    binding.textView.setText(tela);
                    limparCampos();
                }else if(operacao == "/"){
                    int num = Integer.parseInt(numero2.trim());
                    if(num == 0){
                        binding.textView.setText("indefinido");
                        limparCampos();
                    }else {
                        double a = Double.parseDouble(numero1.trim()) / Double.parseDouble(numero2.trim());
                        tela = "" + a;
                        binding.textView.setText(tela);
                        limparCampos();
                    }
                }else if(operacao == "+"){
                    double a = Double.parseDouble(numero1.trim()) + Double.parseDouble(numero2.trim());
                    tela = ""+a;
                    binding.textView.setText(tela);
                    limparCampos();
                }else if(operacao == "-"){
                    double a = Double.parseDouble(numero1.trim()) - Double.parseDouble(numero2.trim());
                    tela = ""+a;
                    binding.textView.setText(tela);
                    limparCampos();
                }
            }
        });
        Button deletar = binding.botaoDeletar;
        deletar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    limparCampos();
                    binding.textView.setText("0");
            }
        });
    }
}