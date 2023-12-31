package untitled.src.banco.modelos;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente (int agencia, int numero){

        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.5;
        return super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
    @Override
    public String toString() {
        return "ContaCorrente, " + super.toString();
    }
}
