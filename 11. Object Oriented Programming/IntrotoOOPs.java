public class IntrotoOOPs {
    public static void main(String args[]) {
        Pen p1 = new Pen();     //created a pen object called p1.
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow");
        // p1.color = "Yellow";     //same thing as of previous line.
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Animal {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
