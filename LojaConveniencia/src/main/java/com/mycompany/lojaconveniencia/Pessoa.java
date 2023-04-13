package com.mycompany.lojaconveniencia;
// Desenvolvedor : Lucas Braga de Lima
// Analista : Gustavo Nava

import java.util.Date;


public class Pessoa {
    private int id_Pessoa;
    private String documento;
    private int inscricao_Estadual;
    private String data_Cadastro;
    
    public String nome;
    public String CEP; 
    public String endereco; 
    public String num_Endereco; 
    public String cidade;
    public String estado;
    public char tipo_Cadastro;
    public String email;
    public String telefone;

    public Pessoa(int id_Pessoa, String documento, String data_Cadastro, String nome, String CEP, String endereco, String cidade, String estado, char tipo_Cadastro) {
        this.id_Pessoa = id_Pessoa;
        this.documento = documento;
        this.data_Cadastro = data_Cadastro;
        this.nome = nome;
        this.CEP = CEP;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.tipo_Cadastro = tipo_Cadastro;
    }
    
    public int getId_Pessoa() {
        return id_Pessoa;
    }
    public void setId_Pessoa(int id_Pessoa) { 
        this.id_Pessoa = id_Pessoa;
    }  //o atributo so recebe valor atravez do set
       //define um valor a um atributo
       // retorna id Pessoa
    
    
    public String documento() {
        return documento;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }
    
    
    public int getinscricao_Estadual() {
        return inscricao_Estadual;
    }
    public void setinscricao_Estadual(int inscricao_Estadual) {
         this.inscricao_Estadual = inscricao_Estadual;
    }
    
    
    public String getData_Cadastro(){
        return data_Cadastro;
    }
    public void setData_Cdastro(String data_Cadastro){
        this.data_Cadastro = data_Cadastro;
    }
    public void listar_Cadastro(){
        
        System.out.println("id : " + this.id_Pessoa);
        System.out.println("Nome: " + this.nome);
        
        if(this.tipo_Cadastro == 'F'){
            System.out.println("CPF: " + this.documento);
               }else{
            System.out.println("CNPJ" + this.documento);
        }
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Email: " + this.email);
        System.out.println("Estado: " + this.estado);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Número do Endereco: " + this.num_Endereco);
        System.out.println("Telefone: " + this.telefone);
    }
    
}