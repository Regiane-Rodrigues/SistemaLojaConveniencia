package com.mycompany.lojaconveniencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// @author regiane.lima
 

public class CadastroPessoa implements Cadastro{

	

	public void exibirInformacoes() {
		System.out.println("ID Pessoa: " + idPessoa);
		System.out.println("Nome: " + nomeCompleto);
		System.out.println("Telefone: " + telefone);
		System.out.println("Email: " + email);
		System.out.println("CEP: " + cep);
		System.out.println("Estado: " + estado);
		System.out.println("Cidade: " + cidade);
		System.out.println("Rua: " + rua);
		System.out.println("N°: " + numeroLocal);
	}
	

}
