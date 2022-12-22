import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Numbers {

    public static boolean isPlus(String s){
        return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
    }

    public static void main(String [] args){
        System.out.println(isPlus("1 / 3 -5"));
        System.out.println(isPlus("1 + 3 -5"));
    }
}
