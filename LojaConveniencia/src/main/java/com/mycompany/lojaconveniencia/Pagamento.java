/*  Analista: Lucas Braga
    Programador: Gustavo H.S. Nethson*/
package com.mycompany.lojaconveniencia;

import java.util.Scanner;
import java.util.Random; //responsável por gerar string aleatórias
import java.util.List;
import java.util.ArrayList;


interface Pagamento {

	List<Pagamento> lista1 = new ArrayList<>();
	List<Pagamento> lista2 = new ArrayList<>();
	List<Pagamento> lista3 = new ArrayList<>();
	List<Pagamento> lista4 = new ArrayList<>();

	Scanner inserir = new Scanner(System.in);

	public int numeroCartao;
	public int codigoSeguranca;
	public String dataVencimentoCartao;
	public String nomeTitular;
	public int quantidadeParcelas;
	public double valorRecebido;
	public double troco;
	public double totalCompra;
	public int tipo;
	public String pix;

	public static void menuPagamento() {

		System.out.println(" Informe a forma de pagamento: ");

		int escolha = -1;

		do {

			System.out.println("1 - Dinheiro");
			System.out.println("2 - Pix");
			System.out.println("3 - Cartão de Crédito");
			System.out.println("4 - Cartão de Débito");
			System.out.println("5 - Listar Pagamentos");
			System.out.println("0 - Cancelar");

			if (inserir.hasNextInt()) {
				escolha = inserir.nextInt();
				switch (escolha) {
				case 1:
					realizarPagamento(tipo, totalCompra, troco, valorRecebido);
					break;
				case 2:
					realizarPagamento(tipo, pix, totalCompra);
					break;
				case 3:
					realizarPagamento(tipo, totalCompra, numeroCartao, codigoSeguranca, dataVencimentoCartao,
							nomeTitular, quantidadeParcelas);
					break;
				case 4:
					realizarPagamento(tipo, totalCompra, numeroCartao, codigoSeguranca, dataVencimentoCartao,
							nomeTitular);
					break;
				case 5:
					listarPagamento();
					break;
				case 0:
					System.out.println("Pagamento cancelado");
					break;
				default:
					System.out.println("Opção inválida");
				}
			} else {
				System.out.println("Opção inválilda");
				inserir.nextLine();
			}

		} while (escolha != 0);

	}

	// PAGAMENTO EM DINHEIRO
	public static void realizarPagamento(int tipo, double totalCompra, double valorRecebido) {
		this.tipo = 1;
		lista1.add(new Pagamento());
		for (int i = 0; i < lista1.size(); i++) {
			System.out.println("Informe o valor da compra");
			lista1.get(i).totalCompra = inserir.nextDouble();
			inserir.nextLine(); // funciona com uma quebra de linha para consumir a próxima string

			System.out.println("Informe o valor recebido:");
			lista1.get(i).valorRecebido = inserir.nextDouble();

		}

		Pagamento Troco = new Pagamento();
		Troco.exibirInformacoes();

	}

	public void exibirInformacoes() {
		this.tipo = 1;

		troco = valorRecebido - totalCompra;

		System.out.println("Troco: " + troco);
		System.out.println("Pagamento realizado com sucesso.\n");

	}

	// GERA CHAVE ALEATÓRIA PARA PAGAMENTO POR PIX
	public static String realizarPagamento(int tipo, String pix, double totalCompra) {
		this.tipo = 2;
		System.out.println("Informe o valor da compra");
		totalCompra = inserir.nextDouble();
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";// INFORMAR O CARACTERES
																								// QUE SERÃO ACEITOS NA
																								// STRING
		Random random = new Random();// CHAMADA DA BIBLIOTECA RANDOM. ESCOLHE OS CARACTERES ALEATÓRIAMENTE.
		StringBuilder sb = new StringBuilder();// TRANSFORMA OS VALORES EM UMA UNICA STRING.
		int tamanhoChave = 20; // LIMITA O TAMANHO DA CHAVE
		for (int i = 0; i < tamanhoChave; i++) {
			int indice = random.nextInt(caracteres.length());// PERCORRE O INDICE E ACRESCENTA O VALOR
			char caractere = caracteres.charAt(indice);
			sb.append(caractere);
		}

		pix = sb.toString();// VARIAVEL RECEBE A STRING
		System.out.println("Valor total da compra: " + totalCompra);
		System.out.println("Chave pix para realizar pagamento: " + pix);

		return null;
	}

