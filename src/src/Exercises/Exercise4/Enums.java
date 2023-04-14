package Exercises.Exercise4;

public class Enums {
    public static void main(String[] args) {

        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;
        if (day == DaysOfTheWeek.THURSDAY) {
            System.out.println("It's almost Friday...");
        }

        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()) {
            System.out.println(myDay);
        }

        // if the levelOfDeliciousness was not declared FINAL, then we could change the level here as follows:
        // Cereals.REESES_PUFS.levelOfDeliciousness = 107;
        System.out.println(Cereals.REESES_PUFS.levelOfDeliciousness + " " + Cereals.REESES_PUFS.price);
    }
}
