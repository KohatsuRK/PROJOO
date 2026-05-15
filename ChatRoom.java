class ChatRoom implements Mediator {

    private final String nome;
    private final List<Usuario> usuarios = new ArrayList<>();
    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");

    public ChatRoom(String nome) {
        this.nome = nome;
        System.out.println("=== Chat '" + nome + "' criado ===\n");
    }

    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("[" + agora() + "] ✅ " + usuario.getNome() + " entrou no chat.\n");
    }

    // Ponto central: recebe a mensagem e distribui para TODOS, exceto o remetente.
    @Override
    public void enviarMensagem(String mensagem, Usuario remetente) {
        System.out.println("[" + agora() + "] " + remetente.getNome() + " diz: \"" + mensagem + "\"");

        for (Usuario u : usuarios) {
            if (u != remetente) {                    // não envia de volta para quem enviou
                u.receberMensagem(mensagem, remetente.getNome());
            }
        }
        System.out.println();
    }

    private String agora() {
        return LocalTime.now().format(fmt);
    }
}

