//Bank Account Section

//Current Account...
class CurrentAccount
{
    String  name;
    String address, contact, openingDate, nID;
    private double balance;

    void printInfo(String name, String address, String contact, String openingDate, String nID)
    {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Contact : " + contact);
        System.out.println("Opening date : " + openingDate);
        System.out.println("NID : " + nID);
    }

    //using getter as balance attribute has been privatized
    public double getBalance()
    {
        return balance;
    }

    //sing setter as balance attribute has been privatized
    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    //setting opening balance
    void initialBalance(int n)
    {
        balance = n;
        System.out.println("Initial balance is : " + balance);
    }

    //deposit methode
   void deposit(double deposit)
    {
        balance += deposit;
        System.out.println("after depositing : " + deposit + ", balance : " + balance);
    }

    //withdraw methode
    void withdraw(double withdraw, double minimumBalance)
    {
        if(balance < minimumBalance)
            System.out.println("withdraw not possible due to lack of money");
        else
        {
            balance -= withdraw;
            System.out.println("withdrawing : " + withdraw);
        }
    }

}

//Saving Account...
class SavingsAccount extends CurrentAccount
{
    double balance =  getBalance();   //using getter - getBalance() to get balance.

    void withdraw(double withdraw)
    {
        if(balance < 1000)
            System.out.println("withdraw not possible due to lack of money");
        else
        {
            balance -= withdraw;
            System.out.println("withdrawing : " + withdraw);
        }
    }
}

//Business Account...
class BusinessAccount extends SavingsAccount
 {
    void withdraw(double withdraw)
    {
        double balance = getBalance();
        if(balance < 2000)
            System.out.println("withdraw not possible due to lack of money");
        else
        {
            balance -= withdraw;
            System.out.println("withdrawing : " + withdraw);
        }
    }

}


//Visa Card Service Section..

//Debit Card...
class DebitCard extends BusinessAccount  //associating with Business Account
{
    double balance = getBalance();  //using business account's balance here

    double identifierNumber;
    String cardHolderName;
    String validFrom;
    String validTo;
    double CVN;

    void moneyInCard()
    {
        System.out.println("debit card has : " + balance);
    }
}


//Credit Card...
class CreditCard extends DebitCard
{
    double max, runningAmount;

    void setMaximumCreditAmount(double maxAmount) //set by the bank
    {
        max = maxAmount;
    }

    void setRunningCreditAmount(double runAmount)  //taken loan
    {
        runningAmount = runAmount;
    }
}


public class BANK
{
    public static void main(String[] args)
    {
        System.out.println("inside Current Account...");
        CurrentAccount CA = new CurrentAccount();

        CA.printInfo("Abdur Rahman","Narail, Bangladesh","0163*19*303","18/02/2021","01072001-AR7");
        CA.initialBalance(450);  //using made-up numbers
        CA.deposit(50);   //using made-up numbers
        CA.withdraw(20,500);   //using made-up numbers
        System.out.println(CA.getBalance());

        System.out.println();

        System.out.println("inside Saving Account...");
        SavingsAccount SA = new SavingsAccount();

        CA.printInfo("Cristiano Ronaldo","Madeira, Portugal","05021985-CR7","18/02/2021","05021985-CR7");
        SA.initialBalance(900);   //using made-up numbers
        SA.deposit(50);      //using made-up numbers
        SA.withdraw(20,1000);     //using made-up numbers
        SA.getBalance();

        System.out.println();

        System.out.println("inside Business Account...");
        BusinessAccount BA = new BusinessAccount();

        CA.printInfo("Marcelo Aveiro","Brazil","12**198*-M12","18/02/2021","12**198*-M12");
        BA.initialBalance(5000);    //using made-up numbers
        BA.deposit(50);       //using made-up numbers
        BA.withdraw(20,5000);      //using made-up numbers
        BA.getBalance();




        DebitCard dCard = new CreditCard();
        dCard.moneyInCard();
    }
}
