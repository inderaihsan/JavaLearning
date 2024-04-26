import java.util.ArrayList;

/**Exercise:
Create a Java program to model a simple banking system. Implement two classes: BankAccount and BankCustomer.

BankAccount class should have the following attributes:
Account number (String)
Account holder name (String)
Balance (double)
Implement the following methods:
Constructor to initialize the account number, account holder name, and balance.
Getter and setter methods for each attribute.
Method to deposit funds into the account.
Method to withdraw funds from the account (ensure balance doesn't go negative).
BankCustomer class should have the following attributes:
-Customer ID (String)
-Customer name (String)
-List of bank accounts (ArrayList of BankAccount objects)
 */

class BankAccount{
    String accountNumber;
    String holderName;
    Double balance;

    public BankAccount(String accountNumber, String holderName, Double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void deposit(Double ammount){
        Double currentBalance = this.balance + ammount;
        setBalance(currentBalance);
    }

    public void withdrawal(Double ammount){
        if (this.balance > 0 ) {
            if (this.balance > ammount) {
                Double currentBalance;
                currentBalance = this.balance - ammount;
                setBalance(currentBalance);
            }
            else {
                System.out.println("Insufficient balance!");
            }

        }
        else {
            System.out.println("Insufficient balance!");
        }
    }

}

class BankCustomer{
    String customerID;
    String customerName;
    ArrayList<BankAccount> listOfBankAccount = new ArrayList<>();

    public BankCustomer(String customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public void registerBankAccount(BankAccount account){
        this.listOfBankAccount.add(account);
    }

    public ArrayList<BankAccount> getListOfBankAccount() {
        return this.listOfBankAccount;
    }

}
public class exercise {
    public static void main(String[] args) {
        BankAccount bpntGenius = new BankAccount("08291", "Arlan Grace",5000000.0);
        BankAccount iridnam = new BankAccount("08292", "Arlan Grace",5000000.0);
        BankAccount hokkien = new BankAccount("08293", "Arlan Grace",5000000.0);
        bpntGenius.deposit(90000.0);
        bpntGenius.withdrawal(7000000.0);
        System.out.println(bpntGenius.getBalance());
        /**registering the bank acount to bankCustomer */

        BankCustomer InderaIhsan = new BankCustomer("1818", "Indera Ihsan");
        InderaIhsan.registerBankAccount(bpntGenius);
        InderaIhsan.registerBankAccount(iridnam);
        InderaIhsan.registerBankAccount(hokkien);
        ArrayList<BankAccount>listOfBank = InderaIhsan.getListOfBankAccount();
        Double currentBalance =0.0;
        for (int i = 0; i <listOfBank.size() ; i++) {
            currentBalance = currentBalance + listOfBank.get(i).getBalance();
        }
        System.out.println(currentBalance);


    }

}
