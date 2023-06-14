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
public class compra {

      private static final Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        int opcao = 1;

        System.out.println("-----------------------------");
        System.out.println("Menu compra");
        System.out.println("-----------------------------");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Lista de compra \n2 - Menu de compra \n3 - Compra");
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
                    case 3:
                        CompraNotaFiscal notaFiscal = new CompraNotaFiscal();
                        notaFiscal.emitirNotaFiscal();
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
}
  