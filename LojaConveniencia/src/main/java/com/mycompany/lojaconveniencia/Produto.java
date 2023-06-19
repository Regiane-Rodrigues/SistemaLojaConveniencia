package com.mycompany.lojaconveniencia;

import java.util.Scanner;

public class Produto {
	Scanner inserir = new Scanner(System.in);

	public void menuProduto() {
		int opcao = -1;

		System.out.println("|| Produtos || \n");

		do {			
			System.out.println("Qual função deseja executar:" +
					"\n 1 - Adicionar" +
					"\n 2 - Listar" +
					"\n 3 - Editar" +
					"\n 4 - Excluir" +
					"\n 0 - Cancelar e sair");

			if (inserir.hasNextInt()) {
				opcao = inserir.nextInt();

				switch (opcao) {
					case 1:
						CadastroProduto adicionaProduto = new CadastroProduto();
						adicionaProduto.adicionar();
						break;
					case 2:
						CadastroProduto listarProdutos = new CadastroProduto();
						listarProdutos.listar();
						break;
					case 3:
						CadastroProduto editaProduto = new CadastroProduto();
						editaProduto.editar();
						break;
					case 4:
						CadastroProduto excluiProduto = new CadastroProduto();
						excluiProduto.excluir();
						break;
					case 0:
						System.out.println("Sistema encerrado.");
						break;
					default:
						System.out.println("Opção inválida. Digite uma opção válida para continuar.");
						break;
				}
			}

			System.out.println("Opção invalida.");
			inserir.nextLine();

		} while (opcao != 0);

	}

}
