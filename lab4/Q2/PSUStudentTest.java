package lab4.Q2;

import java.util.Scanner;

public class PSUStudentTest {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter age: ");
        int age = scan.nextInt();
        System.out.print("Enter gpa: ");
        double gpa = scan.nextDouble();
        try {
            PSUStudent p1 = new UndergradStudent(age, gpa);
            System.out.println(p1.getAge());
            System.out.println(p1.revealGrade());
            p1.setCurrentYear(4);
            System.out.println(p1.revealGrade());
            PSUStudent p2 = new GradStudent(age, gpa);
            System.out.println(p2.getAge());
            System.out.println(p2.revealGrade());
            p2.setPassThesis(true);
            System.out.println(p2.revealGrade());
        } catch (IllegalArgumentException e){
            System.out.println("ERROR!");
        }
        
    }
}
