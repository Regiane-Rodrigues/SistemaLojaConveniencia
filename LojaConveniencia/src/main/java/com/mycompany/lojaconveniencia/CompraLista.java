/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaconveniencia;

import java.util.List;

/**
 *
 * @author aluno
 */
public class CompraLista extends Compra {

    private List<Compra> registro;

    public CompraLista(List<Compra> registro) {
        this.registro = registro;
    }

    CompraLista() {
    }

    public void listarProdutos() {
        for (Compra compra : registro) {
            System.out.println(registro);
        }
    }
}
