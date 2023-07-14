public class Conta {

    int agencia;

    int numero;
    // ao declarar o atributo como privado, apenas a própria classe pode acessá-lo
    private double getSaldo;
    Cliente titular;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.getSaldo;
    }
    /*
    LINHAS DE CÓDIGO DESNECESSÁRIAS DEVIDO AO FATO QUE DE O SALDO NÃO
    SERÁ ALTERADO PELO MÉTODO SET, APENAS ATRAVÉS DAS INTERAÇÕES
    COM OS MÉTODOS DEFINIDOS
    public void setSaldo(int numero) {
        this.numero = numero;
    }
    */

    public Cliente getTitular(){
        return this.titular;
    }
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
    public void deposita(double valor) {
        this.getSaldo = this.getSaldo + valor;
    }

    public boolean saca(double valor) {
        if (getSaldo >= valor) {
            this.getSaldo = this.getSaldo - valor;
            System.out.println("Saque efetuado com sucesso!");
            return true;
        } else {
            System.out.println("saldo indisponível");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (getSaldo >= valor) {
            this.getSaldo -= valor;
            destino.deposita(valor);
            System.out.println("Transferencia efetuada com sucesso!");
            return true;
        }
        System.out.println("Saldo para transferência indisponível");
        return false;
    }


}
