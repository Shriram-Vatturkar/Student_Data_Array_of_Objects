import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentFunction student = new StudentFunction();
        int nextInt = -1;

        while (true) {
            System.out.println("Welcome to the student dashboard");
            System.out.println("1. Add a Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Exit");

            Scanner in = new Scanner(System.in);

            do{
                try {
                    System.out.print("Choose option [1..4]: ");
                    nextInt = Integer.parseInt(in.nextLine());
                } catch (NumberFormatException nfe) {
                    System.out.println("Error! Invalid integer value entered.");
                }
            } while(!in.hasNextLine() || nextInt < 1 || nextInt > 4);


            switch (nextInt) {
                case 1:
                    student.addStudent();
                    break;
                case 2:
                    student.displayStudents();
                    break;
                case 3:
                    student.searchByPrn();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
