import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текущий курс доллара: ");
        double curs = scanner.nextDouble();
        System.out.print("Введите количество рублей: ");
        double rubles = scanner.nextDouble();
        double dollars = rubles / curs;
        System.out.printf("Итого: %.2f долларов", dollars);
    }
}