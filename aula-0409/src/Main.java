import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        boolean timing = true;
        Agenda agenda = new Agenda();
        Integer escolha = 0;

        do {
            System.out.println("**************************");
            System.out.println("||| AGENDA DE CONTATOS |||");
            System.out.println("**************************");
            System.out.println("");

            System.out.println("1 - Adicionar contato.");
            System.out.println("2 - Remover contato.");
            System.out.println("3 - Buscar contato.");
            System.out.println("4 - Exibir contatos.");
            System.out.println("5 - Sair.");
            System.out.println("");

            escolha = new Scanner(System.in).nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do contato: ");
                    String nome = new Scanner(System.in).nextLine();
                    System.out.println("Digite o telefone do contato: ");
                    String telefone = new Scanner(System.in).nextLine();
                    Contato contato = new Contato(nome, telefone);
                    agenda.adicionarContato(contato);
                    break;
                case 2:
                    System.out.println("Digite o nome do contato: ");
                    nome = new Scanner(System.in).nextLine();
                    agenda.removerContato(nome);
                    break;
                case 3:
                    System.out.println("Digite o nome do contato: ");
                    nome = new Scanner(System.in).nextLine();
                    agenda.buscarContato(nome);
                    break;
                case 4:
                    agenda.exibirContatos();
                    break;
                default:
                    timing = false;
                    break;
            }



        } while (timing == true);

    }
}