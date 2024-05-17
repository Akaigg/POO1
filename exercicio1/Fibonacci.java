public class Fibonacci extends Progressao {

    public Fibonacci() {
        super(0, 1);
    }

    @Override
    public int obterProximo() {
        int proximoTermoAnterior = proximoTermo;
        proximoTermo = proximoTermoAnterior + termoInicial;
        termoInicial = proximoTermoAnterior;
        return proximoTermo;
    }
}
