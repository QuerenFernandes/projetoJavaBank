package untitled.src.banco.testes;

public class TesteString {
    public static void main(String[] args) {
        String nome = "Queren"; // object literal
        String outro = new String ("Hapuque"); ////má prática, sempre prefere a sintaxe literal

        String novo = outro.replace("a", "b");

        System.out.println(novo);

    }

}
