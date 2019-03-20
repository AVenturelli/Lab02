public class SavingsAccount {
    static double annualInterestRate;
    protected double balance;

    public SavingsAccount(double annualInterestRate, double balance)
    {
        this.annualInterestRate = annualInterestRate;
        this.balance = balance;
    }

    public double calculateMonthlyInterest()
    {
        double a;
        a = (this.balance * this.annualInterestRate)/12;
        return a;
    }
    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
}
