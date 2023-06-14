package com.mycompany.lojaconveniencia;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

//@author Regiane Lima
 
public class CadastroProduto implements Cadastro {

    public int codigoProduto;
    public String descricao;
    public String categoria;
    public String unidadeMedida;
        
    public List<Produto> listaProduto;

    public void exibirInformacoes() {
			System.out.println("Código do produto: " +codigoProduto);
			System.out.println("Descrição: " + descricao);
			System.out.println("Categora: " +categoria);
			System.out.println("Unidade Medida:\n Kg- Quilogramas \nG - Gramas \nL - Litros " + unidadeMedida);
			
		}

    @Override
    public void adicionar() {
      Scanner inserir = new Scanner(System.in);

      System.out.println("Informe o código do produto: \n");
      codigoProduto = inserir.nextInt();
      inserir.nextInt(); //quebra de linha para consumir a próxima string

      System.out.println("Informe a descrição do produto: \n");
      descricao = inserir.nextLine();

    }

    @Override
    public void listar() {
        
    }

    @Override
    public void editar() {
        
    }

    @Override
    public void excluir() {
      
    }

   
}
