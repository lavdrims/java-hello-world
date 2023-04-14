package Exercises.Exercise5;

public class Exercise5 {

    // declaring a public variable as a constant so that we can use also in other places.
    // another reason for using final - when we create constants.
    public static final double PI = 3.14159;
    // NAMING CONVENTION: variables use camelCase while constants capital letters and underscores. E.g., MY_CONST.

    public static void main(String[] args) {
        final Dog myDog;
        myDog = new Dog();
        myDog.eat();

        // if we did not make final the variable myDog, we would be able to instantiate it again below creating a new Dog object.
        // e.g.,: myDog = new Dog();
        // but final prevents the reinstantiation and we can work only with that dog.
    }
}
