package br.com.letscode.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    ////private BigDecimal saldo;////
    private List<Conta> contas = new ArrayList<>();

    public List<Conta> getContas() {
        return contas;
    }

    // abrir conta
    public void criarConta(Conta novaConta) {
        // validar tipo de conta e tipo de pessoa (instance of)
        if ( novaConta.getTitular() instanceof PessoaJuridica && novaConta instanceof ContaPoupanca) {
                System.out.println("Não é possível realizar a operação: " +
                        "Pessoas Jurídicas não podem abrir Conta Poupança");
        } else{
            contas.add(novaConta);
            System.out.println("Conta criada com sucesso!");
        }

    }





}