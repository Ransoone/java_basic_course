import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        //String str = "I like Java!!!";
        Scanner input = new Scanner(System.in);

        System.out.print("Введите текст \"I like Java!!!\" : ");
        String str = input.nextLine();

        // 1. Проверка, содержит ли строка подстроку "Java"
        if (str.contains("Java")) {
            System.out.println("Строка содержит подстроку \"Java\"");
        }

        // 2. Проверка, начинается ли строка с подстроки "I like"
        if (str.startsWith("I like")) {
            System.out.println("Строка начинается с подстроки \"I like\"");
        }

        // 3. Проверка, заканчивается ли строка с подстрокой "!!!"
        if (str.endsWith("!!!")) {
            System.out.println("Строка заканчивается на подстроку \"!!!\"");
        }

        // 4. Если 3 условия верны, вывести строку в верхнем регистре
        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
            System.out.println(str.toUpperCase());
        }

        // 5. Заменить символы 'a' на 'о' и вывести подстроку "Jovo"
        String newStr = str.replace('a', 'o');
        System.out.println(newStr.substring(7, 11));
    }
}
