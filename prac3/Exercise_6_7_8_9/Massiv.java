package Exercise_6_7_8_9;

import java.util.ArrayList;

public class Massiv {
    public static void main(String [] args){
        ArrayList<Printable> arr = new ArrayList<>();
        arr.add(new Book("Inferno", "Dan Brown", "13/07/2013"));
        arr.add(new Book("Angels and Demons", "Dan Brown", "23/04/2000"));
        arr.add(new Magazine("Conmopolitan", 283, "11/11/1111"));
        for (Printable el: arr){
            el.print();
        }
    }
}
