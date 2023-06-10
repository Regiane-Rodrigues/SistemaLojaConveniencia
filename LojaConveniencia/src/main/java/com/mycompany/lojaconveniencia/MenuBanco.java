package com.mycompany.lojaconveniencia;

import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;

/**
 *
 * @author Gustavo H. Nava
 */
public class MenuBanco {
    
    public void menuBancos(){
    
        int escolhaMenuBanco = -1;
        CadastroBanco acessoBancos = new CadastroBanco();
        
        System.out.println("-----------------------------------------");
        System.out.println(" || Menu Banco ||");

        do {
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Cadastrar Banco \n2 - Editar Banco \n3 - Listar Banco \n4 - Excluir Banco \n0 - Voltar");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenuBanco = inserir.nextInt();
                switch (escolhaMenuBanco) {
                    case 1:
                        acessoBancos.adicionar();
                        break;
                    case 2:
                        acessoBancos.editar();
                        break;
                    case 3:
                        acessoBancos.listar();
                        break;
                    case 4:
                        acessoBancos.excluir();
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