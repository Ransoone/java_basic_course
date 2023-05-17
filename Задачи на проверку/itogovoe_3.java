import java.util.Scanner;

public class MaxUniqueCharsString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String maxUniqueCharsString = "";
        int maxUniqueChars = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Строка " + i + ": ");
            String currentString = scanner.nextLine();

            int uniqueChars = getUniqueCharsCount(currentString);
            if (uniqueChars > maxUniqueChars) {
                maxUniqueChars = uniqueChars;
                maxUniqueCharsString = currentString;
            }
        }

        System.out.println("Ответ: " + maxUniqueCharsString);
    }

    public static int getUniqueCharsCount(String string) {
        int uniqueChars = 0;
        boolean[] visited = new boolean[256]; 

        for (int i = 0; i < string.length(); i++) {
            int charValue = string.charAt(i);

            if (!visited[charValue]) {
                visited[charValue] = true;
                uniqueChars++;
            }
        }

        return uniqueChars;
    }
}