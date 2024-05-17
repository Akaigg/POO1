public abstract class RetanguloDecorator implements DesenhoRetangulo {

    private DesenhoRetangulo retanguloDesenhado;

    public RetanguloDecorator(DesenhoRetangulo retanguloDesenhado) {
        this.retanguloDesenhado = retanguloDesenhado;
    }

    @Override
    public void setLargura(int largura) {
        retanguloDesenhado.setLargura(largura);
    }

    @Override
    public void setAltura(int altura) {
        retanguloDesenhado.setAltura(altura);
    }

    @Override
    public void setTexto(String texto) {
        retanguloDesenhado.setTexto(texto);
    }

    @Override
    public abstract void desenhar();

    protected void desenharRetanguloBase() {
        retanguloDesenhado.desenhar();
    }
}
