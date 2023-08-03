package untitled.src.banco.testes;

import untitled.src.banco.modelos.Funcionario;
import untitled.src.banco.modelos.Gerente;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario queren = new Gerente();
        queren.setNome("Queren Hapuque");
        queren.setCpf("111.111.111-11");
        queren.setCargo("Engenheira de Software");
        queren.setSalario(5000);

        System.out.println("Dados da funcionária: " + queren.getNome() + queren.getCpf() +  queren.getCargo() + queren.getSalario() + queren.getBonificacao());
    }
}
