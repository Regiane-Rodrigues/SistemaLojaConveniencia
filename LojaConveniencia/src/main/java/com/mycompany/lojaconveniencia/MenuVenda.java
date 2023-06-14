package com.mycompany.lojaconveniencia;

import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;
import static com.mycompany.lojaconveniencia.LojaConveniencia.menuCadastroProduto;
import static com.mycompany.lojaconveniencia.LojaConveniencia.menuVenda;

/**
 * @author allan
 */
public class MenuVenda {
    
    public static void main(String[] args) {
    Venda venda = new Venda(56, 567, 7.50);
    String mensagem = venda.registrarVenda();
    System.out.println(mensagem);
    System.out.println("-----------------------------------------");
    System.out.println(" || Menu Venda ||");

        int escolhaMenuVendas = 1;           
	do {
	System.out.println("-----------------------------------------");
	System.out.println("Escolha a opção desejada.");
	System.out.println("1 - Inserir produto \n2 - Informar valor total \n3 - Conceder desconto \n0 - Voltar ");
	System.out.println("-----------------------------------------");

	    if (inserir.hasNextInt()) {
		escolhaMenuVendas = inserir.nextInt();
		switch (escolhaMenuVendas) {
                    case 1:
		System.out.println();
                    break;
                    case 2:
		System.out.println();
                    break;
                    case 3:
		System.out.println();
                    break;
                    case 0:
		System.out.println("Voltando");
                    break;
                    default:
		System.out.println("Opção inválida. Favor informar outra opção.");
                    break;
		}
	        } else {
		System.out.println("Opção inválida. Favor informar outra opção.");
		inserir.next();
                    }
		} while (escolhaMenuVendas != 0);
    }
}
