public class Dog {
    private String name;
    private int age;
    public Dog(int age, String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int Age(){
        return age*7;
    }
    public String toString(){
        return ("The name of dog - "+name+".\nThe age in human ages: "+Age());
    }
}