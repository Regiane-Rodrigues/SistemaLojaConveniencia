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
                        System.out.println("Teste Compras");
                        break;
                    case 3:
                        System.out.println("Teste Estoque");
                        break;
                    case 4:
                        menuCadastroProduto();
                        break;
                    case 5:
                        System.out.println("Teste Fiscal");
                        break;
                    case 6:
                        System.out.println("Teste Financeiro");
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

    public static void menuBanco() {

        int escolhaMenuBanco = -1;
        
        Banco bancoCadastro;

        System.out.println("-----------------------------------------");
        System.out.println(" || Teste Menu Banco ||");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Lancar Documentos \n2 - Consultar Documentos \n3 - Controlar Credito \n4 - Gerar Boleto \n0 - Voltar");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenuBanco = inserir.nextInt();
                switch (escolhaMenuBanco) {
                    case 1:
                        System.out.println("Informe o nome do banco: ");
                        inserir.nextLine();
                        String nomeB = inserir.nextLine();

                        System.out.println("Informe a agencia: ");
                        int numAgencia = inserir.nextInt();

                        System.out.println("Informe o endereco do banco: ");
                        inserir.nextLine();
                        String enderecoBanco = inserir.nextLine();

                        System.out.println("Informe o tipo do documento: ");
                        String tipoDoc = inserir.nextLine();

                        System.out.println("Informe o emissor: ");
                        String emissorDoc = inserir.nextLine();

                        System.out.println("Informe o numero da conta: ");
                        int numConta = inserir.nextInt();

                        System.out.println("Informe o digito da conta: ");
                        int numDigito = inserir.nextInt();

                        System.out.println("Informe o numero do documento: ");
                        int numDocumento = inserir.nextInt();

                        System.out.println("Informe o nome do pagador: ");
                        inserir.nextLine();
                        String nomePagador = inserir.nextLine();

                        System.out.println("Informe o valor do documento: ");
                        double valorD = inserir.nextDouble();

                        bancoCadastro = new Banco(numConta, numDigito, numDocumento, nomePagador);
                        bancoCadastro.nomeBanco = nomeB;
                        bancoCadastro.agencia = numAgencia;
                        bancoCadastro.endereco = enderecoBanco;
                        bancoCadastro.tipoDocumento = tipoDoc;
                        bancoCadastro.emissor = emissorDoc;
                        bancoCadastro.valorDocumento = valorD;

                        arrayDocumentos.add(bancoCadastro);

                        System.out.println("Documento nº" + bancoCadastro.lancarDocPagar() + " lancado.");
                        System.out.println("Numero de documentos landacos: " + bancoCadastro.baixarDocPagos);
                        break;

                    case 2:
                        System.out.println("Listando documentos: ");
                        for (int i = 0; i < arrayDocumentos.size(); i++) {
                            System.out.println("-----------------------------------------");
                            System.out.println("Cadastro Nº " + i);
                            int documentoReceber = arrayDocumentos.get(i).consultarDocReceber();
                            System.out.println(" - Número do documento: " + documentoReceber);
                        }
                        break;

                    case 3:
                        arrayDocumentos.get(0).controlarCredito();
                        break;

                    case 4:
                        System.out.println("Informe o numero do cadastro do documento para gerar o boleto: ");
                        if (inserir.hasNextInt()) {
                            int numero = inserir.nextInt();
                            if ((numero > -1) && (numero < arrayDocumentos.size())) {
                                System.out.println("Informe o valor do boleto: ");
                                if (inserir.hasNextDouble()) {
                                    arrayDocumentos.get(numero).valorDocumento = inserir.nextDouble();
                                } else {
                                    System.out.println("Valor invalido, cancelando.");
                                    inserir.next();
                                    break;
                                }
                                int boleto = arrayDocumentos.get(numero).gerarBoletos();
                                System.out.println(" - Número do documento: " + boleto);
                            } else {
                                System.out.println("Numero do cadastro invalido, favor consultar o numero do cadastro na opcao 2.");
                            }
                        } else {
                            System.out.println("Numero do cadastro invalido, favor consultar o numero do cadastro na opcao 2.");
                        }
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
        } while (escolhaMenuBanco != 0);
    }

    public static void menuPagamento() {

        Pagamento realizarPagamento = new Pagamento();

        realizarPagamento.setTipo("Débito");
        realizarPagamento.setNum("0000000000000000");
        realizarPagamento.setValidade(0425);
        realizarPagamento.setCod(666);
        realizarPagamento.setSenha(4002);
        realizarPagamento.setStatus("Autorizado");

        int escolhaMenuPagamento = -1;

        System.out.println("------------------------------------------");
        System.out.println("|| Menu Pagamento ||");

        do {
            System.out.println("------------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Contas a pagar \n2 - Contas a receber \n0 - Voltar");
            System.out.println("------------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenuPagamento = inserir.nextInt();
                switch (escolhaMenuPagamento) {
                    case 1:
                        System.out.println("Contas a pagar\n"+ realizarPagamento.getTipo() +"\n"+ realizarPagamento.getNum() +"\n"+ realizarPagamento.getValidade() +"\n"+ realizarPagamento.getCod() +"\n"+ realizarPagamento.getSenha() +"\n"+ realizarPagamento.getStatus());
                        break;

                    case 2:
                        System.out.println("Contas a receber");
                        break;

                    default:
                        System.out.println("Opção inválida. Favor informar outra opção.");
                        break;
                }
            } else {
                System.out.println("Opção inválida. Favor informar outra opção.");
                inserir.next();
            }
        } while (escolhaMenuPagamento != 0);
    }

    public static void menuVenda() {

        int escolhaMenuVendas = -1;

        venda realizarVenda = new venda();
        realizarVenda.abrir_caixa(1000.00);
        realizarVenda.registrar_Venda("Costela Minga 3,400 KGS ");
        double valorCompra = 210.55;
        realizarVenda.valorDesconto = 1.50;
        realizarVenda.finalizar_Processo_Compra(valorCompra);
        realizarVenda.fechar_Caixa(1210.55);

        System.out.println("-----------------------------------------");
        System.out.println(" || Menu Venda ||");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Abrir caixa \n2 - Fechar caixa \n3 - Registrar venda \n4 - Finalizar processo de compra \n0 - Voltar ");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenuVendas = inserir.nextInt();
                switch (escolhaMenuVendas) {
                    case 1:
                        System.out.println("Caixa aberto: " + realizarVenda.valorAberturaCaixa);
                        break;
                    case 2:
                        System.out.println("Valor do fechamento: " + realizarVenda.valorFechamento);
                        break;
                    case 3:
                        System.out.println("Registrar venda: " + realizarVenda.registrar_Venda(""));
                        break;
                    case 4:
                        System.out.println("Finalizar processo de compra: " + realizarVenda.totalCompra);
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
        } while (escolhaMenuVendas != 0);
    }

    public static void menuCadastroProduto() {

        int escolhaMenuProduto = -1;

        cadastroProduto cadastro = new cadastroProduto();

        cadastro.cadastroDeProduto("Energético Monster");
        cadastro.cadastroCodigo(5555.5555);
        cadastro.calcularestoque(escolhaMenuProduto);
        cadastro.categoria("Bebida Energética");
        cadastro.cadastroDeVendedor("Jailson Mendes");

        System.out.println("-----------------------------------------");
        System.out.println(" || Menu Cadastro de Produtos ||");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Cadastro de Produto \n2 - Cadastro de código \n3 - Calcular estoque \n4 - Categoria \n5 - Cadastrar vendedor \n0 - Voltar ");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenuProduto = inserir.nextInt();
                switch (escolhaMenuProduto) {
                    case 1:
                        System.out.println("Informe o nome do produto: " + cadastro.descricaoProduto);
                        break;
                    case 2:
                        System.out.println("Código cadastrado no produto: " + cadastro.cadastroCodigo(escolhaMenuProduto));
                        break;
                    case 3:
                        System.out.println("Quantidade em estoque: " + cadastro.calcularestoque(escolhaMenuProduto));
                        break;
                    case 4:
                        System.out.println("Este produto faz parte da categoria de: " + cadastro.categoria(null));
                        break;
                    case 5:
                        System.out.println("Novo vendedor cadastrado: " + cadastro.cadastroDeVendedor(null));
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

    public static void menuCadastroPessoa() {

        int escolhaMenuPessoa = -1;

        Pessoa pessoaCadastro;

        System.out.println("-------------------------------");
        System.out.println(" || Menu Pessoa ||");

        do {
            System.out.println("------------------------------");
            System.out.println("Escolha a opção desejada! ");
            System.out.println("1 - Cadastrar Cliente \n2 - Listar Cliente! \n3 - Alterar Cliente! ");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenuPessoa = inserir.nextInt();
                switch (escolhaMenuPessoa) {
                    case 1:
                        System.out.println("Informe o id");
                        int id = inserir.nextInt();

                        System.out.println("Informe o nome do Cliente");
                        inserir.nextLine();
                        String nome = inserir.nextLine();

                        System.out.println("Informe o CPF: ");
                        String documento = inserir.nextLine();

                        System.out.println("Informe o CEP ");
                        String cep = inserir.nextLine();

                        System.out.println(" Informe o endereco");
                        String endereco = inserir.nextLine();

                        System.out.println("Informe o numero do endereço");
                        String numEndereco = inserir.nextLine();

                        System.out.println(" Informe a cidade");
                        String cidade = inserir.nextLine();

                        System.out.println(" Informe o estado");
                        String estado = inserir.nextLine();

                        System.out.println("Informe o tipo de cadastro(F/J)");
                        char tipoCadastro = inserir.next().charAt(0);
                        tipoCadastro = Character.toUpperCase(tipoCadastro);

                        int inscricaoEstadual = 0;

                        while (tipoCadastro != 'F' && tipoCadastro != 'J') {
                            System.out.println("Informação inválida, informe novamente (F/J) ");
                            tipoCadastro = inserir.next().charAt(0);
                            tipoCadastro = Character.toUpperCase(tipoCadastro);
                        }
                        
                        if (tipoCadastro == 'J') {
                            System.out.println("Informe a Inscrição Estadual");
                            inscricaoEstadual = inserir.nextInt();
                        }

                        System.out.println("Informe a data de Cadastro");
                        inserir.nextLine();
                        String dataCadastro = inserir.nextLine();

                        System.out.println("Informe o email");
                        String email = inserir.nextLine();

                        System.out.println("Informe o telefone");
                        String telefone = inserir.nextLine();

                        pessoaCadastro = new Pessoa(id, documento, dataCadastro, nome, cep, endereco, cidade, estado, tipoCadastro);
                        pessoaCadastro.num_Endereco = numEndereco;
                        
                        if (tipoCadastro == 'J') {
                            pessoaCadastro.setinscricao_Estadual(inscricaoEstadual);
                        }
                        
                        pessoaCadastro.email = email;
                        pessoaCadastro.telefone = telefone;

                        arrayPessoas.add(pessoaCadastro);
                        break;

                    case 2:
                        for (int i = 0; i < arrayPessoas.size(); i++) {
                            arrayPessoas.get(i).listar_Cadastro();
                            System.out.println("----------------------------------");
                        }
                        break;

                    case 3:
                        System.out.println("Informe o ID que deseja alterar: ");
                        int idAltera = inserir.nextInt();

                        for (int i = 0; i < arrayPessoas.size(); i++) {
                            if (arrayPessoas.get(i).getId_Pessoa() == idAltera) {

                                System.out.println("Informe o nome do Cliente");
                                inserir.nextLine();
                                arrayPessoas.get(i).nome = inserir.nextLine();

                                System.out.println("Informe o documento: ");
                                String documentoA = inserir.nextLine();
                                arrayPessoas.get(i).setDocumento(documentoA);

                                System.out.println("Informe o CEP ");
                                arrayPessoas.get(i).CEP = inserir.nextLine();

                                System.out.println(" Informe o endereco");
                                arrayPessoas.get(i).endereco = inserir.nextLine();

                                System.out.println("Informe o numero do endereço");
                                arrayPessoas.get(i).num_Endereco = inserir.nextLine();

                                System.out.println(" Informe a cidade");
                                arrayPessoas.get(i).cidade = inserir.nextLine();

                                System.out.println(" Informe o estado");
                                arrayPessoas.get(i).estado = inserir.nextLine();

                                System.out.println("Informe o tipo de cadastro(F/J)");
                                char tipoCadastroAltera = inserir.next().charAt(0);
                                tipoCadastro = Character.toUpperCase(tipoCadastroAltera);

                                int inscricaoEstadualAltera = 0;

                                while (tipoCadastroAltera != 'F' && tipoCadastroAltera != 'J') {
                                    System.out.println("Informação inválida, informe novamente (F/J) ");
                                    tipoCadastroAltera = inserir.next().charAt(0);
                                    tipoCadastroAltera = Character.toUpperCase(tipoCadastroAltera);
                                }
                                arrayPessoas.get(i).tipo_Cadastro = tipoCadastroAltera;

                                if (tipoCadastroAltera == 'J') {
                                    System.out.println("Informe a Inscrição Estadual");
                                    inscricaoEstadualAltera = inserir.nextInt();
                                    arrayPessoas.get(i).setinscricao_Estadual(inscricaoEstadualAltera);
                                }

                                System.out.println("Informe a data de Cadastro");
                                inserir.nextLine();                               
                                String dataCadastroAltera = inserir.nextLine();
                                arrayPessoas.get(i).setData_Cdastro(dataCadastroAltera);

                                System.out.println("Informe o email");
                                arrayPessoas.get(i).email = inserir.nextLine();

                                System.out.println("Informe o telefone");
                                arrayPessoas.get(i).telefone = inserir.nextLine();
                            }
                        }
                        break;
                }
            }
        } while (escolhaMenuPessoa != 0);
    }
}