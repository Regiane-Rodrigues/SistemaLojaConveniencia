package com.mycompany.lojaconveniencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class LojaConveniencia {

    static List<Banco> documentos = new ArrayList<>();
    static List<Pessoa> cadastro = new ArrayList<>();
    static Scanner inserir = new Scanner(System.in);

    public static void main(String[] args) {

        //declarando o atributo que serve para escolher a opção do menu, ainda sem solução para caso não seja int
        int escolhaMenu = -1;

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
            //o hasNextInt garante que a entrada precisa ser um número inteiro para prosseguir
            if (inserir.hasNextInt()) {
                escolhaMenu = inserir.nextInt();
                //o switch que escolhe a opção baseada no atributo escolha
                switch (escolhaMenu) {
                    case 1:
                        venda();
                        break;
                    case 2:
                        System.out.println("Teste Compras");
                        break;
                    case 3:
                        System.out.println("Teste Estoque");
                        break;
                    case 4:
                        cadastroProduto();
                        break;
                    case 5:
                        System.out.println("Teste Fiscal");
                        break;
                    case 6:
                        System.out.println("Teste Financeiro");
                        break;
                    case 7:
                        cadastroPessoa();
                        break;
                    case 8:
                        banco();
                        break;
                    case 9:
                        pagamento();
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
                //esse next() é para que o programa não entre em um loop infinito
                inserir.next();
            }

            //a condição para o fim do laço de repetição
        } while (escolhaMenu != 0);

    }

    //menu da classe Banco
    //eu ainda não sei se entendi bem o objetivo da classe
    //mas fiz o possível com os atributos e métodos disponíveis
    public static void banco() {

        int escolhaMenuBanco = -1;

        Banco bancoCadastro;

        System.out.println("-----------------------------------------");
        System.out.println(" || Teste Menu Banco ||");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Lancar Documentos");
            System.out.println("2 - Consultar Documentos");
            System.out.println("3 - Controlar Credito");
            System.out.println("4 - Gerar Boleto");
            System.out.println("0 - Voltar");
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

                        documentos.add(bancoCadastro);

                        System.out.println("Documento nº" + bancoCadastro.lancarDocPagar() + " lancado.");
                        System.out.println("Numero de documentos landacos: " + bancoCadastro.baixarDocPagos);
                        break;

                    case 2:
                        System.out.println("Listando documentos: ");
                        for (int i = 0; i < documentos.size(); i++) {
                            System.out.println("-----------------------------------------");
                            System.out.println("Cadastro Nº " + i);
                            int documentoReceber = documentos.get(i).consultarDocReceber();
                            System.out.println(" - Número do documento: " + documentoReceber);
                        }
                        break;

                    case 3:
                        documentos.get(0).controlarCredito();
                        break;

                    case 4:
                        System.out.println("Informe o numero do cadastro do documento para gerar o boleto: ");
                        if (inserir.hasNextInt()) {
                            int numero = inserir.nextInt();
                            if ((numero > -1) && (numero < documentos.size())) {
                                System.out.println("Informe o valor do boleto: ");
                                if (inserir.hasNextDouble()) {
                                    documentos.get(numero).valorDocumento = inserir.nextDouble();
                                } else {
                                    System.out.println("Valor invalido, cancelando.");
                                    inserir.next();
                                    break;
                                }
                                int boleto = documentos.get(numero).gerarBoletos();
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

            //aqui ele volta para o menu princial ao invés de encerrar o programa
        } while (escolhaMenuBanco != 0);
    }

    //menu da classe Pagamento
    public static void pagamento() {

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
            System.out.println("1 - Contas a pagar");
            System.out.println("2 - Contas a receber");
            System.out.println("0 - Voltar");
            System.out.println("------------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenuPagamento = inserir.nextInt();
                switch (escolhaMenuPagamento) {
                    case 1:
                        System.out.println("Contas a pagar");
                        System.out.println(realizarPagamento.getTipo());
                        System.out.println(realizarPagamento.getNum());
                        System.out.println(realizarPagamento.getValidade());
                        System.out.println(realizarPagamento.getCod());
                        System.out.println(realizarPagamento.getSenha());
                        System.out.println(realizarPagamento.getStatus());
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

    // menu classe venda
    public static void venda() {

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
            System.out.println("1 - Abrir caixa ");
            System.out.println("2 - Fechar caixa ");
            System.out.println("3 - Registrar venda ");
            System.out.println("4 - Finalizar processo de compra ");
            System.out.println("0 - Voltar ");
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

            //aqui ele volta para o menu princial ao invés de encerrar o programa
        } while (escolhaMenuVendas != 0);
    }

    // menu classe cadastroProduto
    public static void cadastroProduto() {

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
            System.out.println("1 - Cadastro de Produto ");
            System.out.println("2 - Cadastro de código ");
            System.out.println("3 - Calcular estoque ");
            System.out.println("4 - Categoria ");
            System.out.println("5 - Cadastrar vendedor ");
            System.out.println("0 - Voltar ");
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

            //aqui ele volta para o menu princial ao invés de encerrar o programa
        } while (escolhaMenuProduto != 0);
    }

    public static void cadastroPessoa() {

        int escolhaMenuPessoa = -1;

        Pessoa pessoa1;

        System.out.println("-------------------------------");
        System.out.println(" || Menu Pessoa ||");

        do {
            System.out.println("------------------------------");
            System.out.println("Escolha a opção desejada! ");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Cliente! ");
            System.out.println("3 - Alterar Cliente! ");

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
                        //String documento = documento.get(numero).gerarBoletos();
                        //System.out.println("Informe a Inscrição estadual");
                        System.out.println("Informe o CEP ");
                        String cep = inserir.nextLine();

                        System.out.println(" Informe o endereco");
                        String endereco = inserir.nextLine();

                        System.out.println("Informe o numero do endereço");
                        String num_Endereco = inserir.nextLine();

                        System.out.println(" Informe a cidade");
                        String cidade = inserir.nextLine();

                        System.out.println(" Informe o estado");
                        String estado = inserir.nextLine();

                        System.out.println("Informe o tipo de cadastro(F/J)");
                        char tipo_Cadastro = inserir.next().charAt(0);
                        tipo_Cadastro = Character.toUpperCase(tipo_Cadastro);

                        int inscricao_Estadual = 0;

                        while (tipo_Cadastro != 'F' && tipo_Cadastro != 'J') {
                            System.out.println("Informação inválida, informe novamente (F/J) ");
                            tipo_Cadastro = inserir.next().charAt(0);
                            tipo_Cadastro = Character.toUpperCase(tipo_Cadastro);
                        }
                        
                        if (tipo_Cadastro == 'J') {
                            System.out.println("Informe a Inscrição Estadual");
                            inscricao_Estadual = inserir.nextInt();
                        }

                        System.out.println("Informe a data de Cadastro");
                        inserir.nextLine();
                        String data_Cadastro = inserir.nextLine();

                        System.out.println("Informe o email");
                        String email = inserir.nextLine();

                        System.out.println("Informe o telefone");
                        String telefone = inserir.nextLine();

                        pessoa1 = new Pessoa(id, documento, data_Cadastro, nome, cep, endereco, cidade, estado, tipo_Cadastro);
                        pessoa1.num_Endereco = num_Endereco;
                        
                        if (tipo_Cadastro == 'J') {
                            pessoa1.setinscricao_Estadual(inscricao_Estadual);

                        }
                        pessoa1.email = email;
                        pessoa1.telefone = telefone;

                        cadastro.add(pessoa1);

                        break;

                    case 2:
                        for (int i = 0; i < cadastro.size(); i++) {
                            cadastro.get(i).listar_Cadastro();
                            System.out.println("----------------------------------");
                        }
                        break;

                    case 3:
                        System.out.println("Informe o ID que deseja alterar: ");
                        int id_altera = inserir.nextInt();

                        for (int i = 0; i < cadastro.size(); i++) {
                            if (cadastro.get(i).getId_Pessoa() == id_altera) {

                                System.out.println("Informe o nome do Cliente");
                                inserir.nextLine();
                                cadastro.get(i).nome = inserir.nextLine();

                                System.out.println("Informe o documento: ");
                                String documentoA = inserir.nextLine();
                                cadastro.get(i).setDocumento(documentoA);
                                //String documento = documento.get(numero).gerarBoletos();
                                //System.out.println("Informe a Inscrição estadual");
                                System.out.println("Informe o CEP ");
                                cadastro.get(i).CEP = inserir.nextLine();

                                System.out.println(" Informe o endereco");
                                cadastro.get(i).endereco = inserir.nextLine();

                                System.out.println("Informe o numero do endereço");
                                cadastro.get(i).num_Endereco = inserir.nextLine();

                                System.out.println(" Informe a cidade");
                                cadastro.get(i).cidade = inserir.nextLine();

                                System.out.println(" Informe o estado");
                                cadastro.get(i).estado = inserir.nextLine();

                                System.out.println("Informe o tipo de cadastro(F/J)");
                                char tipo_CadastroA = inserir.next().charAt(0);
                                tipo_Cadastro = Character.toUpperCase(tipo_CadastroA);

                                int inscricao_EstadualA = 0;

                                while (tipo_CadastroA != 'F' && tipo_CadastroA != 'J') {
                                    System.out.println("Informação inválida, informe novamente (F/J) ");
                                    tipo_CadastroA = inserir.next().charAt(0);
                                    tipo_CadastroA = Character.toUpperCase(tipo_CadastroA);
                                }
                                cadastro.get(i).tipo_Cadastro = tipo_CadastroA;

                                if (tipo_CadastroA == 'J') {
                                    System.out.println("Informe a Inscrição Estadual");
                                    inscricao_EstadualA = inserir.nextInt();
                                    cadastro.get(i).setinscricao_Estadual(inscricao_EstadualA);
                                }

                                System.out.println("Informe a data de Cadastro");
                                inserir.nextLine();
                                String data_CadastroA = inserir.nextLine();
                                cadastro.get(i).setData_Cdastro(data_CadastroA);

                                System.out.println("Informe o email");
                                cadastro.get(i).email = inserir.nextLine();

                                System.out.println("Informe o telefone");
                                cadastro.get(i).telefone = inserir.nextLine();

                            }

                        }
                        break;
                }
            }
        } while (escolhaMenuPessoa != 0);
    }

}
