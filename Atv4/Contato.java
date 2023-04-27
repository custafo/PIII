package Atv4;

public class Contato {
    private String name;
    private String email;
    private String number;
    
    public Contato(String name, String email, String number){
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public Contato(){
        
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getNumber() {
        return number;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + " E-mail: " + this.email + " Número: " + this.number;
    }
}
