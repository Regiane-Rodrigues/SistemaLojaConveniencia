/*  Analista: Lucas Braga
    Programador: Gustavo H.S. Nethson*/
package com.mycompany.lojaconveniencia;

import java.util.Scanner;

class PagamentoCartaoDeb implements Pagamento {

    private Scanner inserir = new Scanner(System.in);

    @Override
    public void realizarPagamento() {
        System.out.println("Informe o valor da compra:");
        double totalCompra = inserir.nextDouble();
        inserir.nextLine();

        System.out.println("Numero do cartão:");
        int numeroCartao = inserir.nextInt();
        inserir.nextLine();

        System.out.println("Data vencimento do cartão:");
        String dataVencimentoCartao = inserir.nextLine();

        System.out.println("Código de segurança:");
        int codigoSeguranca = inserir.nextInt();
        inserir.nextLine();

        System.out.println("Informe o nome do titular do cartão:");
        String nomeTitular = inserir.nextLine();

        System.out.println("Pagamento realizado com sucesso.");
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Valor da compra: " + totalCompra);
    }
}
