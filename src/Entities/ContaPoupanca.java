package Entities;

public class ContaPoupanca extends Conta{


    @Override
    public void imprimirExtrto() {
        System.out.println("===== EXTRATO DA CONTA POUPANÇA =====");
        super.ImprimirInfosComuns();
    }
}
