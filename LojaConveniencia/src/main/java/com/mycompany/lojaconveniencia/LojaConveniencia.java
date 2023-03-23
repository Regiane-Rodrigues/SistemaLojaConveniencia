
package com.mycompany.lojaconveniencia;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class LojaConveniencia {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        //declarando o atributo que serve para escolher a opção do menu, ainda sem solução para caso não seja int
        int escolha = -1;
        
        System.out.println("-----------------------------------------");
        System.out.println(" || Sistema Loja de Conveniêcnia ||");
        
        //início do laço de repetição do que garante que o código vai ficar repetindo a menos que a condição seja cumprida no final dele
        do {
            //o menu como aparecerá na tela
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Venda");
            System.out.println("2 - Compra");
            System.out.println("3 - Estoque");
            System.out.println("4 - Produto");
            System.out.println("5 - Fiscal");
            System.out.println("6 - Financeiro");
            System.out.println("7 - Pessoa");
            System.out.println("8 - Banco");
            System.out.println("9 - Pagamento");
            System.out.println("0 - Sair");
            System.out.println("-----------------------------------------");
            
            //onde o atributo para escolha é lida e define qual opção é escolhida
            escolha = ler.nextInt();
            
            //o switch que escolhe a opção baseada no atributo escolha
            switch (escolha) {
                case 1:
                    //um teste para entrar em outro menu dentro de um método separado no final
                    testeVenda();
                    break;
                case 2:
                    System.out.println("Teste Compras");
                    break;
                case 3:
                    System.out.println("Teste Estoque");
                    break;
                case 4:
                    System.out.println("Teste Cadastro Produto");
                    break;
                case 5:
                    System.out.println("Teste Fiscal");
                    break;
                case 6:
                    System.out.println("Teste Financeiro");
                    break;
                case 7:
                    System.out.println("Teste Cadastro Pessoa");
                    break;
                case 8:
                    System.out.println("Teste Cadastro Banco");
                    break;
                case 9:
                    System.out.println("Teste Pagamento");
                    break;
                case 0:
                    System.out.println("Obrigado Volte Sempre!");
                    break;    
                default:
                    System.out.println("erro");
                    break;
            }
        //a condição para o fim do laço de repetição
        } while (escolha != 0);
        
    }
    
    //o teste de um método que chama outro menu que pode servir para outra classe
    public static void testeVenda() {
        
        Scanner ler = new Scanner(System.in);
        
        int escolha = -1;
        
        System.out.println("-----------------------------------------");
        System.out.println(" || Teste Menu Vendas ||");
        
        do {            
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Teste");
            System.out.println("0 - Voltar");
            System.out.println("-----------------------------------------");
            escolha = ler.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Teste Venda");
                    break;
                case 0:
                    System.out.println("Voltando");
                    break;
                default:
                    System.out.println("erro");
                    break;
            }
        //aqui ele volta para o menu princial ao invés de encerrar o programa
        } while (escolha != 0);
    }
}
