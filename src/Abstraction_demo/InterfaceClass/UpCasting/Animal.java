package Abstraction_demo.InterfaceClass.UpCasting;

public class Animal {
    public void eat() {
        System.out.println("Generic Animal Eating Generically");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse(); // Animal ref, but a Horse object – upcasting
        Horse h = new Horse();
        h.eat(); // Runs what? b.eat(); // Runs what?

        // What is the result?
        Horse c = (Horse) b;  // Downcasting Explicitly
        c.buck();
    }
}

class Horse extends Animal {
    public void eat() {
        System.out.println("Horse eating hay, oats, " + "and horse treats");
    }

    public void buck() {
        System.out.println("This is buck");
    }
}

