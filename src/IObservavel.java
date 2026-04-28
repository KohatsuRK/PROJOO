import java.util.Observer;

public interface IObservavel {

    void addObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers(Object dados);
}
