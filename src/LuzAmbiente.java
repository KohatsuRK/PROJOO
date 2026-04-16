public class LuzAmbiente implements ligarAparelho{
    private String marca;
    @Override
    public void liga_desliga(boolean ligar) {
        if (ligar) System.out.println("Ligando Luz Ambiente");
        else System.out.println("Desligando Luz ambiente");
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
