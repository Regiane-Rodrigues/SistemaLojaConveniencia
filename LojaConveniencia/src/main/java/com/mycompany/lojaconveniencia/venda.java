package com.mycompany.lojaconveniencia;

import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;
import static com.mycompany.lojaconveniencia.LojaConveniencia.menuCadastroProduto;
import static com.mycompany.lojaconveniencia.LojaConveniencia.menuVenda;
/**
 *
 * @author allan
 */
public class venda {
    public int idVenda;
    public double valorPago;
    public double desconto; 
    public double totalVenda;
    
    public void menuVendas(){
     
        int escolhaMenuVendas = 1;
        listarProdutos();
        calcularDesconto();
        valorTotalCompra();
        registrarVenda();
        emitirNotaFiscal();
        
        System.out.println("-----------------------------------------");
        System.out.println(" || Menu Venda ||");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Inserir produto \n2 - Informar valor total \n3 - Conceder desconto \n4 - Registrar Venda  \n5 Confirmar emissão de nota \n0 - Voltar ");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
               escolhaMenuVendas = inserir.nextInt();
                switch (escolhaMenuVendas) {
                    case 1:
                        System.out.println(listarProdutos());
                        break;
                    case 2:
                        System.out.println(valorTotalCompra());
                        break;
                    case 3:
                        System.out.println("Valor do desconto concedido: " + calcularDesconto());
                        break;
                    case 4:
                        System.out.println("Confirma o registro da venda? \n" + registrarVenda());
                        break;
                    case 5:
                        System.out.println("Deseja emitir Nota Fiscal ? \n" + emitirNotaFiscal());
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
        } while (escolhaMenuVendas != 0);
        
        
    }
   
    public String listarProdutos(){
        System.out.println("Produto selecionado: 003788.\n");
        return "Produto inserido com sucesso! \nInsira o proximo produto";
    }
    
    public double valorTotalCompra(){
        return 1000;
    }
        
    public double calcularDesconto() {
        return  -1 * 0.10;
    }
    
    public String registrarVenda() {
        return "Venda do produto " + "registrada.";
    }  
   
    public String emitirNotaFiscal(){
        return "Nota fiscal 0007892 emitida com sucesso!";
    }
}
