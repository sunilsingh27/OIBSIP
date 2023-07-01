import java.util.Scanner;

public class task3{
    public static void main(String[] args) {
        int my_balance = 8000;
        int withdraw_amt, deposit_amt;
        String password = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ATM profile password: ");
        String enteredPassword = sc.nextLine();

        if (!enteredPassword.equals(password)) {
            System.out.println("Incorrect password. Exiting...");
            System.exit(0);
        }
        while (true) {
            System.out.println("Automated ATM Machine");
            System.out.println("Choose 1 for Withdraw Amount");
            System.out.println("Choose 2 for Deposit Amount");
            System.out.println("Choose 3 for Check Account Balance");
            System.out.println("Choose 4 for Money Transfer");
            System.out.println("Choose 5 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn: ");
                    withdraw_amt = sc.nextInt();
                    if (my_balance >= withdraw_amt) {
                        my_balance = my_balance - withdraw_amt;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter money to be deposited: ");
                    deposit_amt = sc.nextInt();
                    my_balance = my_balance + deposit_amt;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    System.out.println("Total Amount: " + my_balance);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Balance: " + my_balance);
                    System.out.println("");
                    break;

                case 4:
                    System.out.print("Enter the amount to transfer: ");
                    int transferAmount = sc.nextInt();
                    if (my_balance >= transferAmount) {
                        System.out.print("Enter the recipient  account number: ");

                        int recipientAccount = sc.nextInt();
                        my_balance = my_balance - transferAmount;
                        System.out.println("Transfer successful ");
                    } else {
                        System.out.println("Insufficient Balance for Transfer");
                    }
                    System.out.println("");
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
                    System.out.println("");
            }
        }
    }
}



