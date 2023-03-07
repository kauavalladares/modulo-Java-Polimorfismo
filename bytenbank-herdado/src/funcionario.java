//
//“abstract” e como mostramos que funcionario não e uma classe concreta,
// pois funcionario e uma classe conceito não concreta como, por exemplo, a classe gerente
// assim não podemos instanciar objetos desta classe por ela ser abstrata.
public abstract class funcionario {


    private String nome;
    private String Cpf;
    //protected deixa este atributo publico para os "filhos" desta classe, mas somente para eles.
    private double salario;

    //metodo sem corpo, não a implentção.
    public abstract double getbonificacao();

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
