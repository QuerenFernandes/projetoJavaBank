package untitled.src;

public class TestaGerente {
    public static void main(String[] args) {
        Gerente odin = new Gerente();
        odin.setNome("Odin");
        odin.setCpf("999.999.999-99");
        odin.setCargo("Pai de Todos");
        odin.setSalario(10000);

        System.out.println("Nome do gerente: " + odin.getNome());
        System.out.println("CPF do gerente: " + odin.getCpf());
        System.out.println("Cargo do gerente: " + odin.getCargo());
        System.out.println("Salario do gerente: " + odin.getSalario());
        System.out.println("Bonificacao do gerente: " + odin.getBonificacao());
    }

}
