public class PlayerDeMidia implements ligarAparelho{
    private String marca;
    @Override
    public void liga_desliga(boolean ligar) {
        if (ligar) System.out.println("Ligando o Player de Midia*");
        else System.out.println("Desligando o Player de Midia");
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
