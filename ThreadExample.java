class CollegeThread extends Thread {
    public void run() {
        try {
            for(int i=0;i<4;i++ ){
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); // Pause for 10 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("CollegeThread interrupted");
        }
    }
}

class DepartmentThread extends Thread {
    public void run() {
        try {
            for(int i=0;i<4;i++){
                System.out.println("CSE");
                Thread.sleep(2000); // Pause for 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("DepartmentThread interrupted");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        CollegeThread collegeThread = new CollegeThread();
        System.out.println("Name: Krithika Kotian\nUSN: 1BM23CS159");
        DepartmentThread departmentThread = new DepartmentThread();

        collegeThread.start();
        departmentThread.start();
    }
}
TH
