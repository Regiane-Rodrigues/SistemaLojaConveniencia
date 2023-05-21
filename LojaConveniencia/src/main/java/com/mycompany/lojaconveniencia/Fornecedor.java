package com.mycompany.lojaconveniencia;

/**
 *
 * @author Gustavo H. Nava
 */
public class Fornecedor extends pessoaJuridica{
    
    private String vendedor;
    
    @Override
    public void exibirInformacoes(){
    
        super.exibirInformacoes();
        System.out.println("Cnpj: " + getCnpj());
        System.out.println("Nome da Empresa: " + getNomeEmpresa());
        System.out.println("Setor Atuação: " + getSetorAtuacao());
        System.out.println("Vendedor: " + vendedor);
        System.out.println("Telefone: " + getTelefone());
    }
}