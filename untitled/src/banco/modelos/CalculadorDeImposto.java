package untitled.src.banco.modelos;

public class CalculadorDeImposto {
    double totalImposto;
    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto = totalImposto + valor;
    }

    public double getTotalImposto(){
        return totalImposto;
    }
}
