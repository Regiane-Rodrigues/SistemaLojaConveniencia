package com.mycompany.lojaconveniencia;

/**
 *
 * @author Gustavo H. Nava
 */
public class Fornecedor extends pessoaJuridica{
    
    private String vendedor;
    
    public Fornecedor(String nomeCompleto, int telefone, String email, int cep, String cidade, String estado, String rua, int numeroLocal, String cnpj, String nomeEmpresa, String setorAtuacao, String vendedor) {
        super(nomeCompleto, telefone, email, cep, cidade, estado, rua, numeroLocal, cnpj, nomeEmpresa, setorAtuacao);
        
        this.vendedor = vendedor;
    }
    
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
