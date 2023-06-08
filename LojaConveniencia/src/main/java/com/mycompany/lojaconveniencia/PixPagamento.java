/*  Analista: Lucas Braga
    Programador: Gustavo H.S. Nethson*/
package com.mycompany.lojaconveniencia;

import java.util.Random;
import java.util.Scanner;

class PixPagamento implements Pagamento {

    private Scanner inserir = new Scanner(System.in);

    @Override
    public void realizarPagamento() {
        System.out.println("Informe o valor da compra:");
        double totalCompra = inserir.nextDouble();
        inserir.nextLine();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int tamanhoChave = 20;
        for (int i = 0; i < tamanhoChave; i++) {
            int indice = random.nextInt(caracteres.length());
            char caractere = caracteres.charAt(indice);
            sb.append(caractere);
        }

        String pix = sb.toString();
        System.out.println("Valor total da compra: " + totalCompra);
        System.out.println("Chave pix para realizar pagamento: " + pix);
    }
}
