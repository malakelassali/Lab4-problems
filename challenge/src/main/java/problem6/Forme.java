package problem6;

import student.Major;

public abstract class Forme {
    public abstract double getSurface();
}


class Square extends Forme {
    private double side;
    public Square(double side) {
        this.side= side;
    }

    @Override
    public double getSurface() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square (side " + side + " cm): area = " + Math.round(1000.0 * getSurface()) / 1000.0 + "cm²";
    }
}

class Circle extends Forme {
    private double radius;
    public Circle(double radius) {
        this.radius= radius;
    }

    @Override
    public double getSurface() {
        return radius * radius * 3.14159265;
    }

    @Override
    public String toString() {
        return "Circle (radius " + radius + " cm): area = " + Math.round(1000.0 * getSurface()) / 1000.0 + "cm²";
    }
}