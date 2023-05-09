package com.mycompany.lojaconveniencia;

import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;

public class Pagamento {
    //Atributos da classe junto com os seus tipos.
    public String tipoCartao;
    private String numCartao;
    private int validadeCartao;
    private int codSeguranca;
    private int digitarSenha;
    public String statusPagamento;
    
    
    public void menuPagamento(){
    
         /*Pagamento realizarPagamento = new Pagamento();

        realizarPagamento.setTipo("Débito");
        realizarPagamento.setNum("0000000000000000");
        realizarPagamento.setValidade(0425);
        realizarPagamento.setCod(666);
        realizarPagamento.setSenha(4002);
        realizarPagamento.setStatus("Autorizado");*/
        
        
    int escolhaMenuPagamento = -1;

        System.out.println("------------------------------------------");
        System.out.println("|| Menu Pagamento ||");

        do {
            System.out.println("------------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Contas a pagar \n2 - Contas a receber \n0 - Voltar");
            System.out.println("------------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenuPagamento = inserir.nextInt();
                switch (escolhaMenuPagamento) {
                    case 1:
                        System.out.println("revisar");
                       // System.out.println("Contas a pagar\n"+ realizarPagamento.getTipo() +"\n"+ realizarPagamento.getNum() +"\n"+ realizarPagamento.getValidade() +"\n"+ realizarPagamento.getCod() +"\n"+ realizarPagamento.getSenha() +"\n"+ realizarPagamento.getStatus());
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

  
    //Constutor da classe com seus atributos devidademente definidos.
    public void PagamentoCartao(String tipo, String num, int validade, int cod, int senha, String status){
        tipoCartao = tipo;
        numCartao = num;
        validadeCartao = validade;
        codSeguranca = cod;
        digitarSenha = senha;
        statusPagamento = status;
    }
    //variavel para definir o tipo do cartão 
    public String getTipo(){
        return "Debito ou Credito: " + tipoCartao; 
    }
    
    public void setTipo(String tipo){
        this.tipoCartao = tipo;
    }
    
    public String getNum(){
        return "Numero: " + numCartao; 
    }
    
    public void setNum(String num){
        this.numCartao = num;
    }
    
    public String getValidade(){
        return "Validade : " + validadeCartao; 
    }
    
     public void setValidade(int validade){
        this.validadeCartao =  validade;
    }
    
    public String getCod(){
        return "Codigo de Segurança: " + codSeguranca;
    }
     
     public void setCod(int cod){
        this.codSeguranca =  cod;
    }
    
    public String getSenha(){
        return "Senha: " + digitarSenha;
    }

     public void setSenha(int senha){
        this.digitarSenha =  senha;
    }
    
    public String getStatus(){
        return "Situação: " + statusPagamento;
    }
     
     public void setStatus(String status){
        this.statusPagamento =  status;
    }
    
}
