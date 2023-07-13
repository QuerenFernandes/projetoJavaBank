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

        Conta contaOdin = new Conta();
        contaOdin.deposita(100);
        System.out.println("o saldo da conta do Odin é: " + contaOdin.saldo);

        contaOdin.transfere(10, primeiraConta);
        System.out.println("novo saldo odin: " + contaOdin.saldo);
        System.out.println("novo saldo primeira conta:" + primeiraConta.saldo);
    }
}
