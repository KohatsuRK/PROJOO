import java.util.Map;

public class ComandoGet implements Command {
    @Override
    public void execute(String[] args, Map<Integer, Pessoa> banco) {
        if (args.length < 2) {
            System.out.println("Erro: Sintaxe correta: get <id>");
            return;
        }
        int id = Integer.parseInt(args[1]);
        Pessoa p = banco.get(id);
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("ID " + id + " não encontrado.");
        }
    }
}