/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaconveniencia;
import java.util.Scanner;


/**
 *
 * @author Maycon 00234481
 */
public class compra {

        static Scanner inserir = new Scanner(System.in);

    
    public int idCompra;
    public String fornecedor;
    public int numNota;
    public int datEmicao;
    public int datEntrada;
    public double valTotalProd;
    public double valorAdicional;
    public double valorDesc;
    public double valorNota;
    public int codProd;
    public double valorUn;

    public double compras(int idCompra, String fornecedor, double valTotalProd, double valorAdicional) {
        double compra = 0;
        return compra;
    }

    public void listCompra(int idCompra) {
        int listCompra;
    }

    public void aterarCompra(int idCompra) {
        double aterarCompra = 0;
    }

    public void getCompra(int idCompra) {
        double getCompra = 0;
    }

    public void menuCompra() {
        int opcao = 1;
        
        
        System.out.println("-----------------------------");
        System.out.println("Menu compra");
        System.out.println("-----------------------------");
         
        do{
                System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Lista de compra \n2 - Menu de compra \n3 - Compra");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
                opcao = inserir.nextInt();

                switch (opcao) {
                    case 1:
                        listCompra();
                        break;
                    case 2:
                        aterarCompra();
                        break;
                    case 3:
                        getCompra();
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
                inserir.next(); //favor não apagar garante que o menu não entre em loop infinito caso uma informação errada seja passada no scanner
            }
        } while (opcao != 0);
    }    

    private void listCompra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void aterarCompra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void getCompra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        }