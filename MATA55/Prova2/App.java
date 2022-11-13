package MATA55.Prova2;
import java.util.Scanner;
import java.util.ArrayList;

import MATA55.Prova2.models.ArticleAuthor;
import MATA55.Prova2.models.ArticleReviewer;
import MATA55.Prova2.models.GeneralChair;
import MATA55.Prova2.models.Participant;
import MATA55.Prova2.models.Person;
import MATA55.Prova2.models.ProgramChair;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Person> usersList = new ArrayList();
        ArrayList<Participant> participantsList = new ArrayList();
        ArrayList<ArticleAuthor> articleAuthorList = new ArrayList();
        ArrayList<ArticleReviewer> articleReviewerList = new ArrayList();
        ArrayList<ProgramChair> programChairsList = new ArrayList();
        ArrayList<GeneralChair> generalChairList = new ArrayList();
        
        Person loggedUser = null;
        Participant loggedParticipant = null;
        ArticleAuthor loggedAuthor = null;
        ArticleReviewer loggedReviewer = null;
        ProgramChair loggedProgramC = null;
        GeneralChair loggedGeneralC = null;
        int idCounter = 0;

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
                        if(usersList.get(i).getCpf().equals(cpf) && usersList.get(i).getPassword().equals(password)){
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
                newAccount.setName(sc.nextLine());
    
                System.out.println("-------------------------");
                System.out.print("Digite o seu CPF: ");
                newAccount.setCpf(sc.nextLine());
    
                System.out.println("-------------------------");
                System.out.print("Digite o seu Titulo acadêmico: ");
                newAccount.setAcademicTitle(sc.nextLine());

                System.out.println("-------------------------");
                System.out.print("Digite a sua Data de Nascimento: ");
                newAccount.setBirthdate(sc.next());

                System.out.println("-------------------------");
                System.out.println("Selecione o seu tipo de participação: ");
                System.out.println("1 - Participante");
                System.out.println("2 - Organizador");
                System.out.println("3 - Especialista");
                System.out.println("-------------------------");
    
                int tempOption = sc.nextInt();
    
                switch(tempOption){
                    case 1:
                    newAccount.setType("Participante");
                    newAccount.setCategory("Participante");
                    break;
                    case 2:
                    newAccount.setType("organizer");
                    System.out.println("-------------------------");
                    System.out.println("Selecione a sua categoria de organizador: ");
                    System.out.println("1 - Program Chair");
                    System.out.println("2 - General Chair");
                    System.out.println("-------------------------");
        
                    int tempOption2 = sc.nextInt();
                    switch(tempOption2){
                        case 1:
                        newAccount.setCategory("Program Chair");
                        break;
                        case 2:
                        newAccount.setCategory("General Chair");
                        break;

                        default:
                        System.out.println("Erro opção invalida");
                    }
                    break;
                    case 3:
                    newAccount.setType("specialist");
                    System.out.println("-------------------------");
                    System.out.println("Selecione a sua categoria de especialista: ");
                    System.out.println("1 - Autor de artigo");
                    System.out.println("2 - Revisor de artigo");
                    System.out.println("-------------------------");
        
                    int tempOption3 = sc.nextInt();
                    switch(tempOption3){
                        case 1:
                        newAccount.setCategory("Autor de Artigo");
                        break;
                        case 2:
                        newAccount.setCategory("Revisor de Artigo");
                        break;

                        default:
                        System.out.println("Erro opção invalida");
                    }
                    break;
    
                    default:
                    System.out.println("Erro: opção invalida");
                    
                }

                
                sc.nextLine();
                System.out.println("-------------------------");
                System.out.print("Digite a sua intituição de vinculo: ");
                newAccount.setInstitution(sc.nextLine());

                System.out.println("-------------------------");
                System.out.print("Digite sua senha: ");
                newAccount.setPassword(sc.nextLine());    
                newAccount.id = idCounter;
                idCounter+=1;
                usersList.add(newAccount);
            } 
            
        }while(optionMenu!=1);



        do{
            System.out.println("-------------------------");
            System.out.println("Bem-vindo ao Congresso Brasileiro de Programação Orientada a Objeto, " + loggedUser.getName());
            System.out.println("-------------------------");
            switch(loggedUser.getCategory()){
                case "Participante":
                if(loggedUser.getStatus() == "AWAITING"){
                    System.out.println("-------------------------");
                    System.out.println("Sua inscrição está pendente de validação. Aguarde.");  
                    break;                 
                }
                System.out.println("-------------------------");
                System.out.println("Selecione a opção desejada: ");
                System.out.println("1 - Autor de artigo");
                System.out.println("2 - Revisor de artigo");
                System.out.println("-------------------------");
    
                int tempOption = sc.nextInt();
                case "Program Chair":
                ProgramChair newPC = new ProgramChair();
                programChairsList.add(newPC);
                case "General Chair":
                GeneralChair newGC = new GeneralChair();
                generalChairList.add(newGC);
                case "Autor de Artigo":
                ArticleAuthor newAA = new ArticleAuthor();
                articleAuthorList.add(newAA);
                case "Revisor de Artigo":
                ArticleReviewer newAR = new ArticleReviewer();
                articleReviewerList.add(newAR);    
            }

            System.out.println("-------------------------");
            System.out.println("1 - Sair");
            System.out.println("2 - Continuar aguardando");
            System.out.println("-------------------------");

            optionMenu = sc.nextInt();
        } while(optionMenu!=0);

        sc.close();
    }
}
