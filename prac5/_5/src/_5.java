import java.util.Scanner;

public class _5 {

    public static int func(int x){
        if(x==0)
            return 0;
        return (x%10+func(x/10));

    }

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scan.nextInt();
        System.out.print("Сумма цифр числа:" + func(num));

    }
}
