package inheritance;

public class Soup extends Porrige {
    boolean isMeat;

    @Override
    public String toString() {
        return "Porrige{" +
                "name='" + name +'\'' +
                ", isWater=" + isWater +
                '}';
    }
}
