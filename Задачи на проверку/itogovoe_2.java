import java.util.Scanner;

public class SimpleEquationSolver {
    public static void main(String[] args) {
        int b;
int c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String equation = scanner.nextLine();

        char[] chars = equation.toCharArray();
        int xIndex = equation.indexOf('x');
        int operatorIndex = equation.indexOf('+') != -1 ? equation.indexOf('+') : equation.indexOf('-');

        //System.out.println("xIndex = " + (xIndex) + "operatorIndex:"+ operatorIndex);
        switch (xIndex) {
            case 0:
                b = Integer.parseInt(Character.toString(chars[2]));
                c = Integer.parseInt(Character.toString(chars[4]));
                break;
            case 2:
                b = Integer.parseInt(Character.toString(chars[0]));
                c = Integer.parseInt(Character.toString(chars[4]));
                break;
            case 4:
                b = Integer.parseInt(Character.toString(chars[0]));
                c = Integer.parseInt(Character.toString(chars[2]));
                break;
            default:
                System.out.println("Символ x отсутствует в уравнении!");
                return;
        }
        if (chars[operatorIndex] == '+') {
            if(xIndex==4)
            {
               int result = c + b;
            System.out.println("x = " + (result)); 
            }
            else
            {
            int result = c - b;
            System.out.println("x = " + (result));
            }
        }
         else {
            if(xIndex==0)
            {
               int result = b+c;
            System.out.println("x = " + (result)); 
            }
            else
            {
            int result = b-c;
            System.out.println("x = " + (result));
            }
            
        }
    }
}