package SEE;

import CIE.Internals;
import java.util.Scanner;

public class Externals extends Internals {
    protected int smarks[] = new int[5];    // SEE marks
    protected int finalMarks[] = new int[5]; // Final marks (CIE + SEE)

        public Externals() {
        super();  
    }

    
    public void inputSEEmarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Subject SEE marks: ");
        for (int i = 0; i < 5; i++) {
            smarks[i] = sc.nextInt();  // Store each subject's SEE marks
        }
         
    }

        public void calculateFinalMarks() {
        for (int i = 0; i < 5; i++) {
            finalMarks[i] = smarks[i] + marks[i];  // Final marks = CIE marks + SEE marks
        }
    }

       public void displayFinalMarks() {
        displayStudentDetails(); 
        displayCIEmarks();        
        System.out.println("Final Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + finalMarks[i]);
        }
    }
}
