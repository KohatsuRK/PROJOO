public class Leite extends ComplementosDecorator{
    //construtor e joga para cima
    public Leite(BebidaBase bebida ) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaComComplementos.getDescricao() + " com leite";
    }

    @Override
    public double getPreco() {
        return bebidaComComplementos.getPreco() + 1.00;
    }
}
