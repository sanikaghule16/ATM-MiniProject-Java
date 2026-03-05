import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        int correctPin = 1234;
        int enteredPin;

        // PIN check using while loop
        while (true) {
            System.out.print("Enter PIN: ");
            enteredPin = sc.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("PIN Verified Successfully!\n");
                break;
            } else {
                System.out.println("Wrong PIN! Try Again.\n");
            }
        }

        int choice;

        do {
            System.out.println("===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose Option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance:" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Amount Deposited Successfully!");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Amount Withdrawn Successfully!");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank You for Using ATM.");
                    break;

                default:
                    System.out.println("Invalid Option!");
            }

            System.out.println();

        } while (choice != 4);

        sc.close();
    }
}
