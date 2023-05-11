package com.mycompany.lojaconveniencia;
// Desenvolvedor : Lucas Braga de Lima
// Analista : Gustavo Nava


import static com.mycompany.lojaconveniencia.LojaConveniencia.menuCadastroPessoa;
import static com.mycompany.lojaconveniencia.LojaConveniencia.inserir;
import java.util.ArrayList;
import java.util.Date;




public class Pessoa {
    
    
    private int idPessoa;
    private String documento;
    private int inscricaoEstadual;
    private String dataCadastro;
    
    public String nome;
    public String CEP; 
    public String endereco; 
    public String numEndereco; 
    public String cidade;
    public String estado;
    public char tipoCadastro;
    public String email;
    public String telefone;

    Pessoa() {
  
    }
    
    public void menuPessoa(){
        ArrayList<String> arrayPessoas = new ArrayList<>();
        int escolhaMenuPessoa = -1;

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
                        pessoaCadastro.numEndereco = numEndereco;
                        
                        if (tipoCadastro == 'J') {
                            pessoaCadastro.setinscricaoEstadual(inscricaoEstadual);
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
                            if (arrayPessoas.get(i).getIdPessoa() == idAltera) {

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
                                arrayPessoas.get(i).numEndereco = inserir.nextLine();

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
                                arrayPessoas.get(i).tipoCadastro = tipoCadastroAltera;

                                if (tipoCadastroAltera == 'J') {
                                    System.out.println("Informe a Inscrição Estadual");
                                    inscricaoEstadualAltera = inserir.nextInt();
                                    arrayPessoas.get(i).setinscricaoEstadual(inscricaoEstadualAltera);
                                }

                                System.out.println("Informe a data de Cadastro");
                                inserir.nextLine();                               
                                String dataCadastroAltera = inserir.nextLine();
                                arrayPessoas.get(i).setData_Cadastro(dataCadastroAltera);

                                System.out.println("Informe o email");
                                arrayPessoas.get(i).email = inserir.nextLine();

                                System.out.println("Informe o telefone");
                                arrayPessoas.get(i).telefone = inserir.nextLine();
                            }
                        }
                        break;
                }
            }
        } while (escolhaMenuPessoa != 0);  
        
        
    } 
    public Pessoa(int idPessoa, String documento, String dataCadastro, String nome, String CEP, String endereco, String cidade, String estado, char tipoCadastro) {
        this.idPessoa = idPessoa;
        this.documento = documento;
        this.dataCadastro = dataCadastro;
        this.nome = nome;
        this.CEP = CEP;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.tipoCadastro = tipoCadastro;
    }
    
    public int getIdPessoa() {
        return idPessoa;
    }
    public void setIdPessoa(int idPessoa) { 
        this.idPessoa = idPessoa;
    }  //o atributo so recebe valor atravez do set
       //define um valor a um atributo
       // retorna id Pessoa
    public String documento() {
        return documento;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }
     
    public int getinscricaoEstadual() {
        return inscricaoEstadual;
    }
    public void setinscricaoEstadual(int inscricaoEstadual) {
         this.inscricaoEstadual = inscricaoEstadual;
    }
    
    public String getData_Cadastro(){
        return dataCadastro;
    }
    public void setData_Cdastro(String dataCadastro){
        this.dataCadastro = dataCadastro;
    }
    public void listar_Cadastro(){
        
        System.out.println("id : " + this.idPessoa);
        System.out.println("Nome: " + this.nome);
        
        if(this.tipoCadastro == 'F'){
            System.out.println("CPF: " + this.documento);
               }else{
            System.out.println("CNPJ" + this.documento);
        }
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Email: " + this.email);
        System.out.println("Estado: " + this.estado);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Número do Endereco: " + this.numEndereco);
        System.out.println("Telefone: " + this.telefone);
    }
    
}