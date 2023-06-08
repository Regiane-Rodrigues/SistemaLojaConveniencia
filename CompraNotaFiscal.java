/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaconveniencia;

/**
 *
 * @author aluno
 */
public class CompraNotaFiscal {
       private int idCompra;
    private String numNotaFiscal;
    private double valTotalProd;
    private double valorNota;

    public CompraNotaFiscalpra, String numNotaFiscal, double valTotalProd, double valorNota) {
        this.idCompra = idCompra;
        this.numNotaFiscal = numNotaFiscal;
        this.valTotalProd = valTotalProd;
        this.valorNota = valorNota;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public String getNumNotaFiscal() {
        return numNotaFiscal;
    }

    public double getValTotalProd() {
        return valTotalProd;
    }

    public double getValorNota() {
        return valorNota;
    }
}
