/*  Analista: Lucas Braga
    Programador: Gustavo H.S. Nethson*/
package com.mycompany.lojaconveniencia;

import java.util.Scanner;

public class MenuPagamento {

    private Scanner inserir = new Scanner(System.in);

    public void exibirMenu() {
        System.out.println("Informe a forma de pagamento:");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Pix");
        System.out.println("3 - Cartão de Crédito");
        System.out.println("4 - Cartão de Débito");
        System.out.println("0 - Cancelar");
        
        MenuPagamento menu = new MenuPagamento();
        Pagamento pagamento = null;

        while (true) {
            int escolha = menu.lerEscolha();

            switch (escolha) {
                case 1:
                    pagamento = new DinheiroPagamento();
                    break;
                case 2:
                    pagamento = new PixPagamento();
                    break;
                case 3:
                    pagamento = new CartaoCreditoPagamento();
                    break;
                case 4:
                    pagamento = new CartaoDebitoPagamento();
                    break;
                case 0:
                    System.out.println("Pagamento cancelado");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida");
                    continue;
            }

            pagamento.realizarPagamento();
        }
    }

    public int lerEscolha() {
        if (inserir.hasNextInt()) {
            return inserir.nextInt();
        } else {
            inserir.nextLine();
            return -1;
        }
    }
}
