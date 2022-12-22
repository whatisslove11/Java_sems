package Exercise2;

public class Student {

    private String firstName,secondName, specialty, group;
    private int course, GPA;

    public Student(String firstName, int GPA){
        this.firstName = firstName;
        this.GPA = GPA;
        secondName = "Poletaev";
        specialty = "MAMAAAAAA";
        course = 2;
        group = "IKBO-04-21";
    }
    public Student(String firstName, String secondName, String specialty, int course, String group, int GPA) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student " + firstName + " " + secondName + ":\n"
                + "    specialty: " + specialty + "\n"
                + "    Course: " + course + "\n"
                + "    Group: " + group + "\n"
                + "    GPA: " + GPA + "\n";
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int newGPA) {
        GPA = newGPA;
    }

    public String getName(){
        return this.firstName;
    }
}
