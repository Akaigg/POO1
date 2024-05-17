public abstract class Progressao {

    private int termoInicial;
    private int razao;
    private int proximoTermo;

    public Progressao(int termoInicial, int razao) {
        this.termoInicial = termoInicial;
        this.razao = razao;
        this.proximoTermo = termoInicial;
    }

    public abstract int obterProximo();

    public void reiniciar() {
        this.proximoTermo = termoInicial;
    }
}
