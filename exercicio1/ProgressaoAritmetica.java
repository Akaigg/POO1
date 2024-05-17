public class ProgressaoAritmetica extends Progressao {

    public ProgressaoAritmetica(int termoInicial, int razao) {
        super(termoInicial, razao);
    }

    @Override
    public int obterProximo() {
        proximoTermo += razao;
        return proximoTermo;
    }
}
