import java.util.Scanner;
public class TestBool {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int years = scan.nextInt();
        int Number_of_Pages = scan.nextInt();
        Book book = new Book(years,name,Number_of_Pages);
        book.infoBook();
    }
}