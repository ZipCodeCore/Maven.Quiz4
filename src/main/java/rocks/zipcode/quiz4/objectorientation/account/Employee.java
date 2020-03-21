package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{
   private Double hourlyWage;
   private Double hoursWorked;
   private BankAccount account;

    public Employee() {
        hourlyWage = 35.0;
        hoursWorked = 0.0;
        account = new BankAccount();
    }

    public Employee(BankAccount bankAccount) {
        hourlyWage = 35.0;
        hoursWorked = 0.0;
        account = bankAccount;
    }

    public BankAccount getBankAccount() {
        return account;
    }

    public void setBankAccount(BankAccount bankAccount) {
        account = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        account.setBalance(account.getBalance()+amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {

    }

    @Override
    public Double getBalance() {
        return account.getBalance();
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
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return hourlyWage*hoursWorked;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();

        // and employee is a `Worker`
        Worker workerEmployee = employee;

        // and employee is a `Transactable`
        Transactable transactableEmployee = employee;

        // and `BankAccount` is `Transactable`
        Transactable bankAccount = employee.getBankAccount();
        System.out.println(bankAccount.getBalance());
    }
}
