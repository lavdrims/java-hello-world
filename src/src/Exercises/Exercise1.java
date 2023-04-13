package Exercises;

public class Exercise1 {
    public static void main(String[] args) {
        printMyName("Lavdrim");

        for (int i = 0; i <= 5; i++) {
            String returnedName = returnMyName("Lavdrim", i);
            System.out.printf(returnedName);
        }
    }

    // void: the method does not return anything.
    // instead of void, use the type that you need to return and return a value of that type at the end of the method.
    private static void printMyName(String name) {
        System.out.println("My name is " + name);
    }

    private static String returnMyName(String name, int number) {
        if (number == 2) {
            return ("\n" + "My name is not John.");
        } else if (number != 4 || number == 3) {
            return ("\n" + "My name is not Mark.");
        } else {
            return ("\n" + "My name is " + name + ".");
        }
    }
}
