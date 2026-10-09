package problem7;

public abstract class Person {
    protected String name;
    public Person(String name) {
        this.name = name;
    }
    public abstract void display();
}

class Carpenter extends Person {
    public Carpenter(String name) {
        super(name);
    }
    @Override
    public void display() {
        System.out.println("I am " + name + " the Carpenter");
    }
}

class Plumber extends Person {
    public Plumber(String name) {
        super(name);
    }
    @Override
    public void display() {
        System.out.println("I am " + name + " the Plumber");
    }
}