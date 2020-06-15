package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
    Double hourlyWage;
    Double hoursWorked;
    Double balance;
    Double bankAccountBalance;
    
    BankAccount bankAccount = new BankAccount();
    
    public Employee() {
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.balance = 0.0;
        this.bankAccountBalance = 0.0;
    
    }
    
    public Employee(BankAccount bankAccount) {
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.balance = 15.0;
        this.bankAccountBalance = balance;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public void increaseHoursWorked(Double numberOfHours){
        hoursWorked = hoursWorked + numberOfHours;
    }
    public Double getHoursWorked(){return hoursWorked;}
    public Double getHourlyWage(){return hourlyWage;}
    public Double getMoneyEarned(){return hoursWorked * hourlyWage;}
    public void deposit(Double amountToIncreaseBy){
        bankAccountBalance = bankAccountBalance + amountToIncreaseBy;
    }
    public void withdrawal(Double amountToDecreaseBy){
        bankAccountBalance = bankAccountBalance + amountToDecreaseBy;
    }
    public Double getBalance(){return bankAccountBalance;}
}
