package com.mycompany.lojaconveniencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author aluno
 */
public class LojaConveniencia {

    static Scanner inserir = new Scanner(System.in);

    public static void main(String[] args) {

        int escolhaMenu = -1;

        System.out.println("-----------------------------------------");
        System.out.println(" || Sistema Loja de Conveniêcnia ||");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Cadastro Pessoa");
            System.out.println("2 - Cadastro Produto");
            System.out.println("3 - Compras");
            System.out.println("4 - Vendas");
            System.out.println("5 - Estoque");
            System.out.println("6 - Formas de pagamento");
            System.out.println("7 - Finanças");
            System.out.println("-----------------------------------------");
            if (inserir.hasNextInt()) {
                escolhaMenu = inserir.nextInt();

                switch (escolhaMenu) {
                    case 1:
                        menuCadastroPessoa();
                        break;
                    case 2:
                        menuCadastroProduto();
                        break;
                    case 3:
                        menuCompra();
                        break;
                    case 4:
                        menuVenda();
                        break;
                    case 5:
                        menuEstoque();
                        break;
                    case 6:
                        menuPagamento();
                        break;
                    case 7:
                        menuFinancas();
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
                inserir.next(); // favor não apagar garante que o menu não entre em loop infinito caso uma
                // informação errada seja passada no scanner
            }
        } while (escolhaMenu != 0);
    }
    
    public static void menuFinancas() {

        int escolhaSetor = -1;

        System.out.println("-----------------------------------------");

        System.out.println("|| ESCOLHA UM SETOR ||");
        do {
            System.out.println("-----------------------------------------");
            System.out.println("1 - Financeiro");
            System.out.println("2 - Fiscal");
            System.out.println("3 - Banco");
            System.out.println("0 - Retornar ao Menu Principal");
            System.out.println("-----------------------------------------");
            if (inserir.hasNextInt()) {
                escolhaSetor = inserir.nextInt();
                switch (escolhaSetor) {
                    case 1:
                        menuFinanceiro();
                        break;
                    case 2:
                        menuFiscal();
                        break;
                    case 3:
                        menuBanco();
                        break;
                    case 0:
                        System.out.println("Voltando.");
                        break;
                    default:
                        System.out.println("Digite uma opção valida para continuar.");
                        break;
                }
            } else {
                System.out.println("Opção Inválida.");
                inserir.nextInt(); //impede que o menu entre em loop infinito
            }
        } while (escolhaSetor != 0);
    }

    public static void menuCadastroPessoa() {

        CadastroPessoa Pessoa = new CadastroPessoa();
        Pessoa.menuPessoa();
    }

    public static void menuCadastroProduto() {

        CadastroProduto Produto = new CadastroProduto();
        Produto.menuProduto();
    }

    public static void menuCompra() {

        compra Compra = new compra();
        Compra.exibirMenu();
    }

    public static void menuVenda() {

        Venda Vendas = new Venda();
        Vendas.menuVendas();
    }

    public static void menuEstoque() {

        System.out.println("Testando");
        //Estoque incluirEstoque = new Estoque();
        //incluirEstoque.menuEstoques();
    }

    public static void menuPagamento() {

        Pagamento formaPagamento = new Pagamento();
        formaPagamento.menuPagamento();
    }

    public static void menuFinanceiro() {

        Financeiro financeiro = new Financeiro();
        financeiro.menuFinanceiro();
    }

    public static void menuFiscal() {

        System.out.println("Essa classe ainda não funciona");
    }

    public static void menuBanco() {
        MenuBanco banco = new MenuBanco();
        banco.menuBancos();
    }
}
