package com.mycompany.lojaconveniencia;

import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;
import static com.mycompany.lojaconveniencia.LojaConveniencia.menuCadastroProduto;
import static com.mycompany.lojaconveniencia.LojaConveniencia.menuVenda;

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
    
    public void menuVendas(){
     
        int escolhaMenuVendas = 1;
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
