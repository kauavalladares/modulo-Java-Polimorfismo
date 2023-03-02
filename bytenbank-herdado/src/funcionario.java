public class funcionario {

    private String nome;
    private String Cpf;
    //protected deixa o este atributo publico pra as os "filhos" desta classe mas somente para eles.
    private double salario;

    public double getbonificacao() {

        return this.salario * 0.05;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }
}
