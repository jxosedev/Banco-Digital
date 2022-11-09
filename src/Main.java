import Entities.Conta;
import Entities.ContaCorrente;
import Entities.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("============================");

        System.out.println("Escolha um tipo de conta: ");
        System.out.println("1- Conta Corrente");
        System.out.println("2- Conta Poupança");

        System.out.println("============================");

        int tipodeconta = entrada.nextInt();

        while (tipodeconta == 1) {
            System.out.println("============================");

            System.out.println("1- Ver extrato");
            System.out.println("2- Fazer deposito");
            System.out.println("3- Fazer transferencia");

            System.out.println("============================");

            int escolhacorrente = entrada.nextInt();

            switch (escolhacorrente){
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
            }
            break;
        }
    }
}