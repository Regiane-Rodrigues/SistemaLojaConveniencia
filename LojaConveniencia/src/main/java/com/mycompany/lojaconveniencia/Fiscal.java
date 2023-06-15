/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaconveniencia;

import java.util.Scanner;

/**
 *
 * @author Maycon 00234481
 *
 */
public class Fiscal {

    Scanner ler = new Scanner(System.in);

    public int idFiscal;
    public int numeroNotaFiscal;
    private String valorTotal;
    public String tipoNotaFiscal;
    private String dataEmissao;
    private String dataVencimento;

    public Fiscal(int idFiscal, int numeroNotaFiscal, String valorTotal, String tipoNota, double imposto, double juros,
            double multa, String dataEmissao, String dataVencimento) {
        this.idFiscal = idFiscal;
        this.numeroNotaFiscal = numeroNotaFiscal;
        this.valorTotal = valorTotal;
        this.tipoNotaFiscal = tipoNota;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
    }

    public void emitirNotaFiscal() {
        System.out.println("Informe numero da Nota Fiscal: ");
        numeroNotaFiscal = ler.nextInt();
        System.out.println("numero da Nota Fiscal: " + numeroNotaFiscal);

        System.out.println("Informe o valor da nota: ");
        valorTotal = ler.nextLine();

        System.out.println("Informe o tipo da nota: ");
        tipoNotaFiscal = ler.nextLine();

        System.out.println("Informe a data da emissão: ");
        dataEmissao = ler.nextLine();

        System.out.println("Informe a data de vencimento: ");
        dataVencimento = ler.nextLine();

        System.out.println(numeroNotaFiscal + valorTotal + tipoNotaFiscal + dataEmissao + dataVencimento);
    }
}
