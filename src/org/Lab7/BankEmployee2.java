package org.Lab7;

public class BankEmployee2 implements IPerson {
    String name;
    String surname;
    String bankName;

    public BankEmployee2(String name, String surname, String bankName) {
        this.name = name;
        this.surname = surname;
        this.bankName = bankName;
    }

    public String toString() {
        return "Bank employee is: " + name + " " + surname + ", he works in " + bankName + " bank.";
    }
}
