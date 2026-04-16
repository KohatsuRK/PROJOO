public class Chantily extends ComplementosDecorator{
    public Chantily(BebidaBase bebida ) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaComComplementos.getDescricao() + " com chantily";
    }

    @Override
    public double getPreco() {
        return bebidaComComplementos.getPreco() + 1.50;
    }
}
