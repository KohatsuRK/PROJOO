import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

interface Mediator {
    void enviarMensagem(String mensagem, Usuario remetente);
    void adicionarUsuario(Usuario usuario);
}

