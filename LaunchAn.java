// import statements
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// Define the main class
public class LaunchAn {
    public static void main(String args[]) {
        // Create an instance of Virat
        Virat v = new Virat();
        v.setInnings(255);
        v.setRuns(150000);

        // Get the class object
        Class c = v.getClass();

        // Get the annotation from the class object
        Annotation annotation = c.getAnnotation(CricketPlayer.class);

        // Cast the annotation to CricketPlayer
        CricketPlayer cp = (CricketPlayer) annotation;

        // Print the values from the annotation
        System.out.println("Age : " + cp.age());
        System.out.println("Country : " + cp.country());
    }
}

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
@interface CricketPlayer {
    int age() default 33;

    String country() default "Ind";
}

// Apply the annotation to the Virat class
@CricketPlayer
class Virat {
    int runs;

    public int getRuns() {
        return runs;
    }

    public int getInnings() {
        return innings;
    }

    int innings;

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }
}

// Apply the annotation to the Sachin class with custom values
@CricketPlayer(age = 35, country = "India")
class Sachin {
    int runs;

    public int getRuns() {
        return runs;
    }

    public int getInnings() {
        return innings;
    }

    int innings;

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }
}
