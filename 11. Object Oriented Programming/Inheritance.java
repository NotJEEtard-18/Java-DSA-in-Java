//Base Class
class Animal {
    String color;
    public void eat() {
        System.out.println("Eats");
    }

    public void breathe() {
        System.out.println("Breathes");
    }
}

class Mammals extends Animal {
    public void walk() {
        System.out.println("Walks");
    }
}

class Fish extends Animal {
    public void swim() {
        System.out.println("Swims");
    }
}

class Birds extends Animal {
    public void Fly() {
        System.out.println("Flies");
    }
}
// class Dog extends Mammals {
//     String breed;
// }

//Derived class
// class Fish extends Animal {
//     int fins;
//     public void swim() {
//         System.out.println("Swims in water");
//     }
// }

public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        // shark.swim();
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);
    }
}
