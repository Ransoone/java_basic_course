import java.util.Random;

public class Example {
    public static void main(String[] args) {
        Random rand = new Random();
        double min = 0;
        double max = Double.MAX_VALUE;
        double randomNum = rand.nextDouble() * (max - min) + min;
        int random_znak = rand.nextInt(2);
        if (random_znak == 0) {
            System.out.println("Случайное число: " + randomNum);
        } else {
            System.out.println("Случайное число: " + "-" + randomNum);
        }
    }
}
