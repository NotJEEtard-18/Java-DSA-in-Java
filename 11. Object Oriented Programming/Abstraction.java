abstract class Animal {
    String color;
    void eat() {
        System.out.println("Animal eats");
    }
    abstract void walk();

    Animal() {
        System.out.println("Animal constructor callled...");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called..");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("Walks on 4 legs.");
    }
}

class Mustang extends Horse {
    Mustang() {
       System.out.println("Mustang constructor called...");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("Walks on 2 legs.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        Mustang myHorse = new Mustang();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        // Animal a = new Animal(); //gives an error as we can't create an object of the abstract class.
    }
}
