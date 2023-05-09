package com.mycompany.lojaconveniencia;
// Desenvolvedor : Lucas Braga de Lima
// Analista : Gustavo Nava

import static com.mycompany.lojaconveniencia.LojaConveniencia.arrayPessoas;
import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;
import java.util.Date;


public class Pessoa {
    private int id_Pessoa;
    private String documento;
    private int inscricao_Estadual;
    private String data_Cadastro;
    
    public String nome;
    public String CEP; 
    public String endereco; 
    public String num_Endereco; 
    public String cidade;
    public String estado;
    public char tipo_Cadastro;
    public String email;
    public String telefone;

    Pessoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void menuPessoa(){
     
        
        System.out.println("Revisar");
            
        /* int escolhaMenuPessoa = -1;

        Pessoa pessoaCadastro;

        System.out.println("-------------------------------");
        System.out.println(" || Menu Pessoa ||");

        do {
            System.out.println("------------------------------");
            System.out.println("Escolha a opção desejada! ");
            System.out.println("1 - Cadastrar Cliente \n2 - Listar Cliente! \n3 - Alterar Cliente! ");
            System.out.println("-----------------------------------------");

            if (inserir.hasNextInt()) {
                escolhaMenuPessoa = inserir.nextInt();
                switch (escolhaMenuPessoa) {
                    case 1:
                        System.out.println("Informe o id");
                        int id = inserir.nextInt();

                        System.out.println("Informe o nome do Cliente");
                        inserir.nextLine();
                        String nome = inserir.nextLine();

                        System.out.println("Informe o CPF: ");
                        String documento = inserir.nextLine();

                        System.out.println("Informe o CEP ");
                        String cep = inserir.nextLine();

                        System.out.println(" Informe o endereco");
                        String endereco = inserir.nextLine();

                        System.out.println("Informe o numero do endereço");
                        String numEndereco = inserir.nextLine();

                        System.out.println(" Informe a cidade");
                        String cidade = inserir.nextLine();

                        System.out.println(" Informe o estado");
                        String estado = inserir.nextLine();

                        System.out.println("Informe o tipo de cadastro(F/J)");
                        char tipoCadastro = inserir.next().charAt(0);
                        tipoCadastro = Character.toUpperCase(tipoCadastro);

                        int inscricaoEstadual = 0;

                        while (tipoCadastro != 'F' && tipoCadastro != 'J') {
                            System.out.println("Informação inválida, informe novamente (F/J) ");
                            tipoCadastro = inserir.next().charAt(0);
                            tipoCadastro = Character.toUpperCase(tipoCadastro);
                        }
                        
                        if (tipoCadastro == 'J') {
                            System.out.println("Informe a Inscrição Estadual");
                            inscricaoEstadual = inserir.nextInt();
                        }

                        System.out.println("Informe a data de Cadastro");
                        inserir.nextLine();
                        String dataCadastro = inserir.nextLine();

                        System.out.println("Informe o email");
                        String email = inserir.nextLine();

                        System.out.println("Informe o telefone");
                        String telefone = inserir.nextLine();

                        pessoaCadastro = new Pessoa(id, documento, dataCadastro, nome, cep, endereco, cidade, estado, tipoCadastro);
                        pessoaCadastro.num_Endereco = numEndereco;
                        
                        if (tipoCadastro == 'J') {
                            pessoaCadastro.setinscricao_Estadual(inscricaoEstadual);
                        }
                        
                        pessoaCadastro.email = email;
                        pessoaCadastro.telefone = telefone;

                        arrayPessoas.add(pessoaCadastro);
                        break;

                    case 2:
                        for (int i = 0; i < arrayPessoas.size(); i++) {
                            arrayPessoas.get(i).listar_Cadastro();
                            System.out.println("----------------------------------");
                        }
                        break;

                    case 3:
                        System.out.println("Informe o ID que deseja alterar: ");
                        int idAltera = inserir.nextInt();

                        for (int i = 0; i < arrayPessoas.size(); i++) {
                            if (arrayPessoas.get(i).getId_Pessoa() == idAltera) {

                                System.out.println("Informe o nome do Cliente");
                                inserir.nextLine();
                                arrayPessoas.get(i).nome = inserir.nextLine();

                                System.out.println("Informe o documento: ");
                                String documentoA = inserir.nextLine();
                                arrayPessoas.get(i).setDocumento(documentoA);

                                System.out.println("Informe o CEP ");
                                arrayPessoas.get(i).CEP = inserir.nextLine();

                                System.out.println(" Informe o endereco");
                                arrayPessoas.get(i).endereco = inserir.nextLine();

                                System.out.println("Informe o numero do endereço");
                                arrayPessoas.get(i).num_Endereco = inserir.nextLine();

                                System.out.println(" Informe a cidade");
                                arrayPessoas.get(i).cidade = inserir.nextLine();

                                System.out.println(" Informe o estado");
                                arrayPessoas.get(i).estado = inserir.nextLine();

                                System.out.println("Informe o tipo de cadastro(F/J)");
                                char tipoCadastroAltera = inserir.next().charAt(0);
                                tipoCadastro = Character.toUpperCase(tipoCadastroAltera);

                                int inscricaoEstadualAltera = 0;

                                while (tipoCadastroAltera != 'F' && tipoCadastroAltera != 'J') {
                                    System.out.println("Informação inválida, informe novamente (F/J) ");
                                    tipoCadastroAltera = inserir.next().charAt(0);
                                    tipoCadastroAltera = Character.toUpperCase(tipoCadastroAltera);
                                }
                                arrayPessoas.get(i).tipo_Cadastro = tipoCadastroAltera;

                                if (tipoCadastroAltera == 'J') {
                                    System.out.println("Informe a Inscrição Estadual");
                                    inscricaoEstadualAltera = inserir.nextInt();
                                    arrayPessoas.get(i).setinscricao_Estadual(inscricaoEstadualAltera);
                                }

                                System.out.println("Informe a data de Cadastro");
                                inserir.nextLine();                               
                                String dataCadastroAltera = inserir.nextLine();
                                arrayPessoas.get(i).setData_Cdastro(dataCadastroAltera);

                                System.out.println("Informe o email");
                                arrayPessoas.get(i).email = inserir.nextLine();

                                System.out.println("Informe o telefone");
                                arrayPessoas.get(i).telefone = inserir.nextLine();
                            }
                        }
                        break;
                }
            }
        } while (escolhaMenuPessoa != 0);*/
    
    
    
    }
    
    
    public Pessoa(int id_Pessoa, String documento, String data_Cadastro, String nome, String CEP, String endereco, String cidade, String estado, char tipo_Cadastro) {
        this.id_Pessoa = id_Pessoa;
        this.documento = documento;
        this.data_Cadastro = data_Cadastro;
        this.nome = nome;
        this.CEP = CEP;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.tipo_Cadastro = tipo_Cadastro;
    }
    
    public int getId_Pessoa() {
        return id_Pessoa;
    }
    public void setId_Pessoa(int id_Pessoa) { 
        this.id_Pessoa = id_Pessoa;
    }  //o atributo so recebe valor atravez do set
       //define um valor a um atributo
       // retorna id Pessoa
    
    
    public String documento() {
        return documento;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }
    
    
    public int getinscricao_Estadual() {
        return inscricao_Estadual;
    }
    public void setinscricao_Estadual(int inscricao_Estadual) {
         this.inscricao_Estadual = inscricao_Estadual;
    }
    
    
    public String getData_Cadastro(){
        return data_Cadastro;
    }
    public void setData_Cdastro(String data_Cadastro){
        this.data_Cadastro = data_Cadastro;
    }
    public void listar_Cadastro(){
        
        System.out.println("id : " + this.id_Pessoa);
        System.out.println("Nome: " + this.nome);
        
        if(this.tipo_Cadastro == 'F'){
            System.out.println("CPF: " + this.documento);
               }else{
            System.out.println("CNPJ" + this.documento);
        }
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Email: " + this.email);
        System.out.println("Estado: " + this.estado);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Número do Endereco: " + this.num_Endereco);
        System.out.println("Telefone: " + this.telefone);
    }
    
}