package com.mycompany.lojaconveniencia;
import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;


/*
 * Analista: Allan Matheus Pereira
 * Desenvolvedor: Gustavo Henrique Nava
 */
public class Banco {


	public int idBanco;
	public String cnpjBanco;
	public String nomeEmpresa;
	public String cep;
	public String estado;
	public String cidade;
	public String numero;


	public void cadastrarBanco(int id, String cnpj, String nome, String cep, String estado, String cidade,
			String numero) {
		this.idBanco = id;
		this.cnpjBanco = cnpj;
		this.nomeEmpresa = nome;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.numero = numero;
	}

	public void editarBanco(int idEdita) {
		if (idEdita == idBanco) {
			cnpjBanco = "66.884.544/0001-88";
			nomeEmpresa = "Bamerindos";
			cep = "78454-123";
			estado = "SP";
			cidade = "São Paulo";
			numero = "3322-5544";
		} else {
			System.out.println("Banco não cadastrado.");
		}
	}

	public void editarBanco(String cnpjEdita) {
		if (cnpjEdita.equals(cnpjBanco)) {
			cnpjBanco = "66.884.544/0001-88";
			nomeEmpresa = "Bamerindos";
			cep = "78454-123";
			estado = "SP";
			cidade = "São Paulo";
			numero = "3322-5544";
		} else {
			System.out.println("Banco não cadastrado.");
		}
	}

	public static void excluirBanco() {
		System.out.println("Teste."); // para excluir primeiro teríamos que salvar em algum lugar
	}

	public String listarBanco(int idLista) {
		if (idLista == idBanco) {
			return "Banco: " + nomeEmpresa + "\nId: " + idBanco + "\nCNPJ: " + cnpjBanco + "\nCEP: " + cep
					+ "\nEstado: " + estado + "\nCidade: " + cidade + "\nNumero: " + numero;
		} else {
			return "Cadastro não encontrado.";
		}
	}

	public String listarBanco(String cnpjLista) {
		if (cnpjLista.equals(cnpjBanco)) {
			return "Banco: " + nomeEmpresa + "\nId: " + idBanco + "\nCNPJ: " + cnpjBanco + "\nCEP: " + cep
					+ "\nEstado: " + estado + "\nCidade: " + cidade + "\nNumero: " + numero;
		} else {
			return "Cadastro não encontrado.";
		}
	}

	public void bancos() {

		int escolhaMenuBanco = -1;
		Banco bancoTeste = new Banco();
		bancoTeste.idBanco = 0;

		System.out.println("-----------------------------------------");
		System.out.println(" || Teste Menu Banco ||");

		do {
			System.out.println("-----------------------------------------");
			System.out.println("Escolha a opção desejada.");
			System.out.println(
					"1 - Cadastrar Banco \n2 - Editar Banco \n3 - Listar Banco \n4 - Excluir Banco \n0 - Voltar");
			System.out.println("-----------------------------------------");

			if (inserir.hasNextInt()) {
				escolhaMenuBanco = inserir.nextInt();
				switch (escolhaMenuBanco) {
				case 1:
					System.out.println(
							"Teste, informações sendo passadas: 1, 12.345.678/5555-01, Losango, 12345-987, Parana, Cascavel, 3333-2222");
					bancoTeste.cadastrarBanco(1, "12.345.678/5555-01", "Losango", "12345-987", "Parana", "Cascavel",
							"3333-2222");
					break;

				case 2:
					System.out.println("1 - Editar por ID \n2 - Editar por cnpj");
					escolhaMenuBanco = inserir.nextInt();
					if (escolhaMenuBanco == 1) {
						System.out.println(
								"Teste, a informação sendo passada no id é 0, para testar a mensagem de falha");
						bancoTeste.editarBanco(0);
					} else if (escolhaMenuBanco == 2) {
						bancoTeste.editarBanco("12.345.678/5555-01");
					}
					break;

				case 3:
					if (bancoTeste.idBanco <= 0) {
						System.out.println("Banco não cadastrado");
					} else {
						bancoTeste.listarBanco(1);
					}
					break;

				case 4:
					System.out.println("Teste");
					bancoTeste.excluirBanco();
					break;

				case 0:
					System.out.println("Voltando.");
					break;

				default:
					System.out.println("Opção inválida. Favor informar outra opção.");
					break;

				}
			} else {
				System.out.println("Opção inválida. Favor informar outra opção.");
				inserir.next();
			}
		} while (escolhaMenuBanco != 0);
	}

    
       

    @Override
    public String toString() {
        return "ID:\t" + idBanco + "\nCNPJ:\t" + cnpjBanco + "\nNOME:\t" + nomeEmpresa + "\nCEP:\t" + cep + "\nESTADO:\t" + estado + "\nCIDADE:\t" + cidade + "\nTEL:\t" + numero +"\n";
    }

}
