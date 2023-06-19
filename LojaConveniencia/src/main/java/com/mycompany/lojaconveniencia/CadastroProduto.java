package com.mycompany.lojaconveniencia;

//import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

//@author Regiane Lima

public class CadastroProduto implements Cadastro {
    public List<CadastroProduto> listaProduto;

    private int codigoProduto;
    private String descricao;
    private String categoria;
    private String unidadeMedida;
    private double valorProduto;

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
    
   
    public void exibirInformacoes() {
        System.out.println("Código do produto: " + codigoProduto);
        System.out.println("Descrição: " + descricao);
        System.out.println("Categora: " + categoria);
        System.out.println("Unidade Medida:\n Kg- Quilogramas \nG - Gramas \nL - Litros " + unidadeMedida);
        System.out.println("Valor do Produto:" + valorProduto);
    }

    // metodo aux para fazer busca pelo código
    public void buscar(int codigoProduto, String descricao, String categoria, String unidadeMedida,
            Double valorProduto) {

        buscar(codigoProduto, descricao, categoria, unidadeMedida, valorProduto);
    }

    @Override
    public void adicionar() {
        Scanner inserir = new Scanner(System.in);

        System.out.println("Informe o código do produto: \n");
        codigoProduto = inserir.nextInt();
        inserir.nextLine();
        inserir.nextInt(); // quebra de linha para consumir a próxima string
        System.out.println("Informe a descrição do produto: \n");
        descricao = inserir.nextLine();
        System.out.println("Informe a categoria: \n");
        categoria = inserir.nextLine();
        System.out.println("Informe a unidade medida (Kg - Quilogramas, g - Gramas, L - litros, U - uindade)");
        unidadeMedida = inserir.nextLine();
        System.out.println("Informe o valor produto: \n");
        valorProduto = inserir.nextDouble();
        inserir.nextLine();

        System.out.println("Produto adicionado com sucesso!");

        CadastroProduto produto = new CadastroProduto();
        listaProduto.add(produto);

        
    }

    @Override
    public void listar() {
        if (listaProduto.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            System.out.println("|| Produtos Cadastrados || \n");
            for (CadastroProduto produto : listaProduto) {

                produto.exibirInformacoes();
                System.out.println("--------------------------------");
            }

        }

    }

    @Override
    public void editar() {

        Scanner inserir = new Scanner(System.in);

        System.out.println("Informe o código do produto que deseja alterar: \n");
        int codigo = inserir.nextInt();
        inserir.nextLine();

        if (codigo == codigoProduto){
        CadastroProduto produto = new CadastroProduto();
        produto.buscar(codigoProduto, descricao, categoria, unidadeMedida, valorProduto);
        System.out.println("Alterar descrição: \n");
        String novaDescricao = inserir.nextLine();
        System.out.println("Alterar categoria: \n");
        String novacategoria = inserir.nextLine();
        System.out.println("Alterar unidade de medida: \n");
        String novaUnMedida = inserir.nextLine();
        System.out.println("Alterar valor do produto:  \n");
        double novoValor = inserir.nextDouble();

        produto.setDescricao(novaDescricao);
        produto.setCategoria(novacategoria);
        produto.setUnidadeMedida(novaUnMedida);
        produto.setValorProduto(novoValor);

        System.out.println("Produto editado com sucesso!");
    } else {
        System.out.println("Código não encontrado");
    }

    }

    @Override
    public void excluir() {
        Scanner inserir = new Scanner(System.in);

        System.out.print("Informe o código do produto que deseja eliminar: ");
        codigoProduto = inserir.nextInt();

        if (codigoProduto >= 0 && codigoProduto < listaProduto.size()) {
            listaProduto.remove(codigoProduto);
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Código não encontrado.");
        }



    }

}
