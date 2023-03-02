
//gerente é um funcionario,gerente herda da class funcionario.
public class gerente extends funcionario{

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public double getbonificacao() {
        System.out.println("chamando o metodo de bonificação do gerente. ");
        return super.getbonificacao()  + super.getSalario();
     }
}
