
package com.mycompany.lojaconveniencia;


public class Financeiro {
    public int gerarCobranca;
    public int vincucarCliente;
    public double valorDocumento;
    public int dataEmissao;
    public int dataVencimento;
    public String tipoDocumento;
    public String emissor;
    public int extratoPagamento;
    
    private int numeroDocumento;
    private String pagador;

    public Financeiro(int gerarCobranca, int vincucarCliente, double valorDocumento, int dataEmissao, int dataVencimento, String tipoDocumento, String emissor, int extratoPagamento, int numeroDocumento, String pagador) {
        this.gerarCobranca = gerarCobranca;
        this.vincucarCliente = vincucarCliente;
        this.valorDocumento = valorDocumento;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.tipoDocumento = tipoDocumento;
        this.emissor = emissor;
        this.extratoPagamento = extratoPagamento;
        this.numeroDocumento = numeroDocumento;
        this.pagador = pagador;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }
    
    
}
