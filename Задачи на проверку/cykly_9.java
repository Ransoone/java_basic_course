import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = input.nextInt();
        double sum_mass =0;

        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент массива: ");
            arr[i] = input.nextDouble();
            sum_mass+=arr[i];
        }
        double average =sum_mass/n;
            System.out.print("Среднее арифметическое:" + average + "\n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]*average+ ";" + "\n");
            
        }        
    }
}