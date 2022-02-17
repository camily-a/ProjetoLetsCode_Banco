package br.com.letscode.java;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta {

    public ContaInvestimento() {

    }

    public ContaInvestimento(Cliente titular, BigDecimal saldo, int numeroConta) {
        super(titular, saldo, numeroConta);
    }
}
