public class CriaConta {
    public static void main(String[] args) {
        //instanciando o objeto do tipo Conta.
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 1000;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 10;

        System.out.println("O saldo da primeira conta: " + primeiraConta.saldo);
        System.out.println("O saldo do segunda conta: " + segundaConta.saldo);
    }
}
