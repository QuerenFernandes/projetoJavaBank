package untitled.src;

public class TestaContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(555, 93349);
        cc.deposita(500);

        ContaPoupanca cp = new ContaPoupanca(111, 93350);
        cp.deposita(100);

        cc.transfere(100, cp);
        cc.saca(10);

        System.out.println("Conta Corrente - saldo: " + cc.getSaldo());
        System.out.println("Conta Poupança - saldo: " + cp.getSaldo());
    }
}
