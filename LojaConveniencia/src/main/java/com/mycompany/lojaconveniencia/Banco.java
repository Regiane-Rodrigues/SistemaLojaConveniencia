package com.mycompany.lojaconveniencia;

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
        int novoNumeroDocumento = numeroDocumento + 1;
        this.numeroDocumento = novoNumeroDocumento;
        return novoNumeroDocumento;
    }
    
    public int consultarDocReceber() {
        System.out.println("Documento a receber: ");
        System.out.println(" - Conta: " + this.conta);
        System.out.println(" - Digito Conta: " + this.digitoConta);
        System.out.println(" - Pagador: " + this.pagador);
        return this.numeroDocumento;
    }
    
    public double controlarCredito() {
        return 2000;
    }
    
    public int gerarBoletos() {
        System.out.println("Gerando boleto para " + this.pagador);
        System.out.println(" - Banco: " + this.nomeBanco);
        System.out.println(" - Agencia: " + this.agencia);
        System.out.println(" - Tipo de documento do pagador: " + this.tipoDocumento);
        return this.numeroDocumento;
    }
    
}
