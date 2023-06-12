package com.mycompany.lojaconveniencia;

import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author allan
 */
public class cadastroProduto implements cadastro {

    public void menuProduto() {

        int escolhaMenuProduto = -1;

        cadastroProduto cadastro = new cadastroProduto();

        System.out.println("-----------------------------------------");
        System.out.println(" || Menu Cadastro de Produtos ||");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Adicionar Produto \n2 - Editar produto \n3 - Listar \n4 - Excluir produto \n0 - Voltar ");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenuProduto = inserir.nextInt();
                switch (escolhaMenuProduto) {
                    case 1:
                        adicionar(inserir, null);
                        break;
                    case 2:
                        editar(inserir, null);
                        break;
                    case 3:
                        listar(null);
                        break;
                    case 4:
                        excluir(inserir, null);
                        break;
                    case 0:
                        System.out.println("Voltando");
                        break;
                    default:
                        System.out.println("Opção inválida. Favor informar outra opção.");
                        break;
                }
            } else {
                System.out.println("Opção inválida. Favor informar outra opção.");
                inserir.next();
            }
        } while (escolhaMenuProduto != 0);

    }

    @Override
    public void adicionar(Scanner inserir, ArrayList<String> cadastro) {
        System.out.println("|| CADASTRO PRODUTO ||\n");

        System.out.println("Codigo do Produto: ");
        String codigoProduto = inserir.nextLine();
        System.out.println("Telefone: ");
        int numeroTelefone = inserir.nextInt();
        System.out.println("Email: ");
        String adicionaEmail = inserir.nextLine();
        System.out.println("CEP: ");
        int adicionaCep = inserir.nextInt();

        System.out.println("CPF: ");
        int adicionaCpf = inserir.nextInt();
        System.out.println("Data Nascimento: ");
        String adicionaData = inserir.nextLine();

        Estoque estoque = new Estoque(codigoProduto);
        pessoaFisica.adicionarPessoa(cadastro, PessoaFisica);

    }

    @Override
    public void listar(ArrayList<String> cadastro) {
        // TODO Auto-generated method stub

    }

    @Override
    public void editar(Scanner inserir, ArrayList<String> cadastro) {
        // TODO Auto-generated method stub

    }

    @Override
    public void excluir(Scanner inserir, ArrayList<String> cadastro) {
        // TODO Auto-generated method stub

    }
}
