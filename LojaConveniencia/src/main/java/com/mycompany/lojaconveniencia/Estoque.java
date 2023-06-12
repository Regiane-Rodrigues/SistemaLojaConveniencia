/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaconveniencia;

import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

/**
 * Autor: Regiane C R Lima Ra: 00220666
 */
public class Estoque extends Produto {

    static Scanner incluir = new Scanner(System.in);

    public int quantidadeEntrada;
    public double valorUnitarioEntrada;
    public double valorTotalEntrada;
    public int quantidadeSaida;
    public double valorUnitarioSaida;
    public int quantidadeSaldo;
    public double valorUnitarioSaldo;
    public double totalSaldo;

    @Override
    public void exibirInformacoes() {
       
        super.exibirInformacoes();
        

    }

}
