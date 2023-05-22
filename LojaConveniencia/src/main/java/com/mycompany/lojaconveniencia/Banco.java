package com.mycompany.lojaconveniencia;

import static com.mycompany.lojaconveniencia.LojaConveniencia.arrayDocumentos;
import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;
import java.util.Scanner;
/*
 * Analista: Allan Matheus Pereira
 * Desenvolvedor: Gustavo Henrique Nava
 */
public class Banco {
    
    public String nomeBanco;
    public int agencia;
    public String endereco;
    public String tipoDocumento;
    public String emissor;
    public static int baixarDocPagos;
    public static double valorCredito;
    public double valorDocumento;
    
    private int conta;
    private int digitoConta;
    private int numeroDocumento;
    private String pagador;
    
    
    public void Bancos(){
    
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
                        System.out.println("Deu ruim");
                        /*System.out.println("Informe o numero do cadastro do documento para gerar o boleto: ");
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
                        }*/
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

    public Banco(int conta, int digitoConta, int numeroDocumento, String pagador) {
        this.conta = conta;
        this.digitoConta = digitoConta;
        this.numeroDocumento = numeroDocumento;
        this.pagador = pagador;
    }
    
    public int lancarDocPagar() {
        baixarDocPagos++;
        return this.numeroDocumento;
    }
    
    public int consultarDocReceber() {
        System.out.println("Documento a receber: ");
        System.out.println(" - Conta: " + this.conta);
        System.out.println(" - Digito Conta: " + this.digitoConta);
        System.out.println(" - Pagador: " + this.pagador);
        return this.numeroDocumento;
    }
    
    public double controlarCredito() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Valor do credito atual: "+valorCredito);
        System.out.println("Informe o novo valor do crédito: ");
        valorCredito = ler.nextDouble();
        return valorCredito;
    }
    
    public int gerarBoletos() {
        System.out.println("Gerando boleto para " + this.pagador);
        System.out.println(" - Banco: " + this.nomeBanco);
        System.out.println(" - Agencia: " + this.agencia);
        System.out.println(" - Valor: " + this.valorDocumento);
        return this.numeroDocumento;
    }
    
}
