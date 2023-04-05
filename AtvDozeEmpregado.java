public class AtvDozeEmpregado {
        private String nome;
        private String sobrenome;
        private String CPF;
        
        public AtvDozeEmpregado(String nome, String sobrenome, String CPF) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.CPF = CPF;
        }
        
        public String getNome() {
            return nome;
        }
        
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public String getSobrenome() {
            return sobrenome;
        }
        
        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }
        
        public String getCPF() {
            return CPF;
        }
        
        public void setCPF(String CPF) {
            this.CPF = CPF;
        }
    }
