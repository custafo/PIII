package AtvDoze;
public class AtvDozeComissionado extends AtvDozeEmpregado {
        private double totalVendas;
        private double taxaComissao;
        
        // Construtor
        public AtvDozeComissionado(String nome, String sobrenome, String CPF, double totalVendas, double taxaComissao) {
            super(nome, sobrenome, CPF);
            this.totalVendas = totalVendas;
            this.taxaComissao = taxaComissao;
        }
        
        // Método para calcular o salário
        public double calcularSalario() {
            return totalVendas * taxaComissao;
        }

		public String getTotalVendas() {
			return null;
		}

        public String getTaxaComissao() {
            return null;
        }
    }
