package inheritance;

public class Porrige {
    String name;
    boolean isWater;

    @Override
    public String toString() { //выводит два свойства
        return "Soup{" +//название класса
                "name='" + name + '\'' +//переменные
                ", isWater=" + isWater +//переменные
                '}';
    }
}
