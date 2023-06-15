/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaconveniencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Maycon 00234481
 */
public class Compra {

    private static final Scanner scanner = new Scanner(System.in);

    public int idCompra;
    public String numeroNotaFiscal;
    public double valTotalProd;
    public double valorNota;

    public void Compra(int idCompra, String numeroNotaFiscal, double valTotalProd, double valorNota) {
        this.idCompra = idCompra;
        this.numeroNotaFiscal = numeroNotaFiscal;
        this.valTotalProd = valTotalProd;
        this.valorNota = valorNota;
    }

    public void exibirMenu() {
        int opcao = 1;

        System.out.println("-----------------------------");
        System.out.println("Menu compra");
        System.out.println("-----------------------------");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Registrar compra \n2 - Listar compra \n3 - Compra");
            System.out.println("-----------------------------------------");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        CompraRegistro registro = new CompraRegistro();
                        registro.registrarCompra();
                        break;
                    case 2:
                        CompraLista lista = new CompraLista();
                        lista.listarProdutos();
                        break;
                    case 0:
                        System.out.println("Obrigado Volte Sempre!");
                        break;
                    default:
                        System.out.println("Opção inválida. Favor informar outra opção.");
                        break;
                }
            } else {
                System.out.println("Opção inválida. Favor informar outra opção.");
                scanner.next();
            }
        } while (opcao != 0);
    }

    boolean getIdCompra() {
        throw new UnsupportedOperationException();
    }
}
