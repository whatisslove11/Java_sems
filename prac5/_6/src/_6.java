import java.util.Scanner;

public class _6 {
    public static boolean func(int number, int i)
    {
        if (number == 1) return false;
        if (number == 2) return true;

        if (number % i == 0) return false;

        if(i <= Math.sqrt(number))
            return func(number, i + 1);
        else return true;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение числа: ");

        int num = scan.nextInt();

        System.out.print("Число является " + (func(num, 2) ? "простым" : "составным"));
    }

}
