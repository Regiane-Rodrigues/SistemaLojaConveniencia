package com.mycompany.lojaconveniencia;

public class Pagamento {
    //Atributos da classe junto com os seus tipos.
    public String tipoCartao;
    private String numCartao;
    private int validadeCartao;
    private int codSeguranca;
    private int digitarSenha;
    public String statusPagamento;
    
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
