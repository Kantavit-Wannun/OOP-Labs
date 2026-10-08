package lab4.Q2;

import java.util.Scanner;

public class PSUStudentTest {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter age: ");
        int ageP1 = scan.nextInt();
        System.out.print("Enter gpa: ");
        double gpaP1 = scan.nextDouble();
        System.out.println();
        System.out.print("Enter age: ");
        int ageP2 = scan.nextInt();
        System.out.print("Enter gpa: ");
        double gpaP2 = scan.nextDouble();
        try {
            PSUStudent p1 = new UndergradStudent(ageP1, gpaP1);
            System.out.println(p1.getAge());
            System.out.println(p1.revealGrade());
            p1.setCurrentYear(4);
            System.out.println(p1.revealGrade());
            System.out.println();

            PSUStudent p2 = new GradStudent(ageP2, gpaP2);
            System.out.println(p2.getAge());
            System.out.println(p2.revealGrade());
            p2.setPassThesis(true);
            System.out.println(p2.revealGrade());
        } catch (IllegalArgumentException e){
            System.out.println("ERROR!");
        }
        
    }
}
