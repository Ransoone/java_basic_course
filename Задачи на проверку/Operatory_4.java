import java.util.Scanner;

public class Operatory_4{

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        // Ввод трех чисел
        System.out.print("Введите число x: ");
        int x = scanner.nextInt();

        System.out.print("Введите число y: ");
        int y = scanner.nextInt();

        System.out.print("Введите число z: ");
        int z = scanner.nextInt();

        // Вычисление среднего арифметического
        double average = (x + y + z) / 3;
        System.out.println("Среднее Арифметическое: " + average);

        // Деление среднего арифметического на 2 и округление в меньшую сторону
        int result = (int) Math.floor(average / 2);

        // Проверка результата и вывод сообщения
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}