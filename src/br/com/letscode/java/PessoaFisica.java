package br.com.letscode.java;

public class PessoaFisica extends Cliente {

        private String cpf;

        public PessoaFisica(String nome, String endereco, String cpf) {
                super(nome , endereco);
                this.cpf = cpf;
        }

        @Override
        public String toString() {
                return "PessoaFisica{" +
                        "nome='" + super.getNome() + '\'' +
                        ", endereco='" + super.getEndereco() + '\'' +
                        ", cpf='" + cpf + '\'' +
                        '}';
        }
}
