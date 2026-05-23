import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {
    private static Map<String, TipoArvore> tipos = new HashMap<>();

    public static TipoArvore getTipoArvore(String nome, String cor, String tamanho, double larguraTronco) {
        TipoArvore resultado = tipos.get(nome);

        // Se a espécie ainda não existe no cache, nós a criamos.
        if (resultado == null) {
            resultado = new TipoArvore( nome,  cor,  tamanho,  larguraTronco);
            tipos.put(nome, resultado);
        }
        return resultado;
    }

    public static int getQuantidadeTipos() {
        return tipos.size();
    }
}