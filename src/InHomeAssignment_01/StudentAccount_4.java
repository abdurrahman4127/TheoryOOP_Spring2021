//package InHomeAssignment;
//
//abstract class BankAccount
//{
//    public String id;
//    public double balance;
//
//    public BankAccount(String id)
//    {
//        this.id = id;
//    }
//    public abstract double calculateInterest();
//}
//
//interface Taxable
//{
//    void taxCharged(double amount);
//}
//
//class StudentAccount extends BankAccount implements Taxable
//{
//
//    public StudentAccount(String id)  //to super-class (BankAccount) constructor
//    {
//        super(id);
//    }
//
//    //overriding abstract and interface classes' methods
//    public double calculateInterest()
//    {
//        return 0;
//    }
//
//    public void taxCharged(double amount)
//    {
//
//    }
//}