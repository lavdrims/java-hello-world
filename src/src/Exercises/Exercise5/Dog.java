package Exercises.Exercise5;

public class Dog extends Animal {
    private int walkDistancePreference;

    public void bark() {
        System.out.println("woof woof");
    }

    // overriding the eat method from parent class.
    public void eat() {
        System.out.println("num num num" + " " + Final.PI);
    }

    public  int getWalkDistancePreference() {
        return walkDistancePreference;
    }
    public  void setWalkDistancePreference(int walkDistancePreference) {
        this.walkDistancePreference = walkDistancePreference;
    }
}
