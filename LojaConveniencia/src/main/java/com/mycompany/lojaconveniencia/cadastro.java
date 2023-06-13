package com.mycompany.lojaconveniencia;
import java.util.ArrayList;
import java.util.Scanner;

public interface cadastro {
	
	void adicionar(Scanner inserir,ArrayList<cadastro> List);
	void listar( ArrayList<cadastro> List);
	void editar(Scanner inserir,ArrayList<cadastro> List);
	void excluir(Scanner inserir,ArrayList<cadastro> List);

}