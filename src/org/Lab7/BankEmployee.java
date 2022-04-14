package org.Lab7;

public class BankEmployee extends Person {

    String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "Bank employee is: " + name + " " + surname + ", he works in " + bankName + " bank.";
    }
}
