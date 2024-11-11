package CIE;

import java.util.Scanner;

public class Internals extends Student {
    protected int marks[] = new int[5];  
    public void inputCIEmarks() {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter 5 Subject CIE marks: ");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt(); 
        }
       
    }

        public void displayCIEmarks() {
        System.out.println("CIE Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}
