package br.com.letscode.java;

import java.math.BigDecimal;

public abstract class Conta {

    private Cliente titular;
    private BigDecimal saldo;
    private int numeroConta;

    public Conta() {
    }

    public Conta(Cliente titular, BigDecimal saldo, int numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }



    ///////////

    // consultar saldo
    public void consultarSaldo() {

        System.out.println("O seu saldo atual é R$" + this.saldo);
    }

    // depositar ?? não possui em todos
    public void depositar( BigDecimal valor) {
        // validacao?
        this.saldo = this.saldo.add(valor);
        System.out.println("Depósito realizado com sucesso! \n Seu saldo atual é R$ " + this.saldo + "\n");
    }

    // sacar
    public void sacar( BigDecimal valor) {
        if(! Verificacoes.verificarSeSaldoMaiorQueValor(this, valor)) {
            System.out.println("Não é possível realizar essa operação. \n Seu saldo atual é R$ " + this.saldo+ "\n");
        } else if (Verificacoes.verificarSePessoaJuridica(this)) {
            if(! Verificacoes.verificarSeSaldoMaiorQueValorPJ(this, valor)) {
                System.out.println("Não é possível realizar essa operação  ** LEMBRETE : há uma taxa de 0,05% em saques realizados " +
                        "Pessoa Jurídica **  \n Seu saldo atual é R$ " + this.saldo+ "\n");
            } else {
                this.saldo = this.saldo.subtract(valor.multiply(BigDecimal.valueOf(1.005)));
                System.out.println("Saque realizado com sucesso! \n Seu saldo atual é R$ " + this.saldo + "\n");
            }
        } else {
            this.saldo = this.saldo.subtract(valor);
            System.out.println("Saque realizado com sucesso! \n Seu saldo atual é R$ " + this.saldo+ "\n");
        }
    }

    // transferir // validar contaDestino ?
    public void transferir( BigDecimal valor, Conta contaDestino) {
        if(! Verificacoes.verificarSeSaldoMaiorQueValor(this, valor) ) {
            System.out.println("Não é possível realizar essa operação. \n Seu saldo atual é R$ " + this.saldo+ "\n");
        }  else {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso! \n Seu saldo atual é R$ " + this.saldo + "\n");
        }
    }

    // investir ? nao possui em todos
    public void investir( BigDecimal valor) {

    }




    @Override
    public String toString() {
        return "Conta{" +
                "titular=" + titular +
                ", saldo=" + saldo +
                ", numeroConta=" + numeroConta +
                '}';
    }
}
