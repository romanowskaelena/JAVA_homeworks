import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int a;
        int b;


        System.out.println("введите число а: ");
        a = number.nextInt();
        System.out.println("введите число b: ");
        b = number.nextInt();



        System.out.println("результат сложения = " + addMethod(a,b));
        System.out.println("результат вычитания = " + diffMethod(a,b));

//         result3 = a * b;
         System.out.println("результат деления  = " + multMethod(a,b));

//        result4 = a / b;
        System.out.println("результат умножения = " + divMethod(a,b));

    }
}
