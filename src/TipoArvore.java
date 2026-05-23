public class TipoArvore {
    private String nome;
    private String cor;
    private String tamanho; // Simula um arquivo pesado, como um PNG
    private double larguraTronco;
    // Classe Flyweight

    public TipoArvore(String nome, String cor, String tamanho, double larguraTronco) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
        this.larguraTronco = larguraTronco;
        System.out.println("   [!] Nova espécie carregada na memória: " + nome);
    }
}
