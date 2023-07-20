package untitled.src;

public class TestaReferencias {
    public static void main(String[] args) {

        Estagiario athena = new Estagiario();
        athena.setNome("Athena");
        athena.setSalario(1000);

        Engenheiro noemy = new Engenheiro();
        noemy.setNome("Noemy");
        noemy.setSalario(5000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(athena);
        controle.registra(noemy);

        System.out.println(controle.getSoma());
    }
}
