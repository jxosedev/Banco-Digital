package Entities;

public class ContaCorrente extends Conta{


    @Override
    public void imprimirExtrto() {
        System.out.println("===== EXTRATO DA CONTA CORRENTE =====");
        super.ImprimirInfosComuns();
    }
}
