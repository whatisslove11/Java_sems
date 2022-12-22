package Exercise2;

import java.util.Objects;
import java.util.Scanner;

public class QuickSort {
    private static SortingStudentsByGPA comparator = new SortingStudentsByGPA();
    public static void quickSort(Student[] array, int low, int high){
        if(array == null || array.length == 0)
            return;
        if(high <= low)
            return;
        Student middle = array[(low + high)/2];
        int i = low;
        int j = high;
        while (i <= j){
            while (comparator.compare(middle, array[i]) < 0)
                i++;
            while (comparator.compare(middle, array[j]) > 0)
                j--;
            if (i <= j) {
                Student tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        else if (high > i)
            quickSort(array, i, high);
    }

    public static Student[] setArray(){
        System.out.print("Enter count of students: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Student [] iDNumber = new Student[size];
        String name_1, name_2, speciality, group;
        int GPA, course;
        for (int i = 0; i < size; ++i){
            System.out.print("Enter name: ");
            name_1 = scan.next();
            System.out.print("Enter second name: ");
            name_2 = scan.next();
            System.out.print("Enter speciality: ");
            speciality = scan.next();
            System.out.print("Enter course: ");
            course = scan.nextInt();
            System.out.print("Enter group: ");
            group = scan.next();
            System.out.print("Enter GPA: ");
            GPA = scan.nextInt();
            iDNumber[i] = new Student(name_1, name_2, speciality, course, group, GPA);
        }
        return iDNumber;
    }

    public static Student findStudent(Student[] all, String name) throws StudentNotFoundExeption {
        for (Student el: all){
            if (Objects.equals(el.getName(), name))
                return el;
        }
        throw new StudentNotFoundExeption("Student? Where?");
    }

    public static void main(String []args) throws StudentNotFoundExeption {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter count of students: ");
        int size = scan.nextInt();
        Student [] iDNumber = new Student[size];
        for (int i = 0; i < size; ++i){
            System.out.println("Enter name: ");
            String name = scan.nextLine();
            if (Objects.equals(name, ""))
                try {
                    throw new EmptyStringExeption("Empty string");
                } catch (EmptyStringExeption e) {
                    System.out.println("Empty name. Try again");
                    i--;
                    continue;
                }
            System.out.println("Enter GPA: ");
            String GPAstr = scan.nextLine();
            try{
                int GPA = Integer.parseInt(GPAstr);
                iDNumber[i] = new Student(name, GPA);
            }
            catch(NumberFormatException ignored){
                System.out.println("Incorrect GPA. Try again");
                i--;
            }
        }
        quickSort(iDNumber, 0, iDNumber.length - 1);
        for (Student s : iDNumber)
            System.out.println(s);
        String name;
        while (true){
            System.out.print("Enter name for searching: ");
            name = scan.nextLine();
            if (Objects.equals(name, "")){
                try {
                    throw new EmptyStringExeption("Empty string");
                }
                catch (EmptyStringExeption e) {
                    System.out.println("Empty name. Try again");
                }
            }
            else break;
        }
        Student ans = findStudent(iDNumber, name);
        System.out.println(ans);
    }
}
