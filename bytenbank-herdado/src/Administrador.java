public class Administrador extends funcionario implements Autenticavel {

    private  autentificacaoutil autenticador;

    public Administrador () {
        this.autenticador = new autentificacaoutil();
    }
    @Override
    public double getbonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }




}
