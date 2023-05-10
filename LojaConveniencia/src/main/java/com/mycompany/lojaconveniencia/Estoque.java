/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaconveniencia;
import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *Autor: Regiane C R Lima     Ra: 00220666
 */
public class Estoque {
    
    static Scanner incluir = new Scanner( System.in);
    
    
    public int codigProduto;
    public String nomeProduto;
    public int quantidadeEntrada;
    public double valorUnitarioEntrada;
    public double valorTotalEntrada;
    public int quantidadeSaida;
    public double valorUnitarioSaida;
    public int quantidadeSaldo;
    public double valorUnitarioSaldo;
    public double totalSaldo;
    
    
    public void menuEstoques() {
    
        System.out.println("----- | Menu Estoque | -----");
        int escolhaEstoque = 1;
        do{
        
            System.out.println("-------------------------------\n");
            System.out.println("Escolha um opcão: ");
            System.out.println("1 - Incluir Produto");
            System.out.println("2 - Dar baixa no Estoque");
            System.out.println("3 - Listar Estoque");
            System.out.println("0 - Sair");
            
            if(incluir.hasNextInt()){
               
                escolhaEstoque = incluir.nextInt();
                
                switch(escolhaEstoque){
                    
                    case 1 -> System.out.println("aguardando metodos");
                    
                    case 2 -> System.out.println("aguardando metodos");
                    
                    case 3 -> System.out.println("aguardando metodos");
                    
                    case 0 -> System.out.println("Sistema encerrado.");
                    
                    default -> System.out.println("Escolha uma opção válida para continuar.");
                            
                }
            }else {
                System.out.println("Escolha uma opção valida para continuar.");
                inserir.next(); //favor não apagar garante que o menu não entre em loop infinito caso uma informação errada seja passada no scanner
            }
        } while (escolhaEstoque != 0);  
        }
    }
    
   /* public String incluirProdutos(){


    }
    
    public String baixarEstoque() {
    }
    
    public  String listarEstoque(){    
    }
    */
    
    
