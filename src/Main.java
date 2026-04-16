//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BebidaBase cafe = new Cafe();
        cafe = new Leite(cafe);
        cafe = new Chantily(cafe);
        cafe = new Canela(cafe);

        System.out.println("Pedido: " + cafe.getDescricao() + ".");
        System.out.println("TOTAL: R$" + cafe.getPreco());

       BebidaBase cha = new Cha();
       cha = new Leite(cha);
        System.out.println("Pedido: " + cha.getDescricao() + ".");
        System.out.println("TOTAL: R$" + cha.getPreco());



        BebidaBase capuccino = new Cappuccino();
        //capuccino = new Cha(capuccino); não funciona isso pois o cha, capu e cafe não tem construtor e pq não extenderam o complementos decorator
        capuccino = new Chantily(capuccino);
        System.out.println("Pedido: " + capuccino.getDescricao() + ".");
        System.out.println("TOTAL: R$" + capuccino.getPreco());





    }
}