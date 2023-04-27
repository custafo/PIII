package Atv4;

public class Agenda extends Contato{
    private Contato[] contatoslista;
    private String [] anotacoes;
    private Todolist[] todo;
    private int qtContatosLista;
    private int qtAnotacoes;
    private int qtToDo;

    public Agenda(int qtContatosLista,int qtAnotacoes,int qtToDo){
        this.contatoslista = new Contato[1];
        qtContatosLista = 0;
    }

    public Agenda(String name, String email, String cellphone) throws Exception {
        super(name, email, cellphone);
        this.contatoslista = new Contato[1];
        qtContatosLista = 0;

    }

    public void getContatoslista() {
        for (int i = 0; i < qtContatosLista; i++) {
            System.out.println(contatoslista[i]); //percorrer usando a quantidade de contatos que existe
        }
    }

    public void getAnotacoes() {
        for (int i = 0; i < qtAnotacoes; i++) {
            System.out.println(anotacoes[i]);
        }
    }
    public void getTodo() {
        for (int i = 0; i < qtToDo; i++) {
            System.out.println(todo[i]);
        }
    }
    public int getQtContatosLista() {
        return qtContatosLista;
    }
    public int getQtAnotacoes() {
        return qtAnotacoes;
    }
    public int getQtToDo() {
        return qtToDo;
    }

    public void insertContact(String name, String email, String number){
        if(this.contatoslista.length <= qtContatosLista){
            System.out.println("Agenda lotada!");
            return;
        }
        this.contatoslista[qtContatosLista] = new Contato(name, email, number);
        this.qtContatosLista++;
        System.out.println("Contato cadastrado! :D");
    }
    public void insertAnotation(String anotacoes){
        if(this.anotacoes.length <= qtAnotacoes){
            System.out.println("Muitas anotações mds, não foi possível criar mais uma!");
            return;
        }
        this.anotacoes[qtAnotacoes] = anotacoes;
        this.qtAnotacoes++;
        System.out.println("Mais uma anotação! <3");
    }
    public void insertTask(String fazer){
        if(this.todo.length <= qtToDo){
            System.out.println("Muitas tasks, não foi possível criar mais uma!");
            return;
        }
        this.todo[qtToDo] = new Todolist(fazer);
        this.qtToDo++;
        System.out.println("Mais uma task! ..T-T");
    }
}