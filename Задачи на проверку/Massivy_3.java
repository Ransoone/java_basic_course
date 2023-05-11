
public class Massivy_3{

    public static void main(String[] args) {
         int[] array = {2, 5, 9, 9, 9};
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        int sum = array[0] + array[array.length / 2];
        System.out.println("Сумма первого и среднего элементов: " + sum);
    }
}
