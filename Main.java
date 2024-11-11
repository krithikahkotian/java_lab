import SEE.Externals;

public class Main {
    public static void main(String[] args) {
        Externals ex = new Externals();
        
        // Input student details
        ex.inputStudentDetails();
        
        // Input CIE marks
        ex.inputCIEmarks();
        
        // Input SEE marks
        ex.inputSEEmarks();
        
        // Calculate final marks
        ex.calculateFinalMarks();
        
        // Display all details
        ex.displayFinalMarks();
    }
}
