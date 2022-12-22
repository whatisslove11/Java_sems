package Exercise1;

public class MVCPatternDemo {
    public static void main(String [] args){
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("whatisslove");
        System.out.println("\nОбновление сведений. Данные выглядят так:");
        controller.updateView();
    }
    private static Student retriveStudentFromDatabase(){
        Student Student = new Student();
        Student.setName("Vladislav");
        Student.setRollNo("abcd");
        return Student;
    }
}
