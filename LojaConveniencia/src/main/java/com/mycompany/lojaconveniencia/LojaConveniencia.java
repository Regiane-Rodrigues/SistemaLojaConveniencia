
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
            //o hasNextInt garante que a entrada precisa ser um número inteiro para prosseguir
            if (ler.hasNextInt()) {
                escolha = ler.nextInt();
                //o switch que escolhe a opção baseada no atributo escolha
                switch (escolha) {
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
                        System.out.println("Teste Cadastro Pessoa");
                        break;
                    case 8:
                        banco();
                        break;
                    case 9:
                        Pagamento();
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
                ler.next();
            }
            
        //a condição para o fim do laço de repetição
        } while (escolha != 0);
        
    }
    
    //menu da classe Banco
    //eu ainda não sei se entendi bem o objetivo da classe
    //mas fiz o possível com os atributos e métodos disponíveis
    public static void banco() {
        
        Scanner ler = new Scanner(System.in);
        
        int escolha = -1;
        
        Banco banco1;
        
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
            
            if (ler.hasNextInt()) {
                escolha = ler.nextInt();
                switch (escolha) {
                    case 1:
                        System.out.println("Informe o nome do banco: ");
                        ler.nextLine();
                        String nomeB = ler.nextLine();
                        
                        System.out.println("Informe a agencia: ");
                        int numAgencia = ler.nextInt();
                        
                        System.out.println("Informe o endereco do banco: ");
                        ler.nextLine();
                        String enderecoBanco = ler.nextLine();
                        
                        System.out.println("Informe o tipo do documento: ");
                        String tipoDoc = ler.nextLine();
                        
                        System.out.println("Informe o emissor: ");
                        String emissorDoc = ler.nextLine();
                        
                        System.out.println("Informe o numero da conta: ");
                        int numConta = ler.nextInt();
                        
                        System.out.println("Informe o digito da conta: ");
                        int numDigito = ler.nextInt();
                        
                        System.out.println("Informe o numero do documento: ");
                        int numDocumento = ler.nextInt();
                        
                        System.out.println("Informe o nome do pagador: ");
                        ler.nextLine();
                        String nomePagador = ler.nextLine();
                        
                        System.out.println("Informe o valor do documento: ");
                        double valorD = ler.nextDouble();
                        
                        banco1 = new Banco(numConta, numDigito, numDocumento, nomePagador);
                        banco1.nomeBanco = nomeB;
                        banco1.agencia = numAgencia;
                        banco1.endereco = enderecoBanco;
                        banco1.tipoDocumento = tipoDoc;
                        banco1.emissor = emissorDoc;
                        banco1.valorDocumento = valorD;
                        
                        documentos.add(banco1);
                        
                        System.out.println("Documento nº" + banco1.lancarDocPagar() + " lancado.");
                        System.out.println("Numero de documentos landacos: " +banco1.baixarDocPagos);
                        break;
                        
                    case 2:
                        System.out.println("Listando documentos: ");
                        for (int i = 0; i < documentos.size(); i++) {
                            System.out.println("-----------------------------------------");
                            System.out.println("Cadastro Nº "+i);
                            int documentoReceber = documentos.get(i).consultarDocReceber();
                            System.out.println(" - Número do documento: " + documentoReceber);
                        }
                        break;
                        
                    case 3:
                        documentos.get(0).controlarCredito();
                        break;
                        
                    case 4:
                        System.out.println("Informe o numero do cadastro do documento para gerar o boleto: ");
                        if (ler.hasNextInt()) {
                            int numero = ler.nextInt();
                            if ((numero > -1) && (numero < documentos.size())) {
                                System.out.println("Informe o valor do boleto: ");
                                if (ler.hasNextDouble()) {
                                    documentos.get(numero).valorDocumento = ler.nextDouble();
                                } else {
                                    System.out.println("Valor invalido, cancelando.");
                                    ler.next();
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
                ler.next();
            }
            
        //aqui ele volta para o menu princial ao invés de encerrar o programa
        } while (escolha != 0);
    }
    
    //menu da classe Pagamento
    public static void Pagamento(){
        Scanner ler = new Scanner(System.in);
        
        Pagamento pgt1 = new Pagamento();
        
        pgt1.setTipo("Débito");
        pgt1.setNum(0000000000000000);
        pgt1.setValidade(0425);
        pgt1.setCod(666);
        pgt1.setSenha(4002);
        pgt1.setStatus("Autorizado");
        
        int escolha = -1;
        
        System.out.println("------------------------------------------");
        System.out.println("|| Menu Pagamento ||");
        
        do {
            System.out.println("------------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Contas a pagar");
            System.out.println("2 - Contas a receber");
            System.out.println("0 - Voltar");
            System.out.println("------------------------------------------");
                
            if (ler.hasNextInt()){
                escolha = ler.nextInt();
                switch (escolha){
                    case 1:
                        System.out.println("Contas a pagar");
                        System.out.println(pgt1.getTipo());
                        System.out.println(pgt1.getNum());
                        System.out.println(pgt1.getValidade());
                        System.out.println(pgt1.getCod());
                        System.out.println(pgt1.getSenha());
                        System.out.println(pgt1.getStatus());
                        break;
                        
                    case 2:
                        System.out.println("Contas a receber");
                        break;
                        
                    default:
                        System.out.println("Opção inválida. Favor informar outra opção.");
                        break;
                }
            }else{
                System.out.println("Opção inválida. Favor informar outra opção.");
                ler.next();
            }
            
            
        } while (escolha != 0);
    }
    // menu classe venda
    public static void venda(){
        Scanner ler = new Scanner(System.in);
        
         int escolha = -1;
        
        venda venda = new venda();
        venda.abrir_caixa(1000.00);
        venda.registrar_Venda("Costela Minga 3,400 KGS ");
        double valorCompra = 210.55;
        venda.valorDesconto = 1.50;
        venda.finalizar_Processo_Compra(valorCompra);
        venda.fechar_Caixa(1210.55);
        
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
            
            if (ler.hasNextInt()) {
                escolha = ler.nextInt();
                switch (escolha) {
                    case 1: 
                        System.out.println("Caixa aberto: " + venda.valorAberturaCaixa);
                        break;
                    case 2:
                        System.out.println("Valor do fechamento: " + venda.valorFechamento);               
                        break;
                    case 3:
                        System.out.println("Registrar venda: " + venda.registrar_Venda(""));
                        break;
                    case 4:
                        System.out.println("Finalizar processo de compra: " + venda.totalCompra);
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
                ler.next();
            }
            
        //aqui ele volta para o menu princial ao invés de encerrar o programa
        } while (escolha != 0);
    }

    // menu classe cadastroProduto
    public static void cadastroProduto(){
        Scanner ler = new Scanner(System.in);
        
         int escolha = -1;
        
        cadastroProduto cadastro = new cadastroProduto();

        cadastro.cadastroDeProduto("Energético Monster");
        cadastro.cadastroCodigo(5555.5555);
        cadastro.calcularestoque(escolha);
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
            
            if (ler.hasNextInt()) {
                escolha = ler.nextInt();
                switch (escolha) {
                    case 1: 
                        System.out.println("Informe o nome do produto: " + cadastro.decricaoProduto);
                        break;
                    case 2:
                        System.out.println("Código cadastrado no produto: " + cadastro.cadastroCodigo(escolha));               
                        break;
                    case 3:
                        System.out.println("Quantidade em estoque: " + cadastro.calcularestoque(escolha));
                        break;
                    case 4:
                        System.out.println("Este produto faz parte da categoria de: " + cadastro.categoria(null) );
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
                ler.next();
            }
            
        //aqui ele volta para o menu princial ao invés de encerrar o programa
        } while (escolha != 0);        
    }
}
