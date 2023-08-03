package untitled.src.banco.modelos;

public class Engenheiro extends Funcionario{
        public double getBonificacao(){
            System.out.println("Chamando o método de bonificacao do Engenheiro");
            return 200;
        }
}
