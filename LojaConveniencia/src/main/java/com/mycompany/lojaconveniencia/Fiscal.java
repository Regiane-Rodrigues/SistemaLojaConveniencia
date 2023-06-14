/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaconveniencia;

import java.util.Scanner;

/**
 *
 * @author Maycon 00234481
 *
 */
public class fiscal {

	Scanner ler = new Scanner(System.in);

	public int idFiscal;
	public int numeroNotaFiscal;
	private String valorTotal;
	public String tipoNota;
	public double imposto;
	public double juros;
	public double multa;
	private String dataEmissao;
	private String dataVencimento;

	public fiscal(int idFiscal, int numeroNotaFiscal, String valorTotal, String tipoNota, double imposto, double juros,
			double multa, String dataEmissao, String dataVencimento) {
		this.idFiscal = idFiscal;
		this.numeroNotaFiscal = numeroNotaFiscal;
		this.valorTotal = valorTotal;
		this.tipoNota = tipoNota;
		this.imposto = imposto;
		this.juros = juros;
		this.multa = multa;
		this.dataEmissao = dataEmissao;
		this.dataVencimento = dataVencimento;
	}

	public void menuFiscal() {
		int opcao = 1;
		System.out.println("-----------------------------");
		System.out.println("Menu fiscal");
		System.out.println("-----------------------------");

		do {
			System.out.println("-----------------------------------------");
			System.out.println("Escolha a opção desejada.");
			System.out.println(
					"1 - Emitir nota Fiscal \n 2 - Calcular imposto \n 3 - Calcular Juros \n 4 - Calcular multa");
			System.out.println("-----------------------------------------");
			if (ler.hasNextInt()) {
				opcao = ler.nextInt();

				switch (opcao) {
				case 1:
					emitirNotaFiscal();
					break;
				case 2:
					CalcImposto();
					break;
				case 3:
					clacJuros();
					break;
				case 4:
					calcularMultas();
					break;
				case 0:
					System.out.println("Obrigado Volte Sempre!");
					break;
				default:
					System.out.println("Opção inválida. Favor informar outra opção.");
					break;
				}
			} else {
				System.out.println("Opção inválida. Favor informar outra opção.");
				ler.next(); // favor não apagar garante que o menu não entre em loop infinito caso uma
							// informação errada seja passada no scanner
			}
		} while (opcao != 0);
	}

	public void emitirNotaFiscal() {
		System.out.println("Informe numero da Nota Fiscal: ");
		numeroNotaFiscal = ler.nextInt();
		System.out.println("numero da Nota Fiscal: " + numeroNotaFiscal);

		System.out.println("Informe o valor da nota: ");
		valorTotal = ler.nextLine();

		System.out.println("Informe o tipo da nota: ");
		tipoNota = ler.nextLine();

		System.out.println("Informe a data da emissão: ");
		dataEmissao = ler.nextLine();

		System.out.println("Informe a data de vencimento: ");
		dataVencimento = ler.nextLine();

		System.out.println(numeroNotaFiscal + valorTotal + tipoNota + dataEmissao + dataVencimento);
	}

	public void CalcImposto() {

		System.out.println("Informe a data de vencimento: ");
		dataVencimento = ler.nextLine();

		System.out.println("Informe o calculo a ser feito: ");
		multa = ler.nextDouble();

		System.out.println(dataVencimento + multa);
	}

	public void clacJuros() {

		System.out.println("Informe a quantidade de juros em %: ");
		juros = ler.nextDouble();

		System.out.println(juros);
	}

	public void calcularMultas() {
		System.out.println("Informe a quantidade de multa a acrecentar: ");
		multa = ler.nextDouble();

		System.out.println(multa);
	}
}