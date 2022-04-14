package org.Lab7;

public class Main {
    public static void main(String[] args) {

        /* Exercise 1 */

        Client client = new Client("Arseny", "Korolkov", "Tinkoff");
        BankEmployee bankEmployee = new BankEmployee("Ivan", "Ivanov", "Tinkoff");

        Person[] people = new Person[2];

        people[0] = client;
        people[1] = bankEmployee;

        for (int i = 0; i < 2; i++) {
            System.out.println(people[i].toString());
        }

        //Same with interfaces

        /* Exercise 3 */

        Truck truck = new Truck(1500, "Volvo", 'b', 50.5f, 6, 5000);
        truck.newWheels(8);

        /* Exercise 4 */

        Child child = new Child();
        child.number = 100;

        child.writeNumberFromParent();

        /* Exercise 5 */

        Child2 child2 = new Child2();
        child2.askUserAge();

        System.out.println("User's age is: " + child2.userAge);
    }
}
