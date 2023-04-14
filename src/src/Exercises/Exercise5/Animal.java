package Exercises.Exercise5;

public class Animal {
    // class can be made final. But in this case it will not be able to extend at all this class.
    // unless there is a very strong reason, usually classes are not made final.

    private String name;
    private String color;

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public  String getColor() {
        return color;
    }

    public  void setColor(String color) {
        this.color = color;
    }

    // if this method is made final, then it will not be able to override it in the child class.
    // makes sense only when you have a method which you want to prevent the child classes from overriding it.
    public void eat() {
        System.out.println("yum yum yum");
    }
}
