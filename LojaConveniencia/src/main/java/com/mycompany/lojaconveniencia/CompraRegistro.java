package com.mycompany.lojaconveniencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompraRegistro extends Compra{
    
    private static final Scanner scanner = new Scanner(System.in);
    
    private final List<Compra> registro = new ArrayList<>();

    public void registrarCompra() {
        System.out.println("Informe o número da compra: ");
        int idCompra = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha após o próximoInt()

        System.out.println("Informe o número da nota fiscal: ");
        String numNotaFiscal = scanner.nextLine();

        System.out.println("Informe o valor total dos produtos: ");
        double valTotalProd = scanner.nextDouble();

        System.out.println("Informe o valor da nota: ");
        double valorNota = scanner.nextDouble();

    }
}
