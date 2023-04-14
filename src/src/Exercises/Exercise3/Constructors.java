package Exercises.Exercise3;

public class Constructors {
    public static void main(String[] args) {

        // this class has a defined constructor and should be used always with the arguments defined in its construcor, name and age.
        // for this class we cannot use the default noArgs constructor (e.g., we cannot use: Dog myDog = new Dog())
        Dog myDog = new Dog("George", 12);
        System.out.println(myDog.name + " " + myDog.age);

        // we can create that noArgs constructor manually.
        // but in many cases, there are classes where we do not want constructor as for instance in Constants.
        // in this case we define an empty constructor but make it private instead of public.
        // Java in this case will not allow us to use the private constructor as in the line below
        // Constants myConstants = new Constants();

        System.out.println(Constants.NUMBER_OF_DAYS_IN_A_WEEK);
        System.out.println(Constants.NUMBER_OF_MONTHS_IN_A_YEAR);
        System.out.println(Constants.NAME_OF_FIRST_MONTH);
    }
}
