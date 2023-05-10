package com.mycompany.lojaconveniencia;

import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;
import java.util.Scanner;

public class Pagamento {

    public String formaDePagamento; 
    public String tipoCartao;
    private String numCartao;
    public String statusPagamento;
    
    private int validadeCartao;
    private int codSeguranca;
    private int digitarSenha;
    
    
    public void menuPagamento(){
            
    int escolhaMenuPagamento = -1;

        System.out.println("------------------------------------------ \n || Menu Pagamento ||");

        do {
            System.out.println("------------------------------------------\n Escolha uma forma de pagamento: \n1 - Contas a pagar \n2 - Contas a receber \n0 - Voltar \n------------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenuPagamento = inserir.nextInt();
                switch (escolhaMenuPagamento) {
                    case 1:
                        System.out.println("Forma de pagamento");
                        break;

                    case 2:
                        System.out.println("Cadastrar cartão");
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

  
    //Constutor da classe.
    public void PagamentoCartao(String forma, String tipo, String num, int validade, int cod, int senha, String status){
        this.formaDePagamento = forma;
        this.tipoCartao = tipo;
        this.numCartao = num;
        this.validadeCartao = validade;
        this.codSeguranca = cod;
        this.digitarSenha = senha;
        this.statusPagamento = status;
    }
    
    public void contasApagar(){
        Scanner ler = new Scanner(System.in);
        
    }
    
    public void cadastrarCartao(){
        
    }
}
