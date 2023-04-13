package Exercises.Exercise2;

public class Exercise2 {
    public static void main(String[] args) {

        // static void methods can be used without creating firstly the Cat object.
        Cat.dingDong();

        // new Cat: here calls the default noArgs constructor to create a Cat object, since we did not declare a constructor for this class.
        Cat myCat = new Cat();
        myCat.name = "Fred";
        myCat.age = 5;

        Cat anotherCat = new Cat();
        anotherCat.name = "Stella";
        anotherCat.age = 3;

        System.out.println(myCat.name + " is " + myCat.age);
        // non-static void methods must be called after creating the object.
        myCat.meow();

        System.out.println(anotherCat.name + " is " + anotherCat.age);
        myCat.meow();
    }
}
