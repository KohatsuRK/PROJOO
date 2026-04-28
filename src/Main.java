
//a main ele é o único que conhece todos e decide quem se conecta com quem
public class Main {
    public static void main(String[] args) {


        PCD estacao1 = new PCD();
        PCD estacao2 = new PCD();


        Universidade usp     = new Universidade("USP");
        Universidade unifesp = new Universidade("UNIFESP");

        //IoC aqui nesse método
        estacao1.addObserver(usp);
        estacao2.addObserver(unifesp);


        estacao2.setpH(7.0);
        estacao2.setTemp(30.0);
        estacao2.setPR("10");
        estacao2.setUra(6.0);


        System.out.println("Alterando a Temperatura da estacao1...");
        estacao1.setTemp(28.5);

        System.out.println("\nAlterando o pH da estacao1...");
        estacao1.setpH(7.2);

        System.out.println("\nAlterando Temperatura da estacao2...");
        estacao2.setTemp(15.0);
    }
}