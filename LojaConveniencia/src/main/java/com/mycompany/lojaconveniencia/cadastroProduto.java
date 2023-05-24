package com.mycompany.lojaconveniencia;

import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;
/**
 *
 * @author allan
 */
public class cadastroProduto {
    
    public int codigoProduto ;
    public String descricao;
    public String categoria;
    public double unidadeMedida;
    
    public void menuProduto(){
    
    int escolhaMenuProduto = -1;

        cadastroProduto cadastro = new cadastroProduto();

        System.out.println("-----------------------------------------");
        System.out.println(" || Menu Cadastro de Produtos ||");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Adicionar Produto \n2 - Editar produto \n3 - Excluir produto \n0 - Voltar ");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenuProduto = inserir.nextInt();
                switch (escolhaMenuProduto) {
                    case 1:
                        System.out.println( cadastro.adicionarProduto());
                        break;
                    case 2:
                        System.out.println(cadastro.editarProduto());
                        break;
                    case 3:
                        cadastro.excluirProduto();
                        break;
                    case 0:
                        System.out.println("Voltando");
                        break;
                    default:
                        System.out.println("Opção inválida. Favor informar outra opção.");
                        break;
                }
            } else {
                System.out.println("Opção inválida. Favor informar outra opção.");
                inserir.next();
            }
        } while (escolhaMenuProduto != 0);
 
    }
    public String adicionarProduto( ){
        System.out.println("Informe o nome do produto: Barra de cereal.");
        return "\nProduto cadastrado com sucesso!";
    }
     public String editarProduto () {
         System.out.println("Informe o código do produto que deseja alterar: 003788.");
        return "\nProduto alterado com sucesso!" ;
    }
    public void excluirProduto () {
        System.out.println("Digite o código do produto que deseja excluir: 003788.");
        System.out.println("\nItem exlucido com sucesso!");
    }
}
    