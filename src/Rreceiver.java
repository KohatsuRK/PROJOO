public class Rreceiver implements ligarAparelho{
    private String marca;
    @Override
    public void liga_desliga(boolean ligar) {
        if (ligar) System.out.println("Ligando Receiver");
        else System.out.println("Desligando Receiver");
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
