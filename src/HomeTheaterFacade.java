import javax.sound.midi.Receiver;

public class HomeTheaterFacade implements ligarAparelho{
    private boolean ligar = false;
    private String marca;
    private Projetor projetor = new Projetor();
    private LuzAmbiente luzAmbiente = new LuzAmbiente();
    private Rreceiver receiver = new Rreceiver();
    private PlayerDeMidia playerDeMidia = new PlayerDeMidia();
    private SistemaSom sistemaSom = new SistemaSom();

    public void assitirFilme(Filme filme){
        projetor.liga_desliga(ligar);
        luzAmbiente.liga_desliga(ligar);
        receiver.liga_desliga(ligar);
        playerDeMidia.liga_desliga(ligar);
        sistemaSom.liga_desliga(ligar);
        System.out.println("Iniciando Filme");
    }

    public void ouvirMusica(Musica musica){
        luzAmbiente.liga_desliga(ligar);
        receiver.liga_desliga(ligar);
        playerDeMidia.liga_desliga(ligar);
        sistemaSom.liga_desliga(ligar);
        System.out.println("Play no spotify");
    }

    @Override
    public void liga_desliga(boolean statusDesejado) {
        this.ligar = statusDesejado;
        if (ligar) System.out.println("Ligando HomeTheater");
        else {
            System.out.println("Desligando");
            projetor.liga_desliga(ligar);
            luzAmbiente.liga_desliga(ligar);
            receiver.liga_desliga(ligar);
            playerDeMidia.liga_desliga(ligar);
            sistemaSom.liga_desliga(ligar);
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
