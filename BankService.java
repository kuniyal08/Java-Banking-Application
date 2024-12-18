import java.util.Scanner;

class Account {
    private String accountHolderName;
    private String address;
    private Long aadharNumber;
    private String panNumber;
    private int upiPin;
    private double balance;
    private long phoneNumber;

    public Account(String accountHolderName, String address, long aadharNumber, String panNumber, int upiPin, double balance, long phoneNumber) {
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
        this.upiPin = upiPin;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String updateAccountHolderName) {
        this.accountHolderName = updateAccountHolderName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String updateAddress) {
        this.address = updateAddress;
    }

    public long getAadharNumber() {
        return aadharNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public int getUpiPin() {
        return upiPin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double updateBalance) {
        this.balance = updateBalance;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long updatePhoneNumber) {
        this.phoneNumber = updatePhoneNumber;
    }
}

public class BankService {

    public static void createAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Holder Name:");
        String accName = sc.nextLine();
        System.out.println("Enter Address:");
        String address = sc.nextLine();
        System.out.println("Enter Aadhar Number:");
        long aadharNumber = sc.nextLong();
        sc.nextLine(); // consume newline

        System.out.println("Enter PAN Number:");
        String pan = sc.nextLine();

        System.out.println("Enter UPI PIN:");
        int upiPin = sc.nextInt();

        System.out.println("Enter Deposit Balance:");
        double balance = sc.nextDouble();

        System.out.println("Enter Phone Number:");
        long phoneNumber = sc.nextLong();

        Account account = new Account(accName, address, aadharNumber, pan, upiPin, balance, phoneNumber);
        System.out.println("Account created successfully!");
    }

    public static void existingAccount() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Withdraw Amount");
        System.out.println("4. Update Account");
        System.out.println("5. Logout");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("** Welcome to LakshiBank **");
            System.out.println("1. Create Account");
            System.out.println("2. Existing Account");
            System.out.println("Enter an option:");
            int option = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (option) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    existingAccount();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}







