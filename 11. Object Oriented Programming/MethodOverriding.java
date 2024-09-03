class Animal {
    public void eat() {
        System.out.println("Eats");
    }
}

class Deer extends Animal {
    public void eat() {
        System.out.println("Eats Grass");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}
