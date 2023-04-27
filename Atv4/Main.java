package Atv4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira a quantidade de contatos desejadas: ");
        int qtContatos = in.nextInt();
        System.out.println("Insira a quantidade de anotações desejadas: ");
        int qtAnotacoes = in.nextInt();
        System.out.println("Insira a quantidade de atividades a realizar: ");
        int qtToDo = in.nextInt();
        
        Agenda userAgenda = new Agenda(qtContatos, qtAnotacoes, qtToDo);
        System.out.println("Agenda criada com sucesso! :P");

        boolean finished = false;
        while(!finished){
            System.out.println("Digite 1 para inserir novo contato");
            System.out.println("Digite 2 para inserir nova anotação");
            System.out.println("Digite 3 para inserir nova atividade a realizar");
            System.out.println("Digite 4 para exibir todos os contatos");
            System.out.println("Digite 5 para exibir anotações");
            System.out.println("Digite 6 para exibir atividades a realizar");
            System.out.println("Digite 0 para finalizar a agenda");
            int escolha = in.nextInt();
            switch (escolha) {
                case 0:
                    finished = true;
                    break;
                case 1:
                System.out.println("Digite o nome do contato: ");
                in.nextLine();
                String nome = in.nextLine();
                System.out.println("Digite o e-mail do contato: ");
                String email = in.nextLine();
                System.out.println("Digite o número do contato: ");
                String numero = in.nextLine();
                userAgenda.insertContact(nome, email, numero);
                    break;
                case 2:
                System.out.println("Digite sua anotação: ");
                String anotacao = in.nextLine();
                userAgenda.insertAnotation(anotacao);
                    break;
                case 3:
                System.out.println("Digite sua nova atividade: ");
                String task = in.nextLine();
                userAgenda.insertTask(task);
                    break;
                case 4:
                System.out.println("Seus contatos são: ");
                userAgenda.getContatoslista();
                    break;
                case 5:
                System.out.println("Suas anotações são: ");
                userAgenda.getAnotacoes();
                    break;
                case 6:
                System.out.println("Suas atividades a realizar são: ");
                userAgenda.getTodo();
                    break;
                default:
                System.out.println("Não foi possível identificar a ordem!");
                    break;
            }
            
        }

    }
}