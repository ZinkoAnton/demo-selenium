package inheritance;

public class Main {
    public static void main(String[] args) {
        Porrige porrige = new Porrige();//экземпляры класса
        porrige.name = "Гречка";
        porrige.isWater = false;
        System.out.println(porrige);

        Soup soup = new Soup();
        soup.name = "Борщ";
        soup.isWater = true;
        soup.isMeat = true;
        System.out.println(soup);

    }
}
