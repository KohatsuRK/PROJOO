public class Main {
    public static void main(String[] args) {
        PCD estacao = new PCD(); //sujeiro
        PCD estacao2 = new PCD();
        Universidade usp = new Universidade(estacao, "USP"); //Obsercvador
        estacao2.setpH(7.0);
        estacao2.setTemp(30.0);
        estacao2.setPR("10");
        estacao2.setUra(6.0);
        Universidade unifesp = new Universidade(estacao2, "UNIFESP");

        System.out.println("Alterando a Temperatura...");

        estacao.setTemp(28.5);

        System.out.println("\nAlterando o pH...");
        estacao.setpH(7.2);
        System.out.println("\nAlterando temp...");
        estacao2.setTemp(15.0);
    }
}