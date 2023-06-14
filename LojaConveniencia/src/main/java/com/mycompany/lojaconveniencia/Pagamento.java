/*  Analista: Lucas Braga
    Programador: Gustavo H.S. Nethson*/
package com.mycompany.lojaconveniencia;

import java.util.Scanner;

interface Pagamento {

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
