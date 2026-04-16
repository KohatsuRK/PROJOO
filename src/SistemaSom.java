public class SistemaSom implements ligarAparelho{
    private String marca;
    @Override
    public void liga_desliga(boolean ligar) {
        if (ligar) System.out.println("Ligando Sistema de som");
        else System.out.println("Desligando Sistema de som");
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
