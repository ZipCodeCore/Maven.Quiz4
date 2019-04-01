package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable  {


    BankAccount bankAccount;


    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }



    Double expectedHourlyWage=35.0 ;
    Double expectedHoursWorked=0.0;
    Double expectedBalance=15.0 ;
    Double expectedBankAccountBalance=0.0;

    public Employee() {
    this.bankAccount= new BankAccount();

    }



    public BankAccount getBankAccount()

    {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {

        this.bankAccount=bankAccount;

    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {

      this.expectedHoursWorked= numberOfHours;

      expectedHoursWorked=numberOfHours;

    }

    @Override
    public Double getHoursWorked() {
        return expectedHoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return expectedHourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return expectedHourlyWage*expectedHoursWorked;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {

         bankAccount.deposit(amountToIncreaseBy);

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.withdrawal(amountToDecreaseBy);

    }

    @Override
    public Double getBalance() {


        return expectedBalance;
    }
}
