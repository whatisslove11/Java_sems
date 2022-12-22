import java.util.Scanner;

public class StrangeStr {
    public static boolean isStrangeStr(String s){
        return s.equals("abcdefghijklmnopqrstuv18340");
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String value = scan.next();
        if (isStrangeStr(value))
            System.out.print("Строка действительно является данной");
        else
            System.out.print("Строка не является данной");
    }
}
