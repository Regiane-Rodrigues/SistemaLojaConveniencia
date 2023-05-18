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
 * @author regiane.lima
 */
public class cadastroPessoa {

    public void menuPessoa() {
        int escolhaMenu = -1;
        Scanner inserir = new Scanner(System.in);
        List<pessoa> cadastro = new ArrayList<>();

        System.out.println("-----------------------------------------");
        System.out.println(" || Sistema Loja de Conveniêcnia ||");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Adicionar \n2- Editar \n3-Listar \n4-Excluir\n0- Sair");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenu = inserir.nextInt();

                switch (escolhaMenu) {
                    case 1:
                        adicionar(inserir, cadastro);
                        break;
                    case 2:
                        editar(inserir, cadastro);
                        break;
                    case 3:
                        listar(cadastro);
                        break;
                    case 4:
                        excluir(inserir, cadastro);
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
        } while (escolhaMenu
                != 0);
    }

    public static void adicionar(Scanner inserir, List<pessoa> cadastro) {

        // nomeCompleto, telefone, email, cep, cidade, estado, rua, numeroLocal;
        System.out.println("|| CADASTRO PESSOA ||\n");

        //Valida o tipo de pessoa a ser cadastrada
        System.out.println("Você deseja Cadastrar: \n 1- Pessoa Fisica\n 2- Pessoa Juridica");
        int tipo = inserir.nextInt();
        System.out.println("Nome Completo: ");
        String nome = inserir.nextLine();
        System.out.println("Telefone: ");
        int numeroTelefone = inserir.nextInt();
        System.out.println("Email: ");
        String adicionaEmail = inserir.nextLine();
        System.out.println("CEP: ");
        int adicionaCep = inserir.nextInt();
        System.out.println("Estado: ");
        String adicionaEstado = inserir.nextLine();
        System.out.println("Cidade: ");
        String adicionaCidade = inserir.nextLine();
        System.out.println("Rua: ");
        String adicionaRua = inserir.nextLine();
        System.out.println("Numero: ");
        int adicionaNumero = inserir.nextInt();

        if (tipo == 1) {

            System.out.println("CPF: ");
            int adicionaCpf = inserir.nextInt();
            System.out.println("Data Nascimento: ");
            String adicionaData = inserir.nextLine();

            pessoaFisica PessoaFisica = new pessoaFisica(nome, numeroTelefone, adicionaEmail, adicionaCep, adicionaCidade, adicionaEstado, adicionaRua, adicionaNumero, adicionaCpf, adicionaData);
            pessoaFisica.adicionarPessoa(cadastro, PessoaFisica);

        } else if (tipo == 2) {
            System.out.println("CNPJ: ");
            String adicionaCnpj = inserir.nextLine();
            System.out.println("Nome da Empresa: ");
            String adicionaEmpresa = inserir.nextLine();
            System.out.println("Setor atuação: ");
            String adicionaSetor = inserir.nextLine();

            pessoaJuridica PessoaJuridica = new pessoaJuridica(nome, numeroTelefone, adicionaEmail, adicionaCep, adicionaCidade, adicionaEstado, adicionaRua, adicionaNumero, adicionaCnpj, adicionaEmpresa, adicionaSetor);
            PessoaJuridica.adicionarPessoa(cadastro, PessoaJuridica);

        } else {

            System.out.println("Inválido. Digite uma opção para continuar.1");

        }
        System.out.println("Adicionado com sucesso.");
    }

    public static void editar(Scanner inserir, List<pessoa> cadastro) {

        System.out.println("|| EDITAR LISTA DE PESSOAS CADASTRADAS ||");
        System.out.println("Informe o ID: ");
        int idPessoa = inserir.nextInt();

        System.out.println("Nome Completo: ");
        String novoNome = inserir.nextLine();
        System.out.println("Telefone: ");
        int novoTelefone = inserir.nextInt();
        System.out.println("Email: ");
        String novoEmail = inserir.nextLine();
        System.out.println("CEP: ");
        int novoCep = inserir.nextInt();
        System.out.println("Estado: ");
        String novoEstado = inserir.nextLine();
        System.out.println("Cidade: ");
        String novoCidade = inserir.nextLine();
        System.out.println("Rua: ");
        String novoRua = inserir.nextLine();
        System.out.println("Numero: ");
        int novoNumero = inserir.nextInt();

        pessoa.editarPessoa(cadastro, idPessoa, novoNome, novoTelefone, novoEmail, novoCep, novoEstado, novoCidade, novoRua, novoNumero);
    }

    public static void listar(List<pessoa> cadastro) {

        System.out.println("|| LISTA DE PESSOAS CADASTRADAS ||");

        //isEmpty método verifica se String está vazia ou não
        if (cadastro.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            pessoa.listarPessoas(cadastro);
        }
    }

    public static void excluir(Scanner inserir, List<pessoa> cadastro) {

        System.out.println("|| EXCLUIR PESSOAS ||");
        System.out.println("Informe o ID: ");
        int idPessoa = inserir.nextInt();

        pessoa.excluirPessoas(cadastro, idPessoa);

        System.out.println("Excluído com êxito.");
    }

}
