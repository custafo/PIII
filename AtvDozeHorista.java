public class AtvDozeHorista extends AtvDozeEmpregado {
        private double precoHora;
        private double horasTrabalhadas;
        
        // Construtor
        public AtvDozeHorista(String nome, String sobrenome, String CPF, double precoHora, double horasTrabalhadas) {
            super(nome, sobrenome, CPF);
            this.precoHora = precoHora;
            this.horasTrabalhadas = horasTrabalhadas;
        }
        
        // Método para calcular o salário
        public double calcularSalario() {
            return precoHora * horasTrabalhadas;
        }

        public String getPrecoHora() {
            return null;
        }

        public String getHorasTrabalhadas() {
            return null;
        }
    }
