/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaconveniencia;

/**
 *
 * @author regiane.lima
 */
public class PessoaJuridica extends Pessoa {

	private String cnpj;
	private String nomeEmpresa;
	private String setorAtuacao;

	public PessoaJuridica(String nomeCompleto, int telefone, String email, int cep, String cidade, String estado,
			String rua, int numeroLocal, String cnpj, String nomeEmpresa, String setorAtuacao) {

		super(nomeCompleto, telefone, email, cep, cidade, estado, rua, numeroLocal);

		this.cnpj = cnpj;
		this.nomeEmpresa = nomeEmpresa;
		this.setorAtuacao = setorAtuacao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getSetorAtuacao() {
		return setorAtuacao;
	}

	public void setSetorAtuacao(String setorAtuacao) {
		this.setorAtuacao = setorAtuacao;
	}

	@Override
	public void exibirInformacoes() {

		super.exibirInformacoes();
		System.out.println("Cnpj: " + cnpj);
		System.out.println("Nome da Empresa: " + nomeEmpresa);
		System.out.println("Setor Atuação: " + setorAtuacao);
	}

}
