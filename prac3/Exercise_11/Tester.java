package Exercise_11;

import java.util.Scanner;

public class Tester {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int choice;
        double count;
        System.out.println("Введите измерение температуры: 1 - K, 2 - F, 3 - C");
        choice = scan.nextInt();
        System.out.print("Введите температуру: ");
        count = scan.nextDouble();
        Temperature temp = new Temperature(count, choice);
        temp.convert();
    }
}
