

public class Main {
    public static void main(String[] args) {

        // ── Criação dos subjects (PCDs) ──────────────────────────────────────
        PCD estacao1 = new PCD();
        PCD estacao2 = new PCD();

        // ── Criação dos observers (Universidades) ────────────────────────────
        Universidade usp     = new Universidade("USP");
        Universidade unifesp = new Universidade("UNIFESP");

        // ── Registro: Main é o único responsável por conectar os dois lados ──
        // IoC completa: nem PCD nem Universidade se conhecem diretamente.
        estacao1.addObserver(usp);
        estacao2.addObserver(unifesp);

        // ── Inicialização da estacao2 sem disparar notificações desnecessárias ─
        // (setters individuais notificam; ajuste conforme a regra de negócio)
        estacao2.setpH(7.0);
        estacao2.setTemp(30.0);
        estacao2.setPR("10");
        estacao2.setUra(6.0);

        // ── Mudanças que disparam notificações ───────────────────────────────
        System.out.println("Alterando a Temperatura da estacao1...");
        estacao1.setTemp(28.5);

        System.out.println("\nAlterando o pH da estacao1...");
        estacao1.setpH(7.2);

        System.out.println("\nAlterando Temperatura da estacao2...");
        estacao2.setTemp(15.0);
    }
}