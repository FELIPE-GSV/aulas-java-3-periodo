import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public void adicionarContato(Contato contato){
        this.contatos.add(contato);
    }

    public void removerContato(String nome){
        for(Contato contato : this.contatos){
            if(contato.getNome().equals(nome)){
                this.contatos.remove(contato);
                System.out.println("Contato removido com sucesso.");
                return;
            }
        }
    }

    public void exibirContatos(){
        if (this.contatos.isEmpty()){
            System.out.println("A agenda está vazia.");
            return;
        }
        System.out.println("Contatos: ");
        for(Contato contato : this.contatos){
            contato.exibirInformacoes();
        }
    }

    public void buscarContato(String nome){
        for(Contato contato : this.contatos){
            if(contato.getNome().equals(nome)){
                System.out.println("Contato encontrado: ");
                contato.exibirInformacoes();
            }
        }
    }


}
