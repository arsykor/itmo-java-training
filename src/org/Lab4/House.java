package org.Lab4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class House {
    private int nFloors;
    private int yBuilt;
    private String name;
    private Calendar fullyBuilt;

    public void setAll(int nFloors, int yBuilt, String name) {
        this.yBuilt = yBuilt;
        this.nFloors = nFloors;
        this.name = name;

        this.fullyBuilt = new GregorianCalendar(yBuilt, 1, 1);
    }

    @Override
    public String toString() {
        return "The " + name + " was built in " + fullyBuilt.getWeekYear() + " and has " + nFloors + " floors.";
    }

    public String houseAge(){
        int yearNow = java.time.ZonedDateTime.now().getYear();
        return yearNow > yBuilt ? String.valueOf(yearNow - yBuilt) : "Error";
    }
}

