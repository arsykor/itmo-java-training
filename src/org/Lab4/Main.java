package org.Lab4;

public class Main {
    public static void main(String[] args) {
        /* Exercise 1 */
        String st = "Изучение Java - это просто!";
        Study study = new Study(st);

        System.out.println(study.printCourse());

        /* Exercise 2 */
        Demo demo = new Demo();
        demo.setColor("Blue");
        demo.setName("Sky");
        demo.setWeight(100500);

        Demo car = new Demo("red", 1500);
        car.setName("Alpha Romeo");

        System.out.println(demo.toString());
        System.out.println(car.toString());

        /* Exercise 3 */
        House house1 = new House();
        house1.setAll(5, 1950, "Stalinka");
        System.out.println(house1.toString());
        System.out.println(house1.houseAge());

        House house2 = new House();
        house2.setAll(100, 2050, "Skyscraper");
        System.out.println(house2.toString());
        System.out.println(house2.houseAge());

        /* Exercise 4 */
        Tree tree = new Tree();

        Tree tree2 = new Tree(300, "Mahagon");
        System.out.println(tree2.toString());

        Tree tree3 = new Tree(500, "Oak", true);
        System.out.println(tree3.toString());
    }
}
