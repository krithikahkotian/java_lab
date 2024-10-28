import java.util.Scanner;

class Account {
    String name;
    int acc_no;
    String acc_type;
    float balance;

    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.println("Enter the name:");
        name = sc.next();
        System.out.println("Enter the Account number:");
        acc_no = sc.nextInt();
        System.out.println("Enter the Account Type (Saving/Current):");
        acc_type = sc.next();
        System.out.println("Enter the initial balance:");
        balance = sc.nextFloat();
    }

    void acceptDeposit(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    void withdraw() {
        System.out.println("Enter the amount to Withdraw:");
        float wdr = sc.nextFloat();
        if (wdr > balance) {
            System.out.println("Insufficient balance! Can't withdraw.");
        } else {
            balance -= wdr;
            System.out.println("Withdrawn: " + wdr);
        }
    }

    void display() {
        System.out.println("Account Details");
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Account Type: " + acc_type);
        System.out.println("Balance: " + balance);
    }
}

class Saving extends Account {
    void compoundInterest(int rate, int num, int time) {
        float com_int = balance * (float) Math.pow(1 + (rate*0.01 / (float) num), num * time);
        System.out.println("Compound Interest: " + com_int);
        balance += com_int;
    }
}

class Current extends Account {
    private static final float MIN_BALANCE = 500;

    void withdraw() {
        System.out.println("Enter the amount to Withdraw:");
        float wdr = sc.nextFloat();
        if (balance - wdr < MIN_BALANCE) {
            System.out.println("Minimum balance crossed! Can't withdraw.");
        } else {
            balance -= wdr;
            System.out.println("Withdrawn: " + wdr);
        }
    }

    void display() {
        super.display();
        if (balance < MIN_BALANCE) {
            System.out.println("Minimum balance crossed!");
            balance -= 50; 
        }
        System.out.println("Balance: " + balance);
    }
}

class Bank {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Choose account type (1: Saving, 2: Current): ");
        int accType = sc.nextInt();
        if (accType == 1) {
            account = new Saving();
        } else if (accType == 2) {
            account = new Current();
        } else {
            System.out.println("Invalid account type selected. Exiting...");
            return;
        }

        account.read();

        while (true) {
            System.out.println("----Menu----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Compute interest for Saving Account");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    float deposit = sc.nextFloat();
                    account.acceptDeposit(deposit);
                    break;
                case 2:
                    account.withdraw();
                    break;
                case 3:
                    if (account instanceof Saving) {
                        System.out.print("Enter rate, times compounded, and time: ");
                        int rate = sc.nextInt();
                        int num = sc.nextInt();
                        int time = sc.nextInt();
                        ((Saving) account).compoundInterest(rate, num, time);
                    } else {
                        System.out.println("Not a saving account.");
                    }
                    break;
                case 4:
                    account.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
