package com.mycompany.lojaconveniencia;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;
/**
 *
 * @author regiane.lima
 */

 public class Pessoa {
	Scanner inserir = new Scanner(System.in);

	public void menuPessoa(){
		int opcao = -1;

		System.out.println("|| Menu Cadastro Pessoa ||");

		do{

			System.out.println("Escolha uma opção: \n"
					+ "1 - Cadastro Pessoa Física \n" 
					+ "2 - Cadastro Pessoa Juridica \n"
					+ "0 - Sair");
			
			if(inserir.hasNextInt(opcao)){

				switch(opcao){

					case 1:
						PessoaFisica pessoaFisica = new PessoaFisica();
						pessoaFisica.menuPessoaFisica();
					break;
					case 2:
						PessoaJuridica pessoaJuridica = new PessoaJuridica();
						pessoaFisica.menuPessoaJuridica();
					break;
					case 0:
						System.out.println("Programa encerrado!");
					break;
					default:
					System.out.println("Opção inválida. Digite uma opção válida para continuar.");
					break;
				}
			} else {
				System.out.println("Opção inválida.");
				inserir.nextLine();
			}

		} while(opcao != 0);
		
	}
}
