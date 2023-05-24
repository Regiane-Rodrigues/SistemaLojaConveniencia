
package com.mycompany.lojaconveniencia;
import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;
// Analista Responsável : Allan
// Desenvolvedor: Lucas

public class Financeiro {
    private int idFinanceiro;
    private int gerarCobranca;
    private String emissor;
    private String pagador;
    private String extratoPagamento;
    private double saldo;

    
    public Financeiro(int idFinanceiro, int gerarCobranca, String emissor, String pagador, String extratoPagamento, double saldo) {
        this.idFinanceiro = idFinanceiro;
        this.gerarCobranca = gerarCobranca;
        this.emissor = emissor;
        this.pagador = pagador;
        this.extratoPagamento = extratoPagamento;
        this.saldo = saldo;
    }
    
    public int getIdFinanceiro() {
        return idFinanceiro;
    }

    public void setIdFinanceiro(int idFinanceiro) {
        this.idFinanceiro = idFinanceiro;
    }

    public int getGerarCobranca() {
        return gerarCobranca;
    }

    public void setGerarCobranca(int gerarCobranca) {
        this.gerarCobranca = gerarCobranca;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public String getExtratoPagamento() {
        return extratoPagamento;
    }

    public void setExtratoPagamento(String extratoPagamento) {
        this.extratoPagamento = extratoPagamento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void menuFinanceiro(){
        int escolhaMenuFinanceiro = 1;

        System.out.println("-----------------------------------------");
        System.out.println(" || Menu Financeiro || ");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Lançar Pagamento ");
            System.out.println("2 - Documentos Pagos: ");
            System.out.println("3 - Gerar Boleto");
            System.out.println("4 - Controlar Crédito");
            System.out.println("5 - consultar Recebimento");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
               escolhaMenuFinanceiro = inserir.nextInt();
                switch (escolhaMenuFinanceiro) {
                    case 1:
                        lancarPagamento();
                        break;
                    case 2:
                         
                        break;
                    case 3:
                        
                        break;
                    case 4:
                       
                        break;
                    case 5:
                       
                        break;  
                    case 6:
                       
                        break;
                    default:
                        System.out.println("Opção inválida. Favor informar outra opção.");
                        break;
                }
            } else {
                System.out.println("Opção inválida. Favor informar outra opção.");
                inserir.next();
            }
        } while (escolhaMenuFinanceiro != 0);
    }
    public static void lancarPagamento(){
    
        Pagamento formaPagamento = new Pagamento();
        formaPagamento.menuPagamento();
}
    public static void documentosPagos(){
       
        
    }
    
}
