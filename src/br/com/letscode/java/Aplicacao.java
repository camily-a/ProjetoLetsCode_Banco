package br.com.letscode.java;

import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String[] args) {
        Banco bancoB = new Banco();

        Conta contaMaria = new ContaCorrente( new PessoaFisica("Maria", "Rua tal tal tals , 9090","123"),
                BigDecimal.valueOf(1_000), 1);
        Conta contaJose = new ContaCorrente( new PessoaJuridica("José", "Rua fulano de tal , 54b","4321"),
                BigDecimal.valueOf(10_000), 2);
        Conta contaMarcia = new ContaPoupanca( new PessoaFisica("Marcia", "Rua logo ali , 10","456"),
                BigDecimal.valueOf(1_000), 3);
        Conta contaJoao = new ContaPoupanca( new PessoaJuridica("João", "Rua lá longe , 5b","0987"),
                BigDecimal.valueOf(10_000), 4);
        Conta contaMariana = new ContaInvestimento( new PessoaFisica("Mariana", "Rua aqui , 00","789"),
                BigDecimal.valueOf(1_000), 5);
        Conta contaJubileu = new ContaInvestimento( new PessoaJuridica("Jubileu", "Rua lá , 89c","6543"),
                BigDecimal.valueOf(10_000), 6);


        System.out.println(contaMaria);
        System.out.println(contaJose);
        System.out.println(contaMarcia);
        System.out.println(contaJoao);
        System.out.println(contaMariana);
        System.out.println(contaJubileu);

        System.out.println("------------------------------------------------------------------------------------------");

        bancoB.abrirConta(contaMaria);
        bancoB.abrirConta(contaJose);
        bancoB.abrirConta(contaMarcia);
        bancoB.abrirConta(contaJoao);
        bancoB.abrirConta(contaMariana);
        bancoB.abrirConta(contaJubileu);

        System.out.println("------------------------------------------------------------------------------------------");

        contaMaria.consultarSaldo();
        contaJose.consultarSaldo();
        contaMarcia.consultarSaldo();
        contaJoao.consultarSaldo();
        contaMariana.consultarSaldo();
        contaJubileu.consultarSaldo();

        System.out.println("------------------------------------------------------------------------------------------");

        contaMaria.depositar(BigDecimal.valueOf(500));
        contaJose.depositar(BigDecimal.valueOf(100));
        contaMarcia.depositar(BigDecimal.valueOf(1_001));
        contaJoao.depositar(BigDecimal.valueOf(990));
        contaMariana.depositar(BigDecimal.valueOf(100));
        contaJubileu.depositar(BigDecimal.valueOf(10000));

        System.out.println("------------------------------------------------------------------------------------------");

        contaMaria.investir(BigDecimal.valueOf(500));
        contaJose.investir(BigDecimal.valueOf(100));
        contaMarcia.investir(BigDecimal.valueOf(1_001));
        contaJoao.investir(BigDecimal.valueOf(990));
        contaMariana.investir(BigDecimal.valueOf(100));
        contaJubileu.investir(BigDecimal.valueOf(100));

        System.out.println("------------------------------------------------------------------------------------------");

        contaMaria.sacar(BigDecimal.valueOf(500));
        contaJose.sacar(BigDecimal.valueOf(100));
        contaMarcia.sacar(BigDecimal.valueOf(1_001));
        contaJoao.sacar(BigDecimal.valueOf(990));
        contaMariana.sacar(BigDecimal.valueOf(100));
        contaJubileu.sacar(BigDecimal.valueOf(10000));

        System.out.println("------------------------------------------------------------------------------------------");

        contaMaria.transferir(BigDecimal.valueOf(500), contaJose);
        contaJose.transferir(BigDecimal.valueOf(10_499.5), contaMarcia);
        contaMarcia.transferir(BigDecimal.valueOf(1_001), contaJoao);
        contaJoao.transferir(BigDecimal.valueOf(990), contaMariana);
        contaMariana.transferir(BigDecimal.valueOf(100), contaJubileu);
        contaMaria.consultarSaldo();
        contaJubileu.transferir(BigDecimal.valueOf(100),contaMaria);
        contaMaria.consultarSaldo();


    }
}
