public class Projetor implements ligarAparelho{
    private String marca;
    @Override
    public void liga_desliga(boolean ligar) {
        if (ligar) System.out.println("Ligando Projetor");
        else System.out.println("Desligando Projetor");
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
