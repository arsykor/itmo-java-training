package org.Lab7;

public class Client2 {
    String name;
    String surname;
    String bankName;

    public Client2(String name, String surname, String bankName) {
        this.name = name;
        this.surname = surname;
        this.bankName = bankName;
    }

    public String toString() {
        return "The client is: " + name + " " + surname + ", he is serviced by a " + bankName + " bank.";
    }
}
