public class BankAccount{
    private int accnum;
    private double balance;
    
    BankAccount(int accnum, double balance){
        this.accnum=accnum;
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("depposited amount:"+amount);


        }else{
            System.out.println("inalid amount input");

        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance=balance-amount;
            System.out.println("withdrawn amount is:"+ amount);
        }else{
            System.out.println("invalid amount");
        }
    }
    public double getbalance(){
        return balance;
    }
    public static void main(String[]args){
        BankAccount ba=new BankAccount(3456782,50000.00);
        ba.deposit(1500);
        ba.withdraw(2000);
        System.out.println(ba.getbalance());
    }
}