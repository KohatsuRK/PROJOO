import java.util.Observable;
import java.util.Observer;

public class Universidade implements IObserver {
    private String nomeUniversidade;
    public Universidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
    }

    @Override
    public void update(Object dados) {
            if(dados instanceof DadosPCD estacao){
                //sensitivo a qualuqer mudanca

                System.out.println("\n["+ nomeUniversidade + "]Novos dados recebidos da PCD:");
                System.out.println("Temperatura: " + estacao.temp());
                System.out.println("pH: " + estacao.pH());
                System.out.println("PR: " + estacao.PR());
                System.out.println("Umidade Relativa (ura): " + estacao.ura());
            }
    }
}
