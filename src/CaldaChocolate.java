public class CaldaChocolate extends ComplementosDecorator{
    public CaldaChocolate(BebidaBase bebida ) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaComComplementos.getDescricao() + "com Calda de Chocolate";
    }

    @Override
    public double getPreco() {
        return bebidaComComplementos.getPreco() + 2.00;
    }
}
