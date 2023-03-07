public class TesteTributavel {

    public static void main(String[] args) {
        ContaCorrente kaua = new ContaCorrente(222,333);
        kaua.deposita(100.0);

        SeguroDeVida seguro = new  SeguroDeVida();

        CalculadorDeImposto cal = new CalculadorDeImposto();
        cal.registra(kaua);
        cal.registra(seguro);

        System.out.println(cal.getTotalImposto());

    }
}
