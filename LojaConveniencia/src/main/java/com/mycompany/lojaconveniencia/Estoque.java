/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaconveniencia;

import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

/**
 * Autor: Regiane C R Lima Ra: 00220666
 */
public class Estoque extends CadastroProduto {
 
    public double quantidade;

    void Estoque(int codigoProduto, String descricao, String categoria, String unidadeMedida, double quantidade){
        
        this.quantidade = quantidade;
        super(codigoProduto, descricao, categoria, unidadeMedida);
    }


}
