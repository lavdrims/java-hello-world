package Exercises.Exercise4;

public enum Cereals {
    CAPTAIN_CRUNCH(50, 2.90),
    FROOT_OOPS(60, 3.25),
    REESES_PUFS(100, 4.30),
    COCOA_PUFS(75, 3.85);

    // declared as FINAL so that the level of deliciousness cannot be changed (assigned) afterwards.
    final int levelOfDeliciousness;
    final double price;
    Cereals (int levelOfDeliciousness, double price) {
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.price = price;
    }
}
