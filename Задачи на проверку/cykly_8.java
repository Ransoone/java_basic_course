import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0;

        System.out.print("Введите целое положительное число: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if(i%2==1)
            {
                a = a+i;
            }
            
        }
        System.out.print("Сумма нечентных чисел до"+n+"="+a);
    }
}