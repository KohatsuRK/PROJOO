import java.util.ArrayList;
import java.util.List;

public class PCD implements IObservavel {

    private Double temp;
    private Double pH;
    private String PR;
    private Double ura;

    private final List<IObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Object dados) {
        for (IObserver observer : observers) {
            observer.update(dados);
        }
    }

    private void publicarDados() {
        notifyObservers(new DadosPCD(temp, pH, PR, ura));
    }

    public Double getTemp() { return temp; }
    public void setTemp(Double temp) {
        this.temp = temp;
        publicarDados();
    }

    public Double getpH() { return pH; }
    public void setpH(Double pH) {
        this.pH = pH;
        publicarDados();
    }

    public String getPR() { return PR; }
    public void setPR(String PR) {
        this.PR = PR;
        publicarDados();
    }

    public Double getUra() { return ura; }
    public void setUra(Double ura) {
        this.ura = ura;
        publicarDados();
    }
}