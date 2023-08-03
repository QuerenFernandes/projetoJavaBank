package untitled.src.banco.modelos;

/**
 * Classe que representa um cliente no ByteBank
 *
 * @author Queren
 * @version 0.1
 */

public class Cliente implements Autenticavel {

        private int senha;

        @Override
        public void setSenha(int senha){
                this.senha = senha;
        }

        @Override
        public boolean autentica(int senha){

                if(this.senha == senha){
                        return true;
                } else {
                        return false;
                }
        }
}
