import Entities.Conta;
import Entities.ContaCorrente;
import Entities.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /* ESSA MAIN AINDA ESTA EM FASE DE CRIAÇÃO, ESTOU TESTANDO PRIMEIRO A CONTA CORRENTE,
        EM SEGUIDA IREI DAR INICIO A CRIAÇÃO DA PARTE DA CONTA POUPANÇA
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("============================");

        System.out.println("Escolha um tipo de conta: ");
        System.out.println("1- Conta Corrente");
        System.out.println("2- Conta Poupança");
        System.out.println("3- Digite 0 para sair.");

        System.out.println("============================");

        int tipodeconta = entrada.nextInt();

        if (tipodeconta == 1) {
            System.out.println("============================");

            System.out.println("1- Ver extrato.");
            System.out.println("2- Fazer deposito.");
            System.out.println("3- Fazer transferencia.");
            System.out.println("4- Digite 0 para sair.");

            System.out.println("============================");

            int escolhacorrente = entrada.nextInt();

            switch (escolhacorrente) {
                case 1:
                    if (escolhacorrente == 1) {
                        Conta cc = new ContaCorrente();
                        cc.imprimirExtrto();
                    }
                case 2:
                    if (escolhacorrente == 2) {
                        Conta cc = new ContaCorrente();
                        cc.depositar(100);
                        cc.imprimirExtrto();
                    }
                case 3:
                    if (escolhacorrente == 3) {
                        Conta cc = new ContaCorrente();
                        Conta cp = new ContaPoupanca();
                        cc.depositar(100);
                        cc.transferir(100, cp);
                        cc.imprimirExtrto();
                        cp.imprimirExtrto();
                    }
                case 4:
                    if (escolhacorrente > 3) {
                        System.out.println("Escolha uma opção válida !!!");
                    }
            }
        }
        if (tipodeconta == 2) {
            System.out.println("============================");

            System.out.println("1- Ver extrato.");
            System.out.println("2- Fazer deposito.");
            System.out.println("3- Fazer transferencia.");
            System.out.println("4- Digite 0 para sair.");

            System.out.println("============================");

            int escolhacorrente = entrada.nextInt();

            switch (escolhacorrente) {
                case 1:
                    if (escolhacorrente == 1) {
                        Conta cc = new ContaCorrente();
                        cc.imprimirExtrto();
                    }
                case 2:
                    if (escolhacorrente == 2) {
                        Conta cc = new ContaCorrente();
                        cc.depositar(100);
                        cc.imprimirExtrto();
                    }
                case 3:
                    if (escolhacorrente == 3) {
                        Conta cc = new ContaCorrente();
                        Conta cp = new ContaPoupanca();
                        cp.depositar(100);
                        //cc.transferir(100,cp);
                        cp.imprimirExtrto();
                        cc.imprimirExtrto();
                    }
                case 4:
                    if (escolhacorrente > 3) {
                        System.out.println("Escolha uma opção válida !!!");
                    }
            }
        } else {
            System.out.println("Encerrando !!!");
        }
    }
}