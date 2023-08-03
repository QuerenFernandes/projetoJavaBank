package untitled.src.banco.modelos;
// não é possível instanciar a classe porque a mesma é abstrata.
public abstract class Funcionario {
    private String nome;
    private String cargo;

    private String cpf;

    private double salario;

    public Funcionario(){

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
// o método abstrato obriga as classes filhas a implementarem o método
    public abstract double getBonificacao();
}
