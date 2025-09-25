import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        // TODO: Implement the bank account menu
        // 1. Create a double variable for balance
        // 2. Create a while loop for the menu
        // 3. Display the menu options
        // 4. Use Scanner to read user input
        // 5. Use switch statement to handle menu choices
        // 6. Implement add money, withdraw money, check balance, and exit functionality
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        boolean Continue = true;
        int user = 0;
        double temp = 0;
        while (Continue){
            System.out.println("---Bank Account Menu---");
            System.out.println("1. Add Money\n2. Withdraw Money\n3. Check Balance\n4. Exit");
            System.out.println("Enter your choice:  ");
            user = sc.nextInt();
            switch(user){
                case 1:
                    System.out.println("Enter amount to add:  ");
                    temp = sc.nextDouble();
                    if (temp < 0){
                        System.out.println("Negative is not allowed");
                        break;
                    }
                    balance += temp;
                    System.out.println("Your new balance is:  " + balance);
                    break;
                case 2:
                    System.out.println("Enter amount to Subtract:  ");
                    temp = sc.nextDouble();
                    if (temp < 0 || balance-temp < 0){
                        System.out.println("Negative is not allowed");
                        break;
                    }
                    balance -= temp;
                    System.out.println("Your new balance is:  " + balance);
                    break;
                case 3:
                    System.out.println("Your balance is:  " + balance);
                    break;
                case 4:
                    System.out.println("Bye bye");
                    Continue = false;
                    break;
                default:
                    System.out.println("I dont know that");
                    break;
            }
        }
    }
}