import java.util.Comparator;

public class OrdenadorAlfabetico extends OrdenadorTemplate {
    @Override
    protected String getNomeCriterio() {
        return "Alfabético Padrão (Ascendente)";
    }

    @Override
    protected Comparator<String> getComparator() {
        return (p1, p2) -> p1.compareTo(p2); // Ordem natural da String
    }
}