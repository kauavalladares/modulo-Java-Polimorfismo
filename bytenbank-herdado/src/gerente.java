
//gerente é um funcionario autenticavel, gerente herda da class funcionario,
// assina a contrato autenticavel, e um autenticavel.
public class gerente extends  funcionario implements Autenticavel {

    private autentificacaoutil autenticador;

    public gerente () {
        this.autenticador = new autentificacaoutil();
    }
        public double getbonificacao () {
            System.out.println("chamando o metodo de bonificação do gerente. ");
            return super.getSalario();
        }


        @Override
        public void setSenha ( int senha){
            this.autenticador.setSenha(senha);
        }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }


}