	// PAGAMENTO POR CARTÃO DE CRÉDITO
	public static void realizarPagamento(int tipo, double totalCompra, int numeroCartao, int codigoSeguranca,
			String dataVencimentoCartao, String nomeTitular, int quantidadeParcelas) {
		this.tipo = 3;
		double aux; // variavel auxiliar apenas para apresentar o resultado

		System.out.println("PAGAR COM CARTÃO DE CRÉDITO; ");
		System.out.println("Informe o valor da compra");
		totalCompra = inserir.nextDouble();
		inserir.nextLine(); // funciona com uma quebra de linha para consumir a próxima string

		System.out.println("Numero do cartão: ");
		numeroCartao = inserir.nextInt();
		inserir.nextLine(); // quebra de linha para consumir a próxima string

		System.out.println("Data vencimento do cartão: ");
		dataVencimentoCartao = inserir.nextLine();

		System.out.println("Código de segurança: ");
		codigoSeguranca = inserir.nextInt();
		inserir.nextLine();

		System.out.println("Informe o nome do titular do cartão: ");
		nomeTitular = inserir.nextLine();

		System.out.println("Informe o numero de parcelas (no máximo 6x): ");
		quantidadeParcelas = inserir.nextInt();

		if (quantidadeParcelas <= 6) {

			aux = totalCompra / quantidadeParcelas; // recebe o valor da compra e divide pela quantidade de parcelas
			System.out.println("--------------------------------------------");
			System.out.println("Pagamento realizado com sucesso.");
			System.out.println("Titular: " + nomeTitular);
			System.out.println("Compra realizada: " + quantidadeParcelas + " x " + aux + "\n");
		} else {

			System.out.println("Compra recusada. Não é possível parcelamento nessas condições\n");
		}
	}

	// PAGAMENTO POR CARTÃO DÉBITO
	public static void realizarPagamento(int tipo, double totalCompra, int numeroCartao, int codigoSeguranca,String dataVencimentoCartao, String nomeTitular) {
		this.tipo = 4;

		System.out.println("Informe o valor da compra");
		totalCompra = inserir.nextDouble();
		inserir.nextLine(); // funciona com uma quebra de linha para consumir a próxima string

		System.out.println("Numero do cartão: ");
		numeroCartao = inserir.nextInt();
		inserir.nextLine(); // quebra de linha para consumir a próxima string

		System.out.println("Data vencimento do cartão: ");
		dataVencimentoCartao = inserir.nextLine();

		System.out.println("Código de segurança: ");
		codigoSeguranca = inserir.nextInt();
		inserir.nextLine();

		System.out.println("Informe o nome do titular do cartão: ");
		nomeTitular = inserir.nextLine();

		System.out.println("Pagamento realizado com sucesso.");
		System.out.println("Titular: " + nomeTitular);
		System.out.println("Valor da compra: " + totalCompra);
	}

	public void listarPagamento() {

		for (Pagamento dinheiro : lista1) {
			System.out.println("Pagamentos realizados em dinheiro:");
			dinheiro.exibirInformacoes();
		}

	}


    void realizarPagamento();
}

class DinheiroPagamento implements Pagamento {

    private Scanner inserir = new Scanner(System.in);

    @Override
    public void realizarPagamento() {
        System.out.println("Informe o valor da compra:");
        double totalCompra = inserir.nextDouble();
        inserir.nextLine();

        System.out.println("Informe o valor recebido:");
        double valorRecebido = inserir.nextDouble();

        double troco = valorRecebido - totalCompra ;

        System.out.println("Troco: " + troco);
        System.out.println("Pagamento realizado com sucesso.\n");
    }

}
