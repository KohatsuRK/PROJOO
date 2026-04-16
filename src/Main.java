public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        Filme filme = new Filme();
        Musica musica = new Musica();

        homeTheaterFacade.liga_desliga(true);
        homeTheaterFacade.assitirFilme(filme);
        homeTheaterFacade.liga_desliga(false);
        homeTheaterFacade.liga_desliga(true);
        homeTheaterFacade.ouvirMusica(musica);
        homeTheaterFacade.liga_desliga(false);


    }
}
