/*  Analista: Lucas Braga
    Programador: Gustavo H.S. Nethson*/
package com.mycompany.lojaconveniencia;

import java.util.Scanner;

class PagamentoCartaoCred implements Pagamento {

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

        System.out.println("Informe o número de parcelas (no máximo 6x):");
        int quantidadeParcelas = inserir.nextInt();

        if (quantidadeParcelas <= 6) {
            double aux = totalCompra / quantidadeParcelas;
            System.out.println("--------------------------------------------");
            System.out.println("Pagamento realizado com sucesso.");
            System.out.println("Titular: " + nomeTitular);
            System.out.println("Compra realizada: " + quantidadeParcelas + "x " + aux + "\n");
        } else {
            System.out.println("Compra recusada. Não é possível parcelamento nessas condições.\n");
        }
    }
}
