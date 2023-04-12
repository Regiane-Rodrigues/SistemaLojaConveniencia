package com.mycompany.lojaconveniencia;

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
