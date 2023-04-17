package Exercises.Exercise10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArryList {
    public static void main(String[] args) {
        // arrays have the shortcoming that you have to always specify its size when defining it,
        // but they can be of any type, primitive or non-primitive
        String[] friendsArray = new String[4];
        String[] friendsArray2 = {"John", "Chris", "Ben", "Luke"};
        System.out.println(friendsArray2[2]);
        System.out.println(friendsArray2.length);
        // you cannot add or remove elements to arrays since they are of fixed size
        friendsArray2[0] = "Carl";
        System.out.println(friendsArray2[0]);
        System.out.println(friendsArray2);

        // with arrayList you don't have to specify it size in prior,
        // but you cannot use primitive data types (but supports wrapper types of primitives), just objects
        // wrappers: int - Integer, boolean - Boolean, long - Long, ...
        ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Chris", "Ben", "Luke"));
        System.out.println(friendsArrayList2.get(2));
        System.out.println(friendsArrayList2.size());
        friendsArrayList2.add("Mitch");
        System.out.println(friendsArrayList2.get(4));
        friendsArrayList2.set(0, "Carl");
        System.out.println(friendsArrayList2.get(0));
        friendsArrayList2.remove("Luke");
        System.out.println(friendsArrayList2);

        // At the end, Java ArrayLists are a wrapper around Java Arrays and that makes them much useful/convenient and better to use.
    }
}
