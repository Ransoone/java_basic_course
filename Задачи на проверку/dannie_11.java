import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число 1: ");
        String n = input.nextLine();
        System.out.print("Введите число 2: ");
        int k = input.nextInt();
        int n_int = Integer.parseInt(n);
if (n_int>k)
{
System.out.print(n+"\n");
double k_double=k;
System.out.print(k_double);
}
else{
    System.out.print(k+"\n");
    double n_double= Double.parseDouble(n);
System.out.print(n_double);
}
         }}
