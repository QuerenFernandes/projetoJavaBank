package untitled.src.banco.testes;

import untitled.src.banco.modelos.CalculadorDeImposto;
import untitled.src.banco.modelos.ContaCorrente;
import untitled.src.banco.modelos.SeguroDeVida;

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
