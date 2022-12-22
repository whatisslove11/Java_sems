package Exercise2;

import Exercise2.Employee;
import Exercise2.EmployeeController;
import Exercise2.EmployeeView;

public class MVCPatternDemo {
    public static void main(String [] args){
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("whatisslove");
        controller.setEmployeeWages(1);
        System.out.println("\nбновление сведений. Данные выглядят так:");
        controller.updateView();
    }
    private static Employee retriveEmployeeFromDatabase(){
        Employee Employee = new Employee();
        Employee.setName("Vladislav");
        Employee.setWages(450000000);
        return Employee;
    }
}
