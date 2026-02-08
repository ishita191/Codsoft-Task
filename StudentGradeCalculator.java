import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        for(int i = 1; i <= 5; i++) {

            System.out.print("Enter subject name: ");
            String subjectName = sc.nextLine();

            System.out.print("Enter marks of " + subjectName + ": ");
            int marks = sc.nextInt();
            sc.nextLine(); 

            total = total+ marks;
        }
        int percentage =  total / 5;

        String grade;

        if(percentage >= 90)
            grade = "A+";
        else if(percentage >= 80)
            grade = "A";
        else if(percentage >= 70)
            grade = "B";
        else if(percentage >= 60)
            grade = "C";
        else if(percentage >= 40)
            grade = "D";
        else
            grade = "Fail";

        System.out.println("Total Marks of a Student out of 500: = " + total);
        System.out.println("Percentage of a Student  = " + percentage+"%");
        System.out.println("Grade = " + grade);
    }
}
