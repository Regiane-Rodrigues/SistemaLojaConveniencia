package com.mycompany.lojaconveniencia;

public class venda {
    public String produtoVendido;
    public double valorTroco;
    public double quantidadeLucro; 
    public double valorDesconto;
    public double valorPago;
    public double totalCompra;
    public double quantidadeDinheiroCaixa;
    public double valorAberturaCaixa;
    public int numeroCompra;
    public double valorFechamento;
    
    public String registrar_Venda(String produto_Vendido) {
        return "Venda do produto " + produto_Vendido + " registrada.";
    }
    public double abrir_caixa(double valor_Abertura_Caixa) {
        this.valorAberturaCaixa = valor_Abertura_Caixa;
        this.quantidadeDinheiroCaixa = valorAberturaCaixa;
        return this.quantidadeDinheiroCaixa;
    }
    public double finalizar_Processo_Compra(double total_Compra) {
        this.totalCompra= total_Compra;
        this.valorDesconto = total_Compra * 0.05;
        this.valorPago = total_Compra - this.valorDesconto;
        this.valorTroco = 0;
        return this.valorPago;
    }
    public double fechar_Caixa(double valor_Fechamento) {
        this.valorFechamento = valor_Fechamento;
        this.quantidadeDinheiroCaixa += this.valorPago;
        this.quantidadeDinheiroCaixa -= this.valorFechamento;
        this.valorTroco = this.valorPago - this.totalCompra;
        return this.quantidadeDinheiroCaixa;
    }
}
