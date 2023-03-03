
//gerente é um funcionario autenticavel, gerente herda da class funcionario.
public class gerente extends FuncionarioAutentica {


    public double getbonificacao() {
        System.out.println("chamando o metodo de bonificação do gerente. ");
        return super.getSalario();
     }
}
