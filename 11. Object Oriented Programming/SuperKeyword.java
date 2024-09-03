class Animal {
    String color;
    Animal () {
        System.out.println("Animal constructor is called...");
    }
}

class Horse extends Animal {
    Horse () {
        super.color = "Brown";
        System.out.println("Horse constructor is called...");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.color);
    }
}
