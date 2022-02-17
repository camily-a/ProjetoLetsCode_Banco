package br.com.letscode.java;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    public ContaCorrente() {
    }

    public ContaCorrente(Cliente titular, BigDecimal saldo, int numeroConta) {
        super(titular, saldo, numeroConta);
    }
}
