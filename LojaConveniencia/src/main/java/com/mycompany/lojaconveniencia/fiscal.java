/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaconveniencia;

/**
 *
 * @author Maycon 00234481
 
 */
public class fiscal {
    public int codNota;
    private double notaEntrada;
    private double notaSaida;
    public String tipoNota;
    public double imposto;
    public double juros;
    public double multa;
    private String lancamentoInventario;
    private String registros;
    private String guiaRecolhimento;

    public void menuFiscal(){
        System.out.println("Fiscal");
    }
    
     public void incluir() {
     int notaEntrada;
     int notaSaida;
     int codNota;
}
    public void excluir (){
     int notaEntrada;
     int notaSaida;
     int codNota;

}
    public void editarNota(int numEntrada, int numSaida, int codNota, double novoValorNota) {
    this.notaEntrada = numEntrada;
    this.notaSaida = numSaida;
    this.codNota = codNota;
}
    
    public double getCalcImposto(double imposto){
        return imposto;
}

    public double getclacJuros (double juros){
     return juros;
}
    
    public double getmultas (double multa){
     return multa;
}
    public String getregLivroInventario (String guiaRecolhimento){
     return guiaRecolhimento;
}
      public void getemissao (int codNota){
}
}

