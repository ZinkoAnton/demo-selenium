package inheritance.stones;

public class Main {
    public static void main(String[] args) {
        PreciousStone preciousStone = new PreciousStone();//хранит всю информацию об объекте
        preciousStone.name = "diamond";
        preciousStone.price = 6;
        preciousStone.weight = 12600;
        System.out.println(preciousStone);
    }
}
