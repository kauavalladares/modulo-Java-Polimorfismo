
//gerente é um funcionario,gerente herda da class funcionario.
public class gerente extends funcionario{


    private int senha;

    //public double getbonificação() {
    //    return this.salario;
   // }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;

        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
