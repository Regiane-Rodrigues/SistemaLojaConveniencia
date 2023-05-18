/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaconveniencia;

/**
 *
 * @author regiane.lima
 */
public class pessoaFisica extends pessoa {
    private int cpf;
    private String dataNascimento;

    public pessoaFisica(String nomeCompleto, int telefone, String email, int cep, String cidade, String estado,String rua, int numeroLocal,int cpf, String dataNascimento) {
        super(nomeCompleto, telefone, email, cep, cidade, estado, rua, numeroLocal);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }


    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public void exibirInformacoes(){
    
       super.exibirInformacoes();
        System.out.println("Cpf: " +cpf);
        System.out.println("Data de Nascimento: " +dataNascimento);
        
    }
}
