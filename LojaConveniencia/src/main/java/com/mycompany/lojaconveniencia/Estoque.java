/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaconveniencia;
/**
 * Autor: Regiane C R Lima Ra: 00220666
 */
public class Estoque extends CadastroProduto {
 
    public double quantidade;

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Quatidade disponível: " +quantidade);
    }

    @Override
    public void listar() {
        super.listar();
    }

   


}
