package br.com.letscode.java;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta {

    public ContaInvestimento() {

    }

    public ContaInvestimento(Cliente titular, BigDecimal saldo, int numeroConta) {
        super(titular, saldo, numeroConta);
    }

    @Override
    public void investir( BigDecimal valor) {
        if( Verificacoes.verificarSeSaldoMaiorQueValor(this , valor)) {
            if(Verificacoes.verificarSePessoaJuridica(this)) {
                this.setSaldo(getSaldo().add(valor.multiply(BigDecimal.valueOf(0.12))));
                System.out.println("Seu investimento foi realizado com sucesso! \n Seu saldo atual é R$" + this.getSaldo() + "\n");
            } else {
                this.setSaldo(getSaldo().add(valor.multiply(BigDecimal.valueOf(0.10))));
                System.out.println("Seu investimento foi realizado com sucesso! \n Seu saldo atual é R$" + this.getSaldo() + "\n");
            }
        } else {
            System.out.println("Não é possível realizar esse investimento! \n Seu saldo atual é R$" + this.getSaldo() + "\n");
        }

    }



    @Override
    public String toString() {
        return "ContaInvestimento {"  +
                "titular=" + getTitular() +
                ", saldo=" + getSaldo() +
                ", numeroConta=" + getNumeroConta() +
                "}";
    }
}
