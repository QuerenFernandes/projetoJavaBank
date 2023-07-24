package untitled.src;

public abstract class Conta {
    int agencia;
    int numero;
    // ao declarar o atributo como privado, apenas a própria classe pode acessá-lo
    protected double saldo;
    // atributo global que irá contar quantas contas já foram criadas
    private static int total = 0;
    private Cliente titular;


    //criando o construtor da conta
    public Conta (int agencia, int numero) {
        Conta.total ++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Conta criada com sucesso! " + "agencia: " + this.agencia + "número: " + this.numero);

    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.printf("Não pode ser um valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.printf("O número não pode ser um valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }
    /*
    LINHAS DE CÓDIGO DESNECESSÁRIAS DEVIDO AO FATO QUE DE O SALDO NÃO
    SER ALTERADO PELO MÉTODO SET, APENAS ATRAVÉS DAS INTERAÇÕES
    COM OS MÉTODOS DEFINIDOS
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    */
    public Cliente getTitular(){
        return this.titular;
    }
    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if (saldo >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque efetuado com sucesso!");
            return true;
        } else {
            System.out.println("saldo indisponível");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            System.out.println("Transferencia efetuada com sucesso!");
            return true;
        }
        System.out.println("Saldo para transferência indisponível");
        return false;
    }


}
