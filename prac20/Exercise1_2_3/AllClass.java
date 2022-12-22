package Exercise1_2_3;

import java.io.Serializable;

public class AllClass<T extends Comparable, V extends Serializable, K extends Animal> {
    private T first;
    private V second;
    private K third;

    AllClass(T first, V second, K third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void printTypes(){
        System.out.println("First: " + first.getClass().getName() + ": " + first + "\n" +
                "Second: " + second.getClass().getName() + ": " + second + "\n" +
                "Third: " + third.getClass().getName() + ": " + third + "\n");
    }
    public static void main(String [] args){
        AllClass<String, Integer, Animal> ans = new AllClass<String, Integer, Animal>("I'am Vlad", 19, new Animal());
        ans.printTypes();
    }
}
