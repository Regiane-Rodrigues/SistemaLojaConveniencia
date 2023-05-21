package com.mycompany.lojaconveniencia;

import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;
/*
 * Analista: Allan Matheus Pereira
 * Desenvolvedor: Gustavo Henrique Nava
 */
public class Banco {
    
    public int idBanco;
    public int cnpjBanco;
    public String nomeEmpresa;
    public String cep;
    public String estado;
    public String cidade;
    public int numero;
    
    public String registrarVenda() {
        
        boolean vendaBemSucedida = false;  
        
        if (vendaBemSucedida) {
            return "Venda efetuada com sucesso.";
        } else {
            return "Falha ao realiar a venda.";
        }
    }
    
    public String listarProdutos() {
        
        String listagemDeProdutos = "Teste.";
        
        return listagemDeProdutos;
    }
    
    public double calcularTroco() {
        
        double troco = 5;
        
        return troco;
    }
    
    public double valorTotalCompra() {
        
        double valorTotal = 10;
        
        return valorTotal;
    }
    
    public double calcularDesconto() {
        
        double valorCompra = 10;
        double descontoPadrao = 0.05;
        double compraDescontada = valorCompra - (valorCompra * descontoPadrao);
        
        return compraDescontada;
    }
    
    public double calcularDesconto(double descontoEspecial) {
        
        double valorCompra = 10;
        double ValorCompraDescontoEspecial = valorCompra - descontoEspecial;
        
        return ValorCompraDescontoEspecial;
    }
    
    public void Bancos(){
    
      int escolhaMenuBanco = -1;

        System.out.println("-----------------------------------------");
        System.out.println(" || Teste Menu Banco ||");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Registrar Venda \n2 - Listar Produtos \n3 - Calcular Troco \n4 - Valor Total da Compra \n5 - Calcular Desconto \n0 - Voltar");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenuBanco = inserir.nextInt();
                switch (escolhaMenuBanco) {
                    case 1:
                        System.out.println("Teste");
                        registrarVenda();
                        break;

                    case 2:
                        System.out.println("Teste");
                        listarProdutos();
                        break;

                    case 3:
                        System.out.println("Teste");
                        calcularTroco();
                        break;

                    case 4:
                        System.out.println("Teste");
                        valorTotalCompra();
                        break;
                        
                    case 5:
                        System.out.println("Teste");
                        calcularDesconto();
                        calcularDesconto(3);
                        break;

                    case 0:
                        System.out.println("Voltando.");
                        break;
                        
                    default:
                        System.out.println("Opção inválida. Favor informar outra opção.");
                        break;
                        
                }
            } else {
                System.out.println("Opção inválida. Favor informar outra opção.");
                inserir.next();
            }
        } while (escolhaMenuBanco != 0);
    } 
}
