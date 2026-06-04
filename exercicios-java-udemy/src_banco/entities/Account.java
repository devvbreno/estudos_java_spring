package src_banco.entities;

public class Account {

        private int number;
        private String holder; 
        private double balance;
        private static final int tax = 5;

        public Account(int number, String holder) {
            this.number = number;
            this.holder = holder;
        }
        
        public Account(String number, String holder, double initialDeposit) {
            this.number = number;
            this.holder = holder;
            deposit(initialDeposit);;
        }

        public String getNumber() {
        return number;
        }

        public String getHolder() {
        return holder;
        }
        public void setHolder(String holder) {
        this.holder = holder;
        }
    
        public double getBalance() {
        return balance;
        }

    public void withdrawal (double amount) {
        this.balance -= (amount + tax);
    }

    public void deposit (double amount) {
        this.balance += amount;
    }
    public String toString(){
        return "Account " 
        + number
        + ", Holder: " 
        + holder
        + ", Balance: $"
        + balance;
    }
}