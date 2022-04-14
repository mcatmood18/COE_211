import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        DecimalFormat fmt= new DecimalFormat("0.##");
        // Initialize array of integers
        int[] grades = new int[5];

        // for loop to get user input & store in array
        for (int i = 0; i < grades.length ; i++) {
            System.out.println("Input the grade of assignment " + (i+1));
            grades[i] = scan.nextInt();
        }

        System.out.println("Input the number of attended labs");
        int attendance= scan.nextInt();

        System.out.println("Input the midterm grade");
        int midterm= scan.nextInt();

        // for loop to iterate over the array & perform calculations
        int calculateGrades= 0;
        for (int i = 0; i < grades.length; i++) {
            calculateGrades+= grades[i];
        }
        double assignmentsGrade =  ((calculateGrades/ 5.0) * 0.3);
        double attendanceGrade = (((attendance * 100) * 0.05) / 7.0);
        double midtermGrade = (midterm * 0.3);

        // display output to user
        System.out.println("Assignments (30%): "+fmt.format(assignmentsGrade));
        System.out.println("Attendance (5%): "+fmt.format(attendanceGrade));
        System.out.println("Midterm (30%): "+fmt.format(midtermGrade));
    }
}

