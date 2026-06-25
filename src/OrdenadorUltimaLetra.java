import java.util.Comparator;

public class OrdenadorUltimaLetra extends OrdenadorTemplate {
    @Override
    protected String getNomeCriterio() {
        return "Ordenação pela Última Letra";
    }

    @Override
    protected Comparator<String> getComparator() {
        return (p1, p2) -> {
            char ultimo1 = p1.isEmpty() ? ' ' : p1.charAt(p1.length() - 1);
            char ultimo2 = p2.isEmpty() ? ' ' : p2.charAt(p2.length() - 1);
            return Character.compare(ultimo1, ultimo2);
        };
    }
}