import main.Configurar;
import main.Notificacao;

public class SMS implements Notificacao {
    @Override
    public void notificar(String mensagem) {
        Configurar config = Configurar.getInstance();
        System.out.println("Enviando SMS");
        config.ImprimeInformacoes();
    }

}
