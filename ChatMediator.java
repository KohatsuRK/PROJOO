
public class ChatMediator {

    public static void main(String[] args) throws InterruptedException {

        // Cria o mediador (sala de chat)
        Mediator sala = new ChatRoom("Dev Team");

        // Cria usuários — cada um se registra automaticamente no mediador
        Usuario alice = new UsuarioConcreto("Alice", sala);
        Usuario bob   = new UsuarioConcreto("Bob",   sala);
        Usuario carol = new UsuarioConcreto("Carol", sala);

        // Simula uma conversa — nenhum usuário chama método de outro diretamente
        Thread.sleep(500);
        alice.enviarMensagem("Oi pessoal, o build do dia passou!");

        Thread.sleep(800);
        bob.enviarMensagem("Ótimo! Já vi a notificação aqui.");

        Thread.sleep(600);
        carol.enviarMensagem("Perfeito. Vou aprovar o PR agora.");

        Thread.sleep(700);
        alice.enviarMensagem("Obrigada Carol! 🚀");


        System.out.println("--- Daniel entrou no chat ---\n");
        Thread.sleep(500);
        Usuario daniel = new UsuarioConcreto("Daniel", sala);

        Thread.sleep(600);
        daniel.enviarMensagem("Oi a todos! Posso ajudar com algo?");

        Thread.sleep(700);
        bob.enviarMensagem("Bem-vindo Daniel! Temos uma tarefa nova amanhã.");
    }
}
