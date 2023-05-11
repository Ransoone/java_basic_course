import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент массива: ");
            arr[i] = input.nextInt();
        }

        final int x = 10;
        final int y = 20;
        final int z = 30;

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x || arr[i] == y || arr[i] == z) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Данное значение имеется в константах");
        } 
    }
}