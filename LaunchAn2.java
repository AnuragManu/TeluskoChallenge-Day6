// Define the functional interface
@FunctionalInterface
interface Demo {
    void disp();
    // void add();
}

// Define the Animal class
class Animal {
    public void eat() {
        System.out.println("animal eat");
    }

    public void AnimalHuntsAndEat() {

    }
}

// Define the Tiger class as a subclass of Animal
class Tiger extends Animal {
    public void eat() {
        System.out.println("Tiger hunts and eat");
    }

    @Override
    public void AnimalHuntsAndEat() {

    }
}

// Main class
public class LaunchAn2 {
    public static void main(String args[]) {
        // Create an instance of the Demo interface using a lambda expression
        Demo d = () -> {
            System.out.println("Lambda");
        };

        // Call the disp() method using the Demo instance
        d.disp();
    }
}
