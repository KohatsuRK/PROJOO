public class Arvore {
    private int x;
    private int y;
    private TipoArvore tipo; // Referência para o objeto compartilhado

    public Arvore(int x, int y, TipoArvore tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }
}
