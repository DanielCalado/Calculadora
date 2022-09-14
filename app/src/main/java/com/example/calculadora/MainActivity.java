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

        Button botaoUm = binding.botaoUm;
        botaoUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("1");
            }
        });
        Button botaoDois = binding.botaoDois;
        botaoDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("2");
            }
        });
        Button botaoTres = binding.botaoTres;
        botaoTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("3");
            }
        });
        Button botaoQuatro = binding.botaoQuatro;
        botaoQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("4");
            }
        });
        Button botaoCinco = binding.botaoCinco;
        botaoCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("5");
            }
        });
        Button botaoSeis = binding.botaoSeis;
        botaoSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("6");
            }
        });
        Button botaoSete = binding.botaoSete;
        botaoSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("7");
            }
        });
        Button botaoOito = binding.botaoOito;
        botaoOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("8");
            }
        });
        Button botaoNove = binding.botaoNove;
        botaoNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("9");
            }
        });
        Button botaoZero = binding.botaoZero;
        botaoZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar("0");
            }
        });
        Button virgula = binding.virgula;
        virgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contar(".");
            }
        });
        Button multiplicacao = binding.multiplicacao;
        multiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela = tela +"x";
                operacao = "x";
                binding.textView.setText(tela);
            }
        });
        Button divisao = binding.divisao;
        divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela = tela +"/";
                operacao = "/";
                binding.textView.setText(tela);
            }
        });
        Button adicao = binding.botaoSoma;
        adicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela = tela +"+";
                operacao = "+";
                binding.textView.setText(tela);
            }
        });
        Button subtracao = binding.subtracao;
        subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela = tela +"-";
                operacao = "-";
                binding.textView.setText(tela);
            }
        });
        Button igualdade = binding.igualdade;
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
        Button deletar = binding.deletar;
        deletar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    limparCampos();
                    binding.textView.setText("0");
            }
        });
    }
}