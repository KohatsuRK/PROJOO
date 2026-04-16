public class Canela extends ComplementosDecorator{
    public Canela(BebidaBase bebida ) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaComComplementos.getDescricao() + " com canela";
    }

    @Override
    public double getPreco() {
        return bebidaComComplementos.getPreco() + 0.50;
    }
}
