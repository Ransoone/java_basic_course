import java.util.Scanner;
public class Zagadka { public static void main(String[] args) 
{ 
    Scanner scanner = new Scanner(System.in); 
    String answer = "Заархивированый вирус"; 
    int attempts = 3; 
    boolean hintUsed = false;
    while (attempts > 0) {
        if(attempts==3)
        {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        if (!hintUsed) {
            System.out.println("У вас есть возможность взять подсказку перед первым ответом.");
            System.out.print("Хотите взять подсказку? (да/нет): ");
            String hintChoice = scanner.nextLine();
            if (hintChoice.equalsIgnoreCase("да")) {
                System.out.println("Ответ связан с компьютерной безопасностью");
                hintUsed = true;
                attempts = 1;
            }
        }
    }
        System.out.print("Введите ответ: ");
        String input = scanner.nextLine();

        if (input.equals(answer)) 
        {
            System.out.println("Правильно!");
            return;
        } else if (attempts == 1) {
            System.out.println("Обидно, приходи в другой раз");
            return;
        } else {
            System.out.println("Подумай еще!");
            attempts--;
        }
    }
}
}