package br.com.letscode.java;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas = new ArrayList<>();

    public void abrirConta(Conta novaConta) {
        if ( novaConta.getTitular() instanceof PessoaJuridica && novaConta instanceof ContaPoupanca) {
                System.out.println("Não é possível realizar a operação: \n " +
                        "Pessoas Jurídicas não podem abrir Conta Poupança \n");
        } else{
            contas.add(novaConta);
            System.out.println("Conta criada com sucesso!\n");
        }

    }






}
