public class CriaConta {
    public static void main(String[] args) {
        //instanciando o objeto do tipo Conta.
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(1000);

        Conta segundaConta = new Conta();
        segundaConta.deposita(10);

        System.out.println("O saldo da primeira conta: " + primeiraConta.getSaldo());
        System.out.println("O saldo do segunda conta: " + segundaConta.getSaldo());

        Conta contaOdin = new Conta();
        contaOdin.deposita(100);
        System.out.println("o saldo da conta do Odin é: " + contaOdin.getSaldo());

        contaOdin.transfere(10, primeiraConta);
        System.out.println("novo saldo odin: " + contaOdin.getSaldo());
        System.out.println("novo saldo primeira conta:" + primeiraConta.getSaldo());
    }
}
