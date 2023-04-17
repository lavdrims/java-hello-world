package Exercises.Exercise9;

public class Comparisons {
    public static void main(String[] args) {
        // when using primitive types (e.g., int, float, long, ...) java represents the variable as the actual value
        // while when using non-primitive (e.g., string) java references the memory location that has that object
        // therefore when comparing primitives we use "==", otherwise use ".equals()"

        int int1 = 2;
        int int2 = 2;
        if (int1 == int2) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }

        String string1 = new String("hello");
        String string2 = new String("hello");
        if (string1.equals(string2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // in this case "==" works since we do not create an object but point to the litterals
        String string3 = "hello";
        String string4 = "hello";
        if (string3 == string4) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // if we have the class Dog(), and we create two objects of the same class, ".equals()" will not work unless we implement
        // that method explicitly in the class dog
    }
}
