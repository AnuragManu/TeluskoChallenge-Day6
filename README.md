# Custom Annotation in Java

In this article, we will explore the concept of custom annotations and lambda expressions in Java. We will analyze a code example that demonstrates the usage of a custom annotation and showcases the power of custom Annotation. Let's dive in!

# Custom Annotation
Annotations are a powerful feature introduced in Java that allow us to add metadata and additional information to classes, methods, fields, and other program elements. Custom annotations enable us to define our own annotations with specific behaviors and attributes.

In the provided code, we have defined a custom annotation called **CricketPlayer**. Let's break down the key components of this custom annotation:

```
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@interface CricketPlayer {
    int age() default 33;
    String country() default "Ind";
}
```
## @Retention
The @Retention annotation specifies the retention policy of an annotation, which determines how long the annotation will be available. Java provides three retention policies:

- **RetentionPolicy.SOURCE**: Annotations with this retention policy are only available during compilation and are discarded by the compiler. They do not appear in the compiled bytecode or runtime environment.

- **RetentionPolicy.CLASS**: Annotations with this retention policy are stored in the compiled bytecode but are not accessible at runtime. They are typically used for documentation purposes or by tools that process bytecode.

- **RetentionPolicy.RUNTIME**: Annotations with this retention policy are retained at runtime and can be accessed programmatically using reflection. They are available during the execution of the program and can be used to influence the behavior of the program dynamically.

In the provided code, the CricketPlayer annotation uses `@Retention(RetentionPolicy.RUNTIME)` to ensure that the annotation is available at runtime and can be accessed using reflection.

## @Target
The @Target annotation specifies the program elements to which an annotation can be applied. Java provides a variety of element types that can be targeted:

- **ElementType.TYPE**: The annotation can be applied to classes, interfaces, and enums.
- **ElementType.FIELD**: The annotation can be applied to fields (including enum constants).
- **ElementType.METHOD**: The annotation can be applied to methods.
- **ElementType.PARAMETER**: The annotation can be applied to method parameters.
- **ElementType.CONSTRUCTOR**: The annotation can be applied to constructors.
- **ElementType.LOCAL_VARIABLE**: The annotation can be applied to local variables.
- **ElementType.ANNOTATION_TYPE**: The annotation can be applied to other annotations.
- **ElementType.PACKAGE**: The annotation can be applied to packages.

In the provided code, the CricketPlayer annotation uses `@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})` to specify that it can be applied to classes, fields, and methods.

# Code Example
The provided code demonstrates the usage of the `CricketPlayer` annotation. Let's analyze the code step by step:

```
public class LaunchAn {
    public static void main(String args[]) {
        Virat v = new Virat();
        v.setInnings(255);
        v.setRuns(150000);

        Class c = v.getClass();
        Annotation annotation = c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer) annotation;
        System.out.println("Age: " + cp.age());
        System.out.println("Country: " + cp.country());
    }
}
```
- We create an instance of the `Virat` class, which has the `CricketPlayer` annotation applied to it.
- We obtain the class object using the `getClass()` method.
- Using reflection, we retrieve the `CricketPlayer` annotation applied to the class using `getAnnotation(CricketPlayer.class)`.
- We cast the retrieved annotation to `CricketPlayer`.
- Finally, we access the values of the annotation attributes (`age` and `country`) and print them.

The output will display the age and country information of the cricket player Virat. Similarly, the code example also includes another class, `Sachin`, where we explicitly set the values of the annotation attributes.
# Functional Interface
The code begins with the declaration of a functional interface called   Demo. Let's break down the key components of this interface:

```
@FunctionalInterface
interface Demo {
    void disp();
    // void add();
}
```
- `@FunctionalInterface` annotation is used to indicate that the interface is a functional interface. A functional interface is an interface that has only one abstract method.
- The `Demo` interface declares a single abstract method disp(). This method does not take any arguments and does not return any value.

Functional interfaces are widely used in Java for implementing lambda expressions, which provide a concise way of expressing a single method interface implementation.

# Conclusion
Custom annotations in Java provide a flexible way to add metadata and behavior to program elements. They enable us to create annotations with specific attributes, allowing us to annotate classes, fields, and methods with custom information.

The `@Retention` annotation specifies the retention policy of an annotation, determining how long the annotation will be available, and the `@Target` annotation determines the program elements to which an annotation can be applied. These annotations provide control over how and where the custom annotation can be used.

Understanding custom annotations and lambda expressions is essential for developing more expressive and flexible Java code. They provide powerful tools for creating custom behaviors and simplifying the implementation of functional interfaces.

By leveraging custom annotations and lambda expressions, developers can enhance the readability, maintainability, and extensibility of their Java applications.
***
Author : Anurag Manu