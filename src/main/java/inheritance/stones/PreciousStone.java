package inheritance.stones;

public class PreciousStone extends Stone {
    String name;

    @Override
    public String toString() {
        return "Stone{" +
                "weight'" + weight + '\'' +
                ", price" + price +
                '}';
    }
}
