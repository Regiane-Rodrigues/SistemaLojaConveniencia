package com.mycompany.lojaconveniencia;

/*
 * Analista: Allan Matheus Pereira
 * Desenvolvedor: Gustavo Henrique Nava
 */
public class Banco {
    
    public int idBanco;
    public String cnpjBanco;
    public String nomeEmpresa;
    public String cep;
    public String estado;
    public String cidade;
    public String numero;    

    @Override
    public String toString() {
        return "ID:\t" + idBanco + "\nCNPJ:\t" + cnpjBanco + "\nNOME:\t" + nomeEmpresa + "\nCEP:\t" + cep + "\nESTADO:\t" + estado + "\nCIDADE:\t" + cidade + "\nTEL:\t" + numero +"\n";
    }
}
