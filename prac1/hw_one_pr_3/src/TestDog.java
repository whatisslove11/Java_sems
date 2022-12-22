import java.util.Random;
public class TestDog {
    public static Dog arr(int i){
        Dog dog = new Dog(0, "");
        Random rand = new Random();
        int age = rand.nextInt(30);
        dog.setAge(age);
        dog.setName("Dog "+ i);
        return dog;
    }

    public static void main(String[] args) {
        Dog dog = new Dog(0, "");
        System.out.println(dog.toString());

        dog.setAge(10);
        dog.setName("Sharik");
        System.out.println(dog.toString());

        for (int i=0;i<3;i++){
            Dog dog1 = new Dog(0, "");
            dog1 = arr(i+1);
            System.out.println(dog1.toString());
        }
    }
}