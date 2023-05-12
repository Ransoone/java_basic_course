import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число строк: ");
        int n = input.nextInt();
        System.out.print("Введите длинну строк: ");
        int k = input.nextInt();

        double[][] arr = new double[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++){
            System.out.print("Введите элемент массива: ");
            arr[i][j] = input.nextDouble();
            }
    }
     for (int i = 0; i < n; i++) {
        System.out.print("\n");
            for (int j = 0; j < k; j++){
                System.out.print(arr[i][j]*3+" ");
            }
        }
            
        }        
    }
