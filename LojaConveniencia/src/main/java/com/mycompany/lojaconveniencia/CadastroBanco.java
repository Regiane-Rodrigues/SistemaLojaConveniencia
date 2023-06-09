package com.mycompany.lojaconveniencia;

import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo H. Nava
 */
public class CadastroBanco implements Cadastro {

    List<Banco> listaDeBancos = new ArrayList<>();

    @Override
    public void adicionar() {
        Banco novoBanco = new Banco();
        System.out.println("|| CADASTRO DE BANCOS ||\n");
        if (listaDeBancos.isEmpty()) {
            novoBanco.idBanco = 1;
        } else {
            novoBanco.idBanco = listaDeBancos.get(listaDeBancos.size() - 1).idBanco + 1;
        }
        System.out.println("Informe o CNPJ do Banco: ");
        inserir.nextLine();
        novoBanco.cnpjBanco = inserir.nextLine();
        System.out.println("Informe o NOME do Banco: ");
        novoBanco.nomeEmpresa = inserir.nextLine();
        System.out.println("Informe o CEP do Banco: ");
        novoBanco.cep = inserir.nextLine();
        System.out.println("Informe o ESTADO do Banco: ");
        novoBanco.estado = inserir.nextLine();
        System.out.println("Informe a CIDADE do Banco: ");
        novoBanco.cidade = inserir.nextLine();
        System.out.println("Informe o TELEFONE do Banco: ");
        novoBanco.numero = inserir.nextLine();
        listaDeBancos.add(novoBanco);
        System.out.println("\nBanco cadastrado com sucesso\n");
    }

    @Override
    public void editar() {
        System.out.println("|| EDIÇÃO DE CADASTRO DE BANCOS ||\n");
        System.out.println("Informe o ID do Banco a ser editado: ");
        int idBusca = inserir.nextInt();
        boolean idEncontrado = false;

        for (int i = 0; i < listaDeBancos.size(); i++) {
            if (idBusca == listaDeBancos.get(i).idBanco) {
                System.out.println("Cadastro encontrado: \n" + listaDeBancos.get(i).toString());
                System.out.println("Confirmar edicao? (S)");
                char confirmaEdicao = inserir.next().charAt(0);
                confirmaEdicao = Character.toUpperCase(confirmaEdicao);
                if (confirmaEdicao == 'S') {
                    idEncontrado = true;
                    System.out.println("Informe o CNPJ do Banco: ");
                    inserir.nextLine();
                    listaDeBancos.get(i).cnpjBanco = inserir.nextLine();
                    System.out.println("Informe o NOME do Banco: ");
                    listaDeBancos.get(i).nomeEmpresa = inserir.nextLine();
                    System.out.println("Informe o CEP do Banco: ");
                    listaDeBancos.get(i).cep = inserir.nextLine();
                    System.out.println("Informe o ESTADO do Banco: ");
                    listaDeBancos.get(i).estado = inserir.nextLine();
                    System.out.println("Informe a CIDADE do Banco: ");
                    listaDeBancos.get(i).cidade = inserir.nextLine();
                    System.out.println("Informe o TELEFONE do Banco: ");
                    listaDeBancos.get(i).numero = inserir.nextLine();
                    System.out.println("\nBanco editado com sucesso\n");
                    break;
                } else {
                    System.out.println("Cancelando exclusão.");
                    break;
                }
            }
        }

        if (!idEncontrado) {
            System.out.println("ID não encontrado.\n");
        }
    }

    @Override
    public void listar() {
        System.out.println("|| BANCOS CADASTRADOS ||\n");
        if (listaDeBancos.isEmpty()) {
            System.out.println("Nenhum Banco cadastrado.\n");
        } else {
            for (int i = 0; i < listaDeBancos.size(); i++) {
                System.out.println(listaDeBancos.get(i));
            }
        }
    }

    @Override
    public void excluir() {
        System.out.println("|| EXCLUSÃO DE CADASTRO DE BANCOS ||\n");
        System.out.println("Informe o ID do Banco a ser excluído: ");
        int idBusca = inserir.nextInt();
        boolean idEncontrado = false;

        for (int i = 0; i < listaDeBancos.size(); i++) {
            if (idBusca == listaDeBancos.get(i).idBanco) {
                System.out.println("Cadastro encontrado: \n" + listaDeBancos.get(i).toString());
                System.out.println("Confirmar exclusão? (S)");
                char confirmaExclusao = inserir.next().charAt(0);
                confirmaExclusao = Character.toUpperCase(confirmaExclusao);
                if (confirmaExclusao == 'S') {
                    idEncontrado = true;
                    listaDeBancos.remove(listaDeBancos.get(i));
                    System.out.println("\nBanco excluído com sucesso\n");
                    break;
                } else {
                    System.out.println("Cancelando exclusão.");
                    break;
                }
            }
        }

        if (!idEncontrado) {
            System.out.println("ID não encontrado.\n");
        }
    }
}
