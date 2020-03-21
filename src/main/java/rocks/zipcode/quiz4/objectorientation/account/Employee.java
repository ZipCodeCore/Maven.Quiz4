package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker{
    BankAccount bankAccount;
    Double hoursWorked;
    public Employee() {
        this.bankAccount=null;
        this.hoursWorked=0.0;
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount=bankAccount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount=bankAccount;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        hoursWorked+=numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return 20.0;
    }

    @Override
    public Double getMoneyEarned() {
        return hoursWorked*20.0;
    }
}
