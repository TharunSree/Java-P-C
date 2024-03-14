# Array Insertion

This Java program is designed to create an array, allow the user to input elements into the array, and then insert a new element at a specified position. The program uses the `ArrayList` class from the `java.util` package to create a dynamic array and the Scanner class to take input from the user.

## Code Overview
```Java
import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.printf("Enter total Elements to enter in array: ");
        int n = in.nextInt();

        System.out.println("Enter Elements: ");
        for(int i = 0; i < n; i++) {
            System.out.printf("Enter Element %d: ",i+1);
            arr.add(in.nextInt());
        }

        System.out.println("Current Array: "+ arr);

        System.out.printf("Enter Position to Insert: ");
        int pos = in.nextInt();

        System.out.printf("Enter Element: ");
        arr.add(pos-1, in.nextInt());

        System.out.println("New Array: " + arr);
    }
}
```
{collapsible="true"}


## Import Statements

```java
import java.util.ArrayList;
import java.util.Scanner;
```

These lines import two classes from the `java.util` package. `ArrayList` is a resizable array, which can grow or shrink dynamically. `Scanner` is a class that provides methods for reading input of various types from various sources, in this case, from the standard input stream (keyboard).

## Main Method

```Java
public static void main(String[] args)
```
This is the entry point of any Java program. The JVM starts executing the program by calling the `main` method. The `public` keyword means that the method is accessible anywhere. `static` means it belongs to the Array class and not to any instance of the class. The `void` keyword means it doesn’t return any value.

## Creating Scanner Object

```Java
Scanner in = new Scanner(System.in);
```

Here, we’re creating an instance of the `Scanner` class. This instance `in` will be used to read the input provided by the user. `System.in` is passed as an argument to the `Scanner` constructor to tell it to read from the standard input stream (keyboard).

## Creating ArrayList

```Java
ArrayList<Integer> arr = new ArrayList<>();
```

We’re creating an `ArrayList` named `arr` that will store the integers input by the user. `ArrayList` is a part of the Java Collection Framework and extends the `AbstractList` class. It implements the `List` interface.

## Reading User Input
```Java
System.out.printf("Enter total Elements to enter in array: ");
int n = in.nextInt();

System.out.println("Enter Elements: ");
for(int i = 0; i < n; i++) {
    System.out.printf("Enter Element %d: ",i+1);
    arr.add(in.nextInt());
}
```

The program prompts the user to enter the total number of elements they want to add to the array. It then enters a loop, prompting the user to enter each element one by one. These elements are added to the `ArrayList` using the `add` method.

## Displaying the ArrayList

```Java
System.out.println("Current Array: "+ arr);
```

The program then prints the current elements of the `ArrayList`.

## Inserting an Element at a Specific Position

```Java
System.out.printf("Enter Position to Insert: ");
int pos = in.nextInt();

System.out.printf("Enter Element: ");
arr.add(pos-1, in.nextInt());
```

The program asks the user for the position at which they want to insert a new element, and then the value of the element. The `add` method is used again, but this time with two parameters: the position and the value. Note that the position is `pos-1` because `ArrayList` indices start at 0.

## Displaying the Updated ArrayList

```Java
System.out.println("New Array: " + arr);
```

Finally, the program prints the updated `ArrayList`.

## Conclusion

This program is a simple demonstration of how to manipulate an `ArrayList` in Java. It covers some basic concepts such as taking user input, using a loop, and working with `ArrayLists`. Understanding this program will provide a solid foundation for working with arrays and user input in Java. Happy coding!

> **Tips**
>
> - Remember that 'ArrayList' indices start at 0, so when inserting an element at a specific position, use 'pos-1'.
>
{style="tip"}

> **Warnings**
> 
> - Always ensure that the position entered for insertion is within the valid range (1 to array size + 1). Entering a position outside this range will result in an 'IndexOutOfBoundsException'.
>
{style="warning"}

> **Note**
> 
> - This program does not handle invalid inputs. If the user enters a non-integer when prompted for an integer, the program will throw an 'InputMismatchException'. Always validate user input in real-world applications.
>
{style="note"}