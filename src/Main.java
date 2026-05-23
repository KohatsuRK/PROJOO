import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Arvore> floresta = new ArrayList<>();
        int totalArvores = 16000;

        System.out.println("--- Plantando " + totalArvores + " Árvores (2 Espécies) ---");

        for (int i = 0; i < totalArvores; i++) {
            if (i % 2 == 0) {
                TipoArvore carvalho = ArvoreFactory.getTipoArvore(
                        "Carvalho", "Verde Escuro", "textura_carvalho_1MB.png", 1.5
                );
                floresta.add(new Arvore(i, i * 2, carvalho));
            } else {
                TipoArvore pinheiro = ArvoreFactory.getTipoArvore(
                        "Pinheiro", "Verde Claro", "textura_pinheiro_1MB.png", 0.8
                );
                floresta.add(new Arvore(i, i * 2, pinheiro));
            }
        }
        System.out.println("Floresta plantada com sucesso!\n");

        // ---------------------------------------------------------
        // SIMULAÇÃO DO CÁLCULO DE MEMÓRIA
        // ---------------------------------------------------------
        System.out.println("=== RELATÓRIO DE CONSUMO DE MEMÓRIA ===");

        // Pesos simulados (em bytes)
        int pesoPngBytes = 1_000_000; // 1 MB
        int pesoCoordenadasERefBytes = 16; // x(4) + y(4) + ref(8)
        int pesoTotalArvoreSemFlyweight = pesoPngBytes + pesoCoordenadasERefBytes;

        // Cálculo SEM Flyweight (1000 instâncias gigantes)
        long memoriaSemFlyweightBytes = (long) totalArvores * pesoTotalArvoreSemFlyweight;
        double memoriaSemFlyweightMB = memoriaSemFlyweightBytes / 1_000_000.0;

        // Cálculo COM Flyweight
        int tiposUnicos = ArvoreFactory.getQuantidadeTipos();
        long memoriaDosTiposBytes = (long) tiposUnicos * pesoPngBytes;
        long memoriaDasArvoresBytes = (long) totalArvores * pesoCoordenadasERefBytes;

        long memoriaComFlyweightBytes = memoriaDosTiposBytes + memoriaDasArvoresBytes;
        double memoriaComFlyweightMB = memoriaComFlyweightBytes / 1_000_000.0;

        // Impressão dos resultados
        System.out.printf("1. Cenário SEM Flyweight:\n");
        System.out.printf("   - %d árvores instanciando o PNG de 1 MB cada.\n", totalArvores);
        System.out.printf("   - Consumo Estimado: %.2f MB\n\n", memoriaSemFlyweightMB);

        System.out.printf("2. Cenário COM Flyweight (Nosso código):\n");
        System.out.printf("   - %d tipos únicos carregados na memória.\n", tiposUnicos);
        System.out.printf("   - %d instâncias leves de árvores criadas.\n", totalArvores);
        System.out.printf("   - Consumo Estimado: %.3f MB\n\n", memoriaComFlyweightMB);

        // Cálculo de economia
        double economia = 100.0 - ((double) memoriaComFlyweightBytes / memoriaSemFlyweightBytes * 100.0);
        System.out.printf("Economia de RAM gerada pelo padrão: %.2f%%\n", economia);
    }
}