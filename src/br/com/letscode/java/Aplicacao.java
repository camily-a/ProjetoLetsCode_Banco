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

        bancoB.criarConta(contaMaria);

        contaMaria.sacar(BigDecimal.valueOf(500));
        contaJose.sacar(BigDecimal.valueOf(10_000));
        contaJose.sacar(BigDecimal.valueOf(100));
        contaJose.sacar(BigDecimal.valueOf(100));



        contaMariana.investir(BigDecimal.valueOf(100));
        contaJubileu.investir(BigDecimal.valueOf(100));
        contaJose.investir(BigDecimal.valueOf(200));



    }
}
