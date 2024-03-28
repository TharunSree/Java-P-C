# Method Overloading in Java

Method overloading is a concept in Java where multiple methods can have the same name but with different parameters. This allows developers to create more intuitive and flexible code by providing multiple ways to call a method depending on the parameters passed.

## Introduction

Method overloading is a feature in Java that allows a class to have more than one method with the same name, but with different parameters. It is a way of implementing polymorphism in Java. The compiler differentiates these methods by their method signatures (i.e., the number of parameters and types of parameters).

## Code Overview

```Java
import java.util.Scanner;

public class Geofig {
    
    float calculateArea(float side) {
        return side * side;
    }

    float calculateArea(float length, float width) {
        return length * width;
    }

    double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static void main(String[] args) {
        Geofig gf = new Geofig();
        Scanner scan = new Scanner(System.in);
        System.out.println("\nSquare\n");
        System.out.print("Enter side of square: ");
        float side = scan.nextFloat();
        System.out.println("Area of square: " + gf.calculateArea(side));
        System.out.println("\nRectangle\n");
        System.out.print("Enter Length: ");
        float length = scan.nextFloat();
        System.out.print("Enter Breadth: ");
        float width = scan.nextFloat();
        System.out.println("Area of rectangle: " + gf.calculateArea(length, width));
        System.out.println("\nTriangle\n");
        System.out.print("Enter base: ");
        double base = scan.nextDouble();
        System.out.print("Enter height: ");
        double height = scan.nextDouble();
        System.out.println("Area of triangle: " + gf.calculateArea(base, height));
        System.out.println("\nCircle\n");
        System.out.print("Enter radius of circle: ");
        double radius = scan.nextDouble();
        System.out.println("Area of circle: " + gf.calculateArea(radius));
    }
}

```
{collapsible="true"}

The Java program above demonstrates method overloading. It calculates the area of different geometric figures using overloaded methods.

## Import Statement

```Java
import java.util.Scanner;
```

This line imports the `Scanner` class from the `java.util` package. The `Scanner` class is used to read input from various sources; in this case, it reads input from the standard input stream (keyboard).

## Method Overloading

In the `Geofig` class, there are multiple `calculateArea` methods, each with a different set of parameters. This is an example of method overloading. The `calculateArea` method is overloaded to accept different types and numbers of parameters, allowing it to calculate the area of squares, rectangles, triangles, and circles.

The `calculateArea` method is overloaded four times to calculate the area of four different geometric figures:

1. Square: The method takes one float parameter (the side of the square) and returns the area of the square.
```Java
float calculateArea(float side) {
    return side * side;
} 
```

2. Rectangle: The method takes two float parameters (the length and width of the rectangle) and returns the area of the rectangle.

```Java
float calculateArea(float length, float width) {
    return length * width;
}
```

3. Triangle: The method takes two double parameters (the base and height of the triangle) and returns the area of the triangle.

```Java
double calculateArea(double base, double height) {
    return 0.5 * base * height;
}
```

4. Circle: The method takes one double parameter (the radius of the circle) and returns the area of the circle.

```Java
double calculateArea(double radius) {
    return Math.PI * radius * radius;
}
```

> **Note**
> 
> The `calculateArea` method is a perfect example of method overloading. Even though the method name is the same, the parameters are different for each geometric figure.
> 
{style="note"}

## Reading User Input and Calculating Areas

The `main` method prompts the user to enter the dimensions of the geometric figures and then calls the appropriate `calculateArea` method to calculate and print the area.

> **Tip**
> 
> _Always validate user input in real-world applications to handle unexpected inputs and avoid runtime errors. This program does not handle invalid inputs. If the user enters a negative number or zero when prompted for a dimension, the program will still calculate the area, which may not be meaningful._
> 
{style="tip"}

> **Warning**
> 
> Avoid overloading methods with the same number and types of parameters but with different return types. This can lead to ambiguity and compilation errors.
> 
{style="warning"}