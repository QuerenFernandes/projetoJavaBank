import java.sql.SQLOutput;

public class Conta {
        int numero;
        int agencia;
        double saldo;
        String titular;

        public void deposita(double valor){

            this.saldo = this.saldo + valor;
        }

        public boolean saca(double valor){
            if(saldo >= valor) {
                this.saldo = this.saldo - valor;
                System.out.println("Saque efetuado com sucesso!");
                return true;
            } else {
                System.out.println("saldo indisponível");
                return false;
            }
        }
        public boolean transfere(double valor, Conta destino){
            if(saldo >= valor){
                this.saldo -= valor;
                destino.deposita(valor);
                System.out.println("Transferencia efetuada com sucesso!");
                return true;
            }
            System.out.println("Saldo para transferência indisponível");
            return false;
        }
    }
