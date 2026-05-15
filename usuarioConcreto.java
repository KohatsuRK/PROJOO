
class UsuarioConcreto implements Usuario {

    private final String nome;
    private final Mediator mediator;   // só conhece o mediador

    public UsuarioConcreto(String nome, Mediator mediator) {
        this.nome = nome;
        this.mediator = mediator;
        mediator.adicionarUsuario(this);   // se registra no mediador ao nascer
    }

    @Override
    public String getNome() {
        return nome;
    }

    // Envia: delega ao mediador — não sabe quem receberá
    @Override
    public void enviarMensagem(String mensagem) {
        mediator.enviarMensagem(mensagem, this);
    }

    // Recebe: simplesmente exibe no console
    @Override
    public void receberMensagem(String mensagem, String remetente) {
        System.out.println("    📩 " + nome + " recebeu de " + remetente + ": \"" + mensagem + "\"");
    }
}

