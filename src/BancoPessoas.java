import java.util.HashMap;
import java.util.Map;

public class BancoPessoas {
    // Mapa 1: O "Banco de Dados" em memória
    private static final Map<Integer, Pessoa> bancoDados = new HashMap<>();

    // Mapa 2: O Registro de Comandos (Exigência do padrão Command)
    private static final Map<String, Command> mapaComandos = new HashMap<>();

    // Bloco estático para registrar os comandos disponíveis no inicializador
    static {
        mapaComandos.put("new", new NewCommand());
        mapaComandos.put("delete", new DeleteCommand());
        mapaComandos.put("get", new ComandoGet());
        mapaComandos.put("all", new listaAllCommand());
    }
}