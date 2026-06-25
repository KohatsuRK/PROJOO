import java.util.Comparator;

public class OrdenadorTamanho extends OrdenadorTemplate {
    @Override
    protected String getNomeCriterio() {
        return "Por Tamanho da Palavra";
    }

    @Override
    protected Comparator<String> getComparator() {
        return (p1, p2) -> Integer.compare(p1.length(), p2.length());
    }
}