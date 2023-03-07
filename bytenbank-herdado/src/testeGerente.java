public class testeGerente {
    public static void main(String[] args) {

        Autenticavel referencia = new Cliente();

        gerente kaua = new gerente();
        kaua.setNome("gabis");
        kaua.setCpf("000-000-000-00");
        kaua.setSalario(3000.0);

        System.out.println(kaua.getNome());
        System.out.println(kaua.getCpf());
        System.out.println(kaua.getSalario());

        kaua.setSenha(2222);

        boolean autenticou = kaua.autentica(2222);

        System.out.println(autenticou);

        System.out.println(kaua.getbonificacao());



    }
}
