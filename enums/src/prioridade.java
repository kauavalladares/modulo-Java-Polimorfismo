public enum prioridade {

    MIN(1),Normal(5),Max(10);

    private int valor;

    prioridade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }
}
