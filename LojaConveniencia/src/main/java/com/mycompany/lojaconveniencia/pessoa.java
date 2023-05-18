/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaconveniencia;

import java.util.List;

/**
 *
 * @author regiane.lima
 */
public class pessoa {
    private static int contador = 0;

    private String nomeCompleto;
    private int telefone;
    private String email;
    private int cep;
    private String estado;
    private String cidade;
    private String rua;
    private int numeroLocal;
    private int idPessoa;

    public pessoa(String nomeCompleto, int telefone, String email, int cep, String cidade, String estado, String rua, int numeroLocal) {

        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numeroLocal = numeroLocal;
        // Deixa o id de forma automática, passando o numero ao contador a cada pessoa adicionada.
        this.idPessoa = ++contador;

    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroLocal() {
        return numeroLocal;
    }

    public void setNumeroLocal(int numeroLocal) {
        this.numeroLocal = numeroLocal;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    // classe auxiliar para apresentar info
    public void exibirInformacoes() {
        System.out.println("ID Pessoa: "+ idPessoa);
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("CEP: " + cep);
        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
        System.out.println("Rua: " + rua);
        System.out.println("N°: " + numeroLocal);

    }

    //Lista de forma ordenada utilizando os atributos da classe
    public static void adicionarPessoa(List<pessoa> cadastro, pessoa Pessoa) {

        cadastro.add(Pessoa);
    }

    // Edita o cadastro através do ID e "seta" novas informações
    public static void editarPessoa(List<pessoa> cadastro, int idPessoa, String novoNome, int novoTelefone, String novoEmail, int novoCep, String novoEstado, String novaCidade, String novaRua, int novoNumeroLocal) {

        if (idPessoa >= 0 && idPessoa < cadastro.size()) {

            pessoa Pessoa = cadastro.get(idPessoa);
            Pessoa.setNomeCompleto(novoNome);
            Pessoa.setTelefone(novoTelefone);
            Pessoa.setEmail(novoEmail);
            Pessoa.setCep(novoCep);
            Pessoa.setEstado(novoEstado);
            Pessoa.setCidade(novaCidade);
            Pessoa.setRua(novaRua);
            Pessoa.setNumeroLocal(novoNumeroLocal);
        }

    }
    //Busca o cadastro atrvés do ID e remove por completo da Lista
    public static void excluirPessoas(List<pessoa> cadastro, int idPessoa) {

        if (idPessoa >= 0 && idPessoa < cadastro.size()) {
                     
        cadastro.remove(idPessoa);
        }

    }

    //Apresenta a lista ordenado chamando o metodo auxiliar para apresentar a informação
    public static void listarPessoas(List<pessoa> cadastro) {
        
        for(pessoa Pessoa : cadastro){
        
            Pessoa.exibirInformacoes();        
        }

    }
}
