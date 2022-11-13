package MATA55.Prova2;
import java.util.Scanner;
import java.util.ArrayList;
import MATA55.Prova2.models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Person> usersList = new ArrayList();
        
        Person loggedUser = null;

        Scanner sc = new Scanner(System.in);
        int optionMenu=0;
        
        do{
            System.out.println("-------------------------");
            System.out.println("1 - Fazer Login");
            System.out.println("2 - Criar Conta");
            System.out.println("-------------------------");
    
    
            optionMenu = sc.nextInt();
            sc.nextLine();
    
            if(optionMenu == 1){
                boolean logged = false;
                 
                while(!logged){
                    System.out.println("-------------------------");
                    System.out.print("Digite seu cpf: ");
                    String cpf = sc.nextLine();

                    System.out.println("-------------------------");
                    System.out.print("Digite sua senha: ");
                    String password = sc.nextLine();

                    

                    for(int i = 0 ; i< usersList.size(); i++){
                        if(usersList.get(i).cpf.equals(cpf) ||usersList.get(i).password.equals(password)){
                            loggedUser  = usersList.get(i);
                        }
                    }
                    
            
                    if(loggedUser == null){
                        System.out.println("Usuario não encontrado");
                    } else {
                        logged = true;
                    }
                }
            } 
            else if(optionMenu == 2){
                Person newAccount = new Person();
                System.out.println("-------------------------");
                System.out.print("Digite o seu nome: ");
                newAccount.name = sc.nextLine();
    
                System.out.println("-------------------------");
                System.out.print("Digite o seu CPF: ");
                newAccount.cpf = sc.nextLine();
    
                System.out.println("-------------------------");
                System.out.print("Digite o seu Titulo acadêmico: ");
                newAccount.academicTitle = sc.nextLine();

                System.out.println("-------------------------");
                System.out.println("Selecione o seu tipo de participação: ");
                System.out.println("1 - Participante");
                System.out.println("2 - Organizador");
                System.out.println("3 - Especialista");
                System.out.println("-------------------------");
    
                int tempOption = sc.nextInt();
    
                switch(tempOption){
                    case 1:
                    newAccount.type = "participant";
                    newAccount.category = "participant";
                    break;
                    case 2:
                    newAccount.type = "organizer";
                    System.out.println("-------------------------");
                    System.out.println("Selecione a sua categoria de organizador: ");
                    System.out.println("1 - Program Chair");
                    System.out.println("2 - General Chair");
                    System.out.println("-------------------------");
        
                    int tempOption2 = sc.nextInt();
                    switch(tempOption2){
                        case 1:
                        newAccount.category = "program chair";
                        break;
                        case 2:
                        newAccount.category = "general chair";
                        break;

                        default:
                        System.out.println("Erro opção invalida");
                    }
                    break;
                    case 3:
                    newAccount.type = "specialist";
                    System.out.println("-------------------------");
                    System.out.println("Selecione a sua categoria de especialista: ");
                    System.out.println("1 - Autor de artigo");
                    System.out.println("2 - Revisor de artigo");
                    System.out.println("-------------------------");
        
                    int tempOption3 = sc.nextInt();
                    switch(tempOption3){
                        case 1:
                        newAccount.category = "article author";
                        break;
                        case 2:
                        newAccount.category = "article reviewer";
                        break;

                        default:
                        System.out.println("Erro opção invalida");
                    }
                    break;
    
                    default:
                    System.out.println("Erro opção invalida");
                    
                }

                
                sc.nextLine();
                System.out.println("-------------------------");
                System.out.print("Digite a sua intituição de vinculo: ");
                newAccount.institution = sc.nextLine();

                System.out.println("-------------------------");
                System.out.print("Digite sua senha: ");
                newAccount.password = sc.nextLine();
    
    
                usersList.add(newAccount);
            } 
            
        }while(optionMenu!=1);



        do{
            System.out.println("-------------------------");
            System.out.println("Bem-vindo ao Congresso Brasileiro de Programação Orientada a Objeto, " + loggedUser.name);
            System.out.println("-------------------------");
            switch(loggedUser.category){
                case "participant":
                // if(loggedUser.status == "Active"){
                //     // the user can use all of the person methods
                // }
                System.out.println("Você é um " + loggedUser.category + ". Escolha o que deseja fazer:");
                System.out.println("1 - Assistir palestras");
                System.out.println("2 - Sair");
                System.out.println("-------------------------");
                int tempOption = sc.nextInt();
                case "program chair":
                // the user can use all of the program chair and the person methods
                System.out.println("Você é um " + loggedUser.category + ". Escolha o que deseja fazer:");
                System.out.println("1 - Assistir palestras");
                System.out.println("2 - Sair");
                System.out.println("-------------------------");
                int tempOption1 = sc.nextInt();
                case "general chair":
                // the user can use all of the general chair and the person methods
                System.out.println("Você é um " + loggedUser.category + ". Escolha o que deseja fazer:");
                System.out.println("1 - Assistir palestras");
                System.out.println("2 - Sair");
                System.out.println("-------------------------");
                int tempOption2 = sc.nextInt();
                case "article author":
                // the user can use all of the article author and the person methods
                System.out.println("Você é um " + loggedUser.category + ". Escolha o que deseja fazer:");
                System.out.println("1 - Assistir palestras");
                System.out.println("2 - Sair");
                System.out.println("-------------------------");
                int tempOption3 = sc.nextInt();
                case "article reviewer":
                // the user can use all of the article reviewer and the person methods
                System.out.println("Você é um " + loggedUser.category + ". Escolha o que deseja fazer:");
                System.out.println("1 - Assistir palestras");
                System.out.println("2 - Sair");
                System.out.println("-------------------------");
                int tempOption4 = sc.nextInt();

            }
            System.out.println("-------------------------");
        } while(optionMenu!=0);


        




        


    }
}
