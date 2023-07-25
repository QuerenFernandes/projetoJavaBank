package untitled.src;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(40, 8888);
        cc.deposita(100);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();

        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }


}
