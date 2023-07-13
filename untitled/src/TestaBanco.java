public class TestaBanco {
    public static void main(String[] args) {
        Cliente queren = new Cliente();
        queren.nome = "Queren Hapuque";
        queren.cpf = "000.000.000-00";
        queren.profissao = "engenheira de software";

        Conta contaDaQueren = new Conta();
        contaDaQueren.deposita(5000);

        contaDaQueren.titular = queren;
    }
}
