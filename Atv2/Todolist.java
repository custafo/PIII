package Atv2;

public class Todolist {
    private String fazer;
    private boolean completed;

    public Todolist(String fazer){
        this.fazer = fazer;
        this.completed = false;
    }
    public String getFazer() {
        return fazer;
    }
    public void setFazer(String fazer) {
        this.fazer = fazer;
    }
    public boolean getCompleted(){
        return completed;
    }
    public void setCompleted(boolean completed){
        this.completed = completed;
    }
    @Override
    public String toString() {
        return "Nome da atividade: " + fazer;
    }
}
