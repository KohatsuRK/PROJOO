import java.util.Arrays;
import java.util.Comparator;

public abstract class OrdenadorTemplate {

    // O TEMPLATE METHOD: Define o esqueleto invariável do processo
    public final void ordenarEExibir(String[] palavras) {
        // Clona o array original para um teste não interferir no outro
        String[] copia = palavras.clone();

        System.out.println("Cenário: " + getNomeCriterio());
        System.out.println("Antes:  " + Arrays.toString(copia));

        // Passo customizável: delega a estratégia de comparação para a subclasse
        Arrays.sort(copia, getComparator());

        System.out.println("Depois: " + Arrays.toString(copia));
        System.out.println("------------------------------------------------");
    }

    // Passos primitivos (ganchos) que as subclasses devem implementar
    protected abstract String getNomeCriterio();
    protected abstract Comparator<String> getComparator();
}