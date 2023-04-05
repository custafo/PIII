package AtvDoze;

    public class AtvDozeAssalariado extends AtvDozeEmpregado {
        private double salario;
        
        public AtvDozeAssalariado(String nome, String sobrenome, String CPF, double salario) {
            super(nome, sobrenome, CPF);
            this.salario = salario;
        }
        
        public double calcularSalario() {
            return salario;
        }

        public String getSalario() {
            return null;
        }
    }
