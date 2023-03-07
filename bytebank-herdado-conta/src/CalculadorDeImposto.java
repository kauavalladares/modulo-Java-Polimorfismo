public class CalculadorDeImposto {

    private double TotalImposto;
    public void registra(Tributavel t ){
       double valor = t.GetValorImposto();
       this.TotalImposto += valor;
    }

    public double getTotalImposto() {
        return TotalImposto;
    }
}
