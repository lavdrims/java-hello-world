package Exercises.Exercise2;

public class Cat {
    // This class does not have a constructor. So, when calling this class, Java will use the default noArgs constructor.
    String name;
    int age;

    public void meow() {
        System.out.println("Meeoooww");
    }

    // static: means that we can use this method without creating the Cat object. See Exercise 2.
    public  static void dingDong(){
        System.out.println("Ding dong");
    }
}
