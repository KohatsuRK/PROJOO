import java.util.Observable;
import java.util.Observer;

public class Universidade implements Observer {
    private String nomeUniversidade;
    public Universidade(Observable PCD, String nomeUniversidade) {
        PCD.addObserver(this);
        this.nomeUniversidade = nomeUniversidade;
    }

    @Override
    public void update(Observable o, Object arg) {
            if(o instanceof PCD){
                PCD estacao = (PCD) o;
                //sensitivo a qualuqer mudanca

                System.out.println("\n["+ nomeUniversidade + "]Novos dados recebidos da PCD:");
                System.out.println("Temperatura: " + estacao.getTemp());
                System.out.println("pH: " + estacao.getpH());
                System.out.println("PR: " + estacao.getPR());
                System.out.println("Umidade Relativa (ura): " + estacao.getUra());
            }
    }
}
