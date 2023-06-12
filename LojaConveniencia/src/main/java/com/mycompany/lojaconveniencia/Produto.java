package com.mycompany.lojaconveniencia;

import java.util.List;

public class Produto {

	public int codigoProduto;
	private String descricao;
	private String categoria;
	private char unidadeMedida;
	
	
	public void Produto(int codigoProduto, String descricao, String categoria, char unidadeMedida) {
		
                this.codigoProduto = codigoProduto;
		this.categoria = categoria;
                this.descricao = descricao;
                this.unidadeMedida = unidadeMedida;
		
		
	}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public char getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(char unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
        
        
	
	// classe auxiliar para apresentar info
		public void exibirInformacoes() {
			System.out.println("Código do produto: " +codigoProduto);
			System.out.println("Descrição: " + descricao);
			System.out.println("Categora: " +categoria);
			System.out.println("Unidade Medida:\n Kg- Quilogramas \nG - Gramas \nL - Litros " + unidadeMedida);
			
		}

		// Lista de forma ordenada utilizando os atributos da classe
		public static void adicionarPessoa(List<Produto> cadastro, Produto produto) {

			cadastro.add(produto);
		}

		// Edita o cadastro através do ID e "seta" novas informações
		public static void editarPessoa(List<Produto> cadastro, int codigoProduto, String novaDescrição, String novaCategoria, char unidadeMedida) {

			if (codigoProduto >= 0 && codigoProduto < cadastro.size()) {
                            
                                Produto produto = cadastro.get(codigoProduto);
				produto.setDescricao(novaDescrição);
                                produto.setCategoria(novaCategoria);
                                produto.setUnidadeMedida(unidadeMedida);
				
			}

		}

		// Busca o cadastro atrvés do ID e remove por completo da Lista
		public static void excluirPessoas(List<Produto> cadastro, int codigoProduto) {

			if (codigoProduto >= 0 && codigoProduto < cadastro.size()) {

				cadastro.remove(codigoProduto);
			}

		}

		// Apresenta a lista ordenado chamando o metodo auxiliar para apresentar a
		// informação
		public static void listarPessoas(List<Produto> cadastro) {

			for (Produto produto : cadastro) {

				produto.exibirInformacoes();
			}

		}
	
	
}
