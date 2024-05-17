public class ProgressaoGeometrica extends Progressao {

    public ProgressaoGeometrica(int termoInicial, int razao) {
        super(termoInicial, razao);
    }

    @Override
    public int obterProximo() {
        proximoTermo *= razao;
        return proximoTermo;
    }
}
