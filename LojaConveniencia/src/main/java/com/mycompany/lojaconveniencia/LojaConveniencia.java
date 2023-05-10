package com.mycompany.lojaconveniencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author aluno
 */
public class LojaConveniencia {

    static List<Banco> arrayDocumentos = new ArrayList<>();
    static List<Pessoa> arrayPessoas = new ArrayList<>();
    static Scanner inserir = new Scanner(System.in);

    public static void main(String[] args) {

        int escolhaMenu = -1;

        System.out.println("-----------------------------------------");
        System.out.println(" || Sistema Loja de Conveniêcnia ||");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Venda \n2 - Compra \n3 - Estoque \n4 - Produto \n5 - Fiscal \n6 - Financeiro \n7 - Pessoa \n8 - Banco \n9 - Pagamento \n0 - Sair");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenu = inserir.nextInt();

                switch (escolhaMenu) {
                    case 1:
                        menuVenda();
                        break;
                    case 2:
                        menuCompra();
                        break;
                    case 3:
                        menuEstoque();
                        break;
                    case 4:
                        menuCadastroProduto();
                        break;
                    case 5:
                        menuFiscal();
                        break;
                    case 6:
                       menuFinanceiro();
                        break;
                    case 7:
                        menuCadastroPessoa();
                        break;
                    case 8:
                        menuBanco();
                        break;
                    case 9:
                        menuPagamento();
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
        } while (escolhaMenu != 0);
    }

    
     public static void menuFinanceiro(){
        
        System.out.println("Essa classe ainda não funciona");
    }
    
    public static void menuFiscal(){
        
        System.out.println("Essa classe ainda não funciona");
    }
      
    
    public static void menuCompra(){
        
        System.out.println("Essa classe ainda não funciona");
    }
    
    public static void menuEstoque(){
        
       Estoque incluirEstoque = new Estoque();
       incluirEstoque.menuEstoques();
    }
    
    
    public static void menuBanco() {

        System.out.println("Revisar");
    }

    public static void menuPagamento() {

       Pagamento formaPagamento = new Pagamento();
       formaPagamento.menuPagamento();
    }
          public static void menuVenda() {

        venda Vendas = new venda();
        Vendas.menuVendas();       
    }

    
    public static void menuCadastroProduto() {

        cadastroProduto Produto = new cadastroProduto();
        Produto.menuPrduto();      
    }
    
    
     public static void menuCadastroPessoa() {
         
         Pessoa cadPessoa = new Pessoa();
         cadPessoa.menuPessoa();
   
    }
}