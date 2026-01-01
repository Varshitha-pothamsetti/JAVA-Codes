class BankAccount { 
    int balanceAmount; BankAccount() { } 
    BankAccount(int intialBalance) { 
        balanceAmount = intialBalance; 
    } 
    void printBankBalance() {
         System.out.println("Your Current Bank Balance is: " + balanceAmount);
         }
         }
          class Exam3 { public static void main(String[] args)
             {
                 BankAccount account1 = new BankAccount(500); 
                 account1.printBankBalance();
                  BankAccount account2 = new BankAccount(100000);
                   account2.printBankBalance(); 
     } 
}