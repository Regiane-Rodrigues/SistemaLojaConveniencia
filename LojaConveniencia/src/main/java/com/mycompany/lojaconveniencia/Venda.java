/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lojaconveniencia;

/**
 *
 * @author allan
 */
public class Venda implements RegistrarVenda {
    public int idVenda;
    public double valorProduto;
    public double desconto;
    public double totalVenda;

    public Venda(int idVenda, double valorProduto, double desconto) {
        this.idVenda = idVenda;
        this.valorProduto = valorProduto;
        this.desconto = desconto;
        this.totalVenda = calcularTotalVenda();
    }

    public double calcularTotalVenda() {
        return valorProduto - desconto;
    }

    public String registrarVenda() {
        return "Venda registrada com sucesso! ID da venda: " + idVenda + ", Valor do produto: " + valorProduto + ", Desconto: " + desconto + ", Total da venda: " + totalVenda;
    }
}
