import java.util.Scanner;
import java.util.regex.Pattern;

public class Order {
    private static final Pattern innPatter = Pattern.compile("\\d{10}|\\d{12}");
    public static boolean isValidINN(String inn) {
        inn = inn.trim();
        return innPatter.matcher(inn).matches();
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scan.next();
        System.out.println("Enter INN: ");
        String inn = scan.next();
        try {
            boolean ans = isValidINN(inn);
            if (ans)
                System.out.println("The purchase was successful");
            else throw new ArithmeticException();

        }
        catch(ArithmeticException ignored){
            System.out.println("Incorrect INN");
        }
    }
}
