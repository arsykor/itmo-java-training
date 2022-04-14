package org.Lab7;

public class Client extends Person {

    String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "The client is: " + name + " " + surname + ", he is serviced by a " + bankName + " bank.";
    }
}
