
import java.util.ArrayList;
import java.util.Scanner;


/**
 * StudentFunction
 */
public class StudentFunction {
    ArrayList<Student> students = new ArrayList<Student>();
    Scanner scan = new Scanner(System.in);

    public void addStudent(){

        // Getting Name as Input
        System.out.print("\nEnter Your Name:\t");
        String name=scan.nextLine().trim();

        // Getting PRN Number as Input
        System.out.print("\nEnter Your PRN No.\t");
        String prnNo=scan.nextLine().trim();

        // Getting Date Of Birth as Input
        System.out.print("\nEnter Your D.O.B\t");
        String dateOfBirth=scan.nextLine().trim();

        // Getting Marks Obtained as Input
        System.out.print("\nEnter Your Marks\t");
        Integer marksObtained=Integer.parseInt(scan.next());

        // Creating Object of Student Class with above values
        Student sObj=new Student(name,prnNo,dateOfBirth,marksObtained);

        // Adding Newly Created Student Object to Array List
        students.add(sObj);

        // Print Success Message After Adding Data
        System.out.println("\nData Added Succesfully !!! ");
    }


    public void displayStudents(){
        for(Student student: students){
            System.out.println(student.getPrn());
            System.out.println(student.getName());
            System.out.println(student.getDob());
            System.out.println(student.getMarks());
        }



    }

    public void searchByPrn() {

        System.out.println("Enter PRN to search:");
        String searchPrn = scan.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.getPrn().equals(searchPrn)) {
                System.out.println("Student Found:");
                System.out.println("Name: " + student.getName());
                System.out.println("PRN: " + student.getPrn());
                System.out.println("DOB: " + student.getDob());
                System.out.println("Marks: " + student.getMarks());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student with PRN " + searchPrn + " not found.");
        }

    }

    public void searchByName() {

        System.out.println("Enter PRN to search:");
        String searchPrn = scan.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.getName().equals(searchPrn)) {
                System.out.println("Student Found:");
                System.out.println("Name: " + student.getName());
                System.out.println("PRN: " + student.getPrn());
                System.out.println("DOB: " + student.getDob());
                System.out.println("Marks: " + student.getMarks());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student with PRN " + searchPrn + " not found.");
        }

    }






}