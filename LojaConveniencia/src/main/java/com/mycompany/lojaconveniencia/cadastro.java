package com.mycompany.lojaconveniencia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface cadastro {
	
	void adicionar(Scanner inserir,ArrayList<String> cadastro);
	void listar( ArrayList<String> cadastro);
	void editar(Scanner inserir, ArrayList<String> cadastro);
	void excluir(Scanner inserir,ArrayList<String> cadastro);

}