package Exercise1_2_3;

public class Animal {
    private String name, kind;
    Animal(){
        name = "Thomas Shelby";
        kind = "british";
    }

    @Override
    public String toString() {
        return "This animal is: " + kind + ". His name: " + name;
    }
}
