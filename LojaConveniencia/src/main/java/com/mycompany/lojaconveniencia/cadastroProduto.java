package com.mycompany.lojaconveniencia;

import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;

public class cadastroProduto {
    
    public String idNomeProduto;
    public String marcaProduto;
    public String descricaoProduto;
    public double precoProduto;
    public String fornecedorProduto;
    public String categoriaProduto;
    public int codigoProduto;
    public String codigoBarras;
    public String unidadeMedida;
    public String quantidade;
    
    
    public void menuPrduto(){
    
    int escolhaMenuProduto = -1;

        cadastroProduto cadastro = new cadastroProduto();

        cadastro.cadastroDeProduto("Energético Monster");
        cadastro.cadastroCodigo(5555.5555);
        cadastro.calcularestoque(escolhaMenuProduto);
        cadastro.categoria("Bebida Energética");
        cadastro.cadastroDeVendedor("Jailson Mendes");

        System.out.println("-----------------------------------------");
        System.out.println(" || Menu Cadastro de Produtos ||");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Cadastro de Produto \n2 - Cadastro de código \n3 - Calcular estoque \n4 - Categoria \n5 - Cadastrar vendedor \n0 - Voltar ");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenuProduto = inserir.nextInt();
                switch (escolhaMenuProduto) {
                    case 1:
                        System.out.println("Informe o nome do produto: " + cadastro.descricaoProduto);
                        break;
                    case 2:
                        System.out.println("Código cadastrado no produto: " + cadastro.cadastroCodigo(escolhaMenuProduto));
                        break;
                    case 3:
                        System.out.println("Quantidade em estoque: " + cadastro.calcularestoque(escolhaMenuProduto));
                        break;
                    case 4:
                        System.out.println("Este produto faz parte da categoria de: " + cadastro.categoria(null));
                        break;
                    case 5:
                        System.out.println("Novo vendedor cadastrado: " + cadastro.cadastroDeVendedor(null));
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
    
    public String cadastroDeProduto(String cadastroDeProduto){
        return "";
    }
     public double calcularestoque(double calculoEstoque) {
        return .9;
    }

    public String cadastroDeVendedor(String cadastro_vendedor) {
        return "";
    }

    public double cadastroCodigo(double cadastro_Codigos) {
        return .9;
    }
    public String categoria(String cadastro_categoria) {
        return "";
    }
}