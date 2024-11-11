package CIE;

import java.util.Scanner;

public class Student {
    protected String usn = new String(); 
    protected String name = new String();
    protected int sem;                    

       public void inputStudentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the USN: ");
        usn = sc.next();  // Read the USN
        System.out.println("Enter the Name: ");
        name = sc.next();  // Read the Name
        System.out.println("Enter the Sem: ");
        sem = sc.nextInt();  // Read the Semester (as an integer)

         }

       public void displayStudentDetails() {
        System.out.println("----STUDENT DETAILS----");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Sem: " + sem);
    }
}
