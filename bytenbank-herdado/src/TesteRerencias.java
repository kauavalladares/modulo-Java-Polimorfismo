public class TesteRerencias {
    public static void main(String[] args) {

        gerente  kaua1 = new gerente();
        kaua1.setNome("kaua");
        kaua1.setSalario(5000.0);


        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        designer d = new designer();
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(kaua1);
        controle.registra(ev);
        controle.registra(d);


        System.out.println(controle.getSoma());



    }
}
