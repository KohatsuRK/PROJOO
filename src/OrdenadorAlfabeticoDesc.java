import java.util.Comparator;

public class OrdenadorAlfabeticoDesc extends OrdenadorTemplate {
    @Override
    protected String getNomeCriterio() {
        return "Alfabético Decrescente (Desc)";
    }

    @Override
    protected Comparator<String> getComparator() {
        return (p1, p2) -> p2.compareTo(p1); // Inverte a lógica de comparação
    }
}