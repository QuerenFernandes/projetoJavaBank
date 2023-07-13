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
                return true;
            } else {
                return false;
            }
        }
    }
