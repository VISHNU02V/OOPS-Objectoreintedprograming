import java.io.*;

abstract class Shape {
    abstract void numberOfSides();                                  // abstract class declaration
}

class Rectangle extends Shape {
    void numberOfSides() {
        System.out.println("The rectangle has 4 sides !!!");        // class rectangle declaration
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("The triangle has 3 sides !!!");         // class triangle declaration
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.printf("The hexagon has 6 sides !!!");           // class hexagon declaration
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("/////////// D E T A I L S ///////////");
        Triangle t = new Triangle();                                
        t.numberOfSides();
        Rectangle r = new Rectangle();
        r.numberOfSides();
        Hexagon h = new Hexagon();
        h.numberOfSides();
    }
}
