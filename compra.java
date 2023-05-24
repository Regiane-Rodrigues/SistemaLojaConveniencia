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
    public String numeroNotaFiscal;
    public double valTotalProd;
    public double valorNota;
    
    public compra (int idCompra, String numeroNotaFiscal, double valTotalProd, double valorNota){
        this.idCompra = idCompra;
        this.numeroNotaFiscal = numeroNotaFiscal;
        this.valTotalProd = valTotalProd;
        this.valorNota = valorNota;
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
                        registrarCompra();
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

    private void registrarCompra() {
        
        System.out.println("Informe o numero da compra: ");
        idCompra = inserir.nextInt(); 
                
        System.out.println("Informe no numero da nota fiscal ");
          
    }

    private void aterarCompra() {
    }

    private void getCompra() {
    }
        }