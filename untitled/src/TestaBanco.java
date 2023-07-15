public class TestaBanco {
    public static void main(String[] args) {
        Cliente queren = new Cliente();
        queren.setNome("Queren Hapuque");
        queren.setCpf("000.000.000-00");
        queren.setProfissao("engenheira de software");

        Conta contaDaQueren = new Conta(0104, 123654);
        contaDaQueren.deposita(5000);

        //associa a cliente queren à conta contaDaQueren (composição)
        contaDaQueren.titular = new Cliente();
        contaDaQueren.setTitular(queren);
        System.out.println(contaDaQueren.getTitular());
    }
}
