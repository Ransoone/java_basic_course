import java.util.Scanner;

public class LatinWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку из слов, разделенных пробелами:");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+"); // Разбиваем строку на массив слов

        int count = 0; // Счетчик слов на латинице
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) { // Проверяем, состоит ли слово только из латинских букв
                System.out.println(word);
                count++;
            }
        }

        System.out.println("Количество слов на латинице: " + count);
    }
}