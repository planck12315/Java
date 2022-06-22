/* PRESET CODE BEGIN - NEVER TOUCH CODE BELOW */
/*
 * This class creates the program to test the banking classes.
 * It creates a new Bank, sets the Customer (with an initial balance),
 * and performs a series of transactions with the Account object.
 */
//import banking.*;
public class Main{
    public static void main(String[] args) {
      Customer customer;
      Account  account;
      // Create an account that can has a 500.00 balance.
      System.out.println("Creating the customer Jane Smith.");
      customer = new Customer("Jane", "Smith");
      System.out.println("Creating her account with a 500.00 balance.");
      customer.setAccount(new Account(500.00));
      account = customer.getAccount();
      // Perform some account transactions
      System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
      System.out.println("Deposit 22.50: " + account.deposit(22.50));
      System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
      System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
      // Print out the final account balance
      System.out.println("Customer [" + customer.getLastName()
                 + ", " + customer.getFirstName()
                 + "] has a balance of " + account.getBalance());
    }
  }
  /* PRESET CODE END - NEVER TOUCH CODE ABOVE */
  class Account {
      private double balance; // hold the current (or "running") balance of the bank account
      public Account(double init_balance) {
          balance = init_balance;
      }
      public double getBalance() {
          return balance;
      }
      public boolean deposit(double amt) {
          balance += amt;
          return true;
      }
      public boolean withdraw(double amt) {
          if (amt < balance) {
              balance -= amt;
              return true;
          } else {
              return false;
          }
      }
  }
  class Customer {
      private String firstName;
      private String lastName;
      private Account account;
      Customer(String f, String l) {
          firstName = f;
          lastName = l;
          account = new Account(0);
      }
      public String getFirstName() {
          return firstName;
      }
      public String getLastName() {
          return lastName;
      }
      public Account getAccount() {
          return account;
      }
      public void setAccount(Account acct) {
          account = acct;
      }
  }