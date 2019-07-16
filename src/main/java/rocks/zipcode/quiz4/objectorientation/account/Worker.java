package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public interface Worker {

    BankAccount getBankAccount();
    void setBankAccount(BankAccount bankAccount);

    void increaseHoursWorked(Double numberOfHoursWorkedSoFar);

    Double getHoursWorked();

    Double getHourlyWage();
}
