    import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prices {

    public static ArrayList<String> findRubEurUsd(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String value = scan.nextLine();
        ArrayList<String> ans = findRubEurUsd(value);
        System.out.println(ans);
    }
}
