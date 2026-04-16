public class ComplementosDecorator implements BebidaBase{
    protected BebidaBase bebidaComComplementos;

    public ComplementosDecorator(BebidaBase bebida) {
        this.bebidaComComplementos = bebida;
    }

    @Override
    public String getDescricao() {
        return "";
    }

    @Override
    public double getPreco() {
        return 0;
    }

}
