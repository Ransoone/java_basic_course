import java.util.Scanner;

public class Operatory_6{

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция");
            int unit = input.nextInt();

            System.out.println("Введите количество выбранных единиц:");
            double amount = input.nextDouble();

            if (unit == 1) {
                System.out.println("Результат:");
                System.out.println("Килограммы: " + amount);
                System.out.println("Фунты: " + amount * 2.20462);
                System.out.println("Унции: " + amount * 35.274);
            } else if (unit == 2) {
                System.out.println("Результат:");
                System.out.println("Фунты: " + amount);
                System.out.println("Килограммы: " + amount / 2.20462);
                System.out.println("Унции: " + amount * 16);
            } else if (unit == 3) {
                System.out.println("Результат:");
                System.out.println("Унции: " + amount);
                System.out.println("Килограммы: " + amount / 35.274);
                System.out.println("Фунты: " + amount / 16);
            }  else {
                System.out.println("Неверный выбор единицы измерения!");
            }

        } else if (choice == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int unit = input.nextInt();

            System.out.println("Введите количество выбранных единиц:");
            double amount = input.nextDouble();

            if (unit == 1) {
                System.out.println("Результат:");
                System.out.println("Метры: " + amount);
                System.out.println("Мили: " + amount * 0.000621371);
                System.out.println("Ярды: " + amount * 1.09361);
                System.out.println("Футы: " + amount * 3.28084);
            } else if (unit == 2) {
                System.out.println("Результат:");
                System.out.println("Мили: " + amount);
                System.out.println("Метры: " + amount * 1609.34);
                System.out.println("Ярды: " + amount * 1760);
                System.out.println("Футы: " + amount * 5280);
            }
            else if (unit == 3) {
                System.out.println("Результат:");
                System.out.println("Ярды: " + amount);
                System.out.println("Метры: " + amount * 0.9144);
                System.out.println("Мили: " + amount / 1760);
                System.out.println("Футы: " + amount * 3);
            }
            else if (unit == 4) {
                System.out.println("Результат:");
                System.out.println("Футы: " + amount);
                System.out.println("Метры: " + amount * 0.3048);
                System.out.println("Мили: " + amount / 5280);
                System.out.println("Ярды: " + amount * 0.333333);
            }else {
                System.out.println("Неверный выбор единицы измерения!");
            }
    }
}
}
