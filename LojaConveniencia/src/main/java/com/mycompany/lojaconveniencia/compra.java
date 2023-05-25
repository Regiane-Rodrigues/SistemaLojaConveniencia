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

    static Scanner inserir = new Scanner(System.in);

    public int idCompra;
    public String numNotaFiscal;
    public double valTotalProd;
    public double valorNota;
    List<compra> registro = new ArrayList<>();

    public compra(int idCompra, String numeroNotaFiscal, double valTotalProd, double valorNota) {
        this.idCompra = idCompra;
        this.numNotaFiscal = numNotaFiscal;
        this.valTotalProd = valTotalProd;
        this.valorNota = valorNota;
    }

    public compra() {

    }

    public void menuCompra() {
        int opcao = 1;

        System.out.println("-----------------------------");
        System.out.println("Menu compra");
        System.out.println("-----------------------------");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Lista de compra \n2 - Menu de compra \n3 - Compra");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
                opcao = inserir.nextInt();

                switch (opcao) {
                    case 1:
                        registrarCompra();
                        break;
                    case 2:
                        listarProdutos();
                        break;
                    case 3:
                        excluirRegistro();
                        break;
                    case 4:
                        editarRegistroCompra();
                        break;
                    case 5:
                        emitirNotaFiscal();
                        break;
                    case 6:
                        emitirNotaFiscal();
                        break;
                    case 7:
                        formaPagamento();
                    case 0:
                        System.out.println("Obrigado Volte Sempre!");
                        break;
                    default:
                        System.out.println("Opção inválida. Favor informar outra opção.");
                        break;
                }
            } else {
                System.out.println("Opção inválida. Favor informar outra opção.");
                inserir.next(); //favor não apagar garante que o menu não entre em loop infinito caso uma informação errada seja passada no scanner
            }
        } while (opcao != 0);
    }

    private void registrarCompra() {
        registro.add(new compra());
        for (int i = 0; i < registro.size(); i++) {
            if (registro.get(i).idCompra == 0) {
            
            registro.get(i).idCompra = inserir.nextInt();
            registro.get(i).numNotaFiscal = inserir.nextLine();
            registro.get(i).valTotalProd = inserir.nextDouble();
            registro.get(i).valorNota = inserir.nextDouble();
            }
            i = registro.size();
        }

        System.out.println("Informe o numero da compra: ");
        idCompra = inserir.nextInt();

        System.out.println("Informe no numero da nota fiscal ");
        numNotaFiscal = inserir.nextLine();

    }

    private void listarProdutos() {
        for (int i = 0; i < registro.size(); i++) {
            System.out.println(registro.get(i).idCompra);
        }
    }
    private void emitirNotaFiscal() {
        
        for (int i = 0; i < registro.size(); i++) {
            System.out.println(registro.get(i).idCompra);
        }
        for (int i = 0; i < registro.size(); i++) {
            System.out.println(registro.get(i).numNotaFiscal);    
        }
        for (int i = 0; i < registro.size(); i++) {
            System.out.println(registro.get(i).valTotalProd);    
        }
        for (int i = 0; i < registro.size(); i++) {
            System.out.println(registro.get(i).valorNota);    
        }
    }

}
