# Garbage Collection

The `Garbage` class is a simple Java program that demonstrates the use of the Java Runtime class and the garbage collector. It prints the total memory, the free memory before and after the garbage collector runs.

## Code Overview

```Java
public class Garbage {
    public static void main(String[] args) {
        Runtime rn = Runtime.getRuntime();
        System.out.printf("\nTotal Memory: %d",rn.totalMemory());
        System.out.printf("\nFree Memory Befor Garbage Collector: %d",rn.freeMemory());
        
        rn.gc();
        
        System.out.printf("\nFree Memory after Garbage Collector: %d", rn.freeMemory());
    }
}
```
{collapsible="true"}

## Class Definition

```Java
public class Garbage
```

This is the main class that contains the `main` method.

## Method Definitions

```Java
public static void main(String[] args)
```

This is the main method which is the entry point for any Java program. The Java Virtual Machine (JVM) calls the main method when the program starts.

## Creating an Instance of the Runtime Class

```Java
Runtime rn = Runtime.getRuntime();
```

This line creates an instance of the Runtime class. This class provides methods to interface with the Java runtime environment.

## Printing the Total Memory and Free Memory before Running Garbage Collector

```Java
System.out.printf("\nTotal Memory: %d",rn.totalMemory());
```

This line prints the total amount of memory currently available for current and future objects, measured in bytes.

```Java
System.out.printf("\nFree Memory Before Garbage Collector: %d",rn.freeMemory());
```

This line prints the amount of free memory in the Java Virtual Machine, measured in bytes, before the garbage collector has run.

## Running the Garbage Collector 

```Java
rn.gc();
```

This line invokes the Java garbage collector. The garbage collector is a program which runs on the Java Virtual Machine which gets rid of objects which are not being used by a Java application anymore. It is a form of automatic memory management.

## Printing the Free Memory After Running Garbage Collector

```Java
System.out.printf("\nFree Memory After Garbage Collector: %d", rn.freeMemory());
```

This line prints the amount of free memory in the Java Virtual Machine, measured in bytes, after the garbage collector has run.

## Conclusion

The `Garbage` class is a simple demonstration of the Java garbage collector in action. It shows how the garbage collector can free up memory in the Java Virtual Machine.
