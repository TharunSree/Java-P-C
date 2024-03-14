# String Operations in Java

This Java program performs various operations on strings. It takes two strings as input from the user and performs operations such as concatenation, finding the length of the string, converting to uppercase, extracting a substring, and replacing characters.

## Code Overview

```Java
import java.util.Scanner;

public class StringOps {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String 1(Length more than 5): ");
        String s1 = scanner.nextLine();
        
        System.out.print("Enter a String 2: ");
        String s2 = scanner.nextLine();
        
        System.out.printf("String 1: %s\nString 2: %s \n",s1,s2);
        
        System.out.println("Concat Str 1 and 2: "+ s1.concat(" "+s2));
        
        System.out.println("Length of First String: "+ s1.length());
        System.out.println("Length of Second String: "+ s2.length());
        
        System.out.println("First Char of String 1: " + s1.charAt(0));
        
        System.out.println("Upper Case of String 1: " + s1.toUpperCase());
        
        System.out.println("Substring of String 1: " + s1.substring(1, 4));
        
        System.out.printf("Replacing 'a' with 'o' in %s: %s" ,s1,s1.replace('a', 'o'));
    }
}
```
{collapsible="true"}

## Import Statement

```Java
import java.util.Scanner;
```

This line imports the `Scanner` class from the `java.util` package. The `Scanner` class is used to read input from various sources; in this case, it reads input from the standard input stream (keyboard).

## Reading User Input

```Java
System.out.print("Enter a String 1(Length more than 5): ");
String s1 = scanner.nextLine();

System.out.print("Enter a String 2: ");
String s2 = scanner.nextLine();
```

The program prompts the user to enter two strings. These strings are read using the 'nextLine' method of the 'Scanner' class.

> **Note**
> 
> The 'nextLine' method reads the input until the end of the line. This means it can also read spaces.
> 
{style="note"}

## Concatenating the Strings

```Java
System.out.println("Concat Str 1 and 2: "+ s1.concat(" "+s2));
```

The program concatenates the two strings using the `concat` method of the `String` class. A space is added between the two strings for clarity.

## Finding Length of the strings

```Java
System.out.println("Length of First String: "+ s1.length());
System.out.println("Length of Second String: "+ s2.length());
```

The program uses the `length` method of the `String` class to find the length of the strings.

## Finding the First Character of String

```Java
System.out.println("First Char of String 1: " + s1.charAt(0));
```

The program uses the `charAt(0)` to get the first character of the string. `0` here is the index of the first character.

## Converting the String to UPPERCASE

```Java
System.out.println("Upper Case of String 1: " + s1.toUpperCase());
```

The program uses the `toUpperCase()` method of the `String` class. `toUpperCase()` converts every character of the string to uppercase.

## Extracting a Substring from the First String

```Java
System.out.println("Substring of String 1: " + s1.substring(1, 4));
```

The program extracts a substring from the first string using the `substring` method of the `String` class. The substring starts from index 1 and ends at index 3.

> **Warning**
>
> The `substring` method can throw an `IndexOutOfBoundsException` if the start or end argument is out of range.
>
{style="warning"}

## Replacing Characters in the First String

```Java
System.out.printf("Replacing 'a' with 'o' in %s: %s" ,s1,s1.replace('a', 'o'));
```

The program replaces all occurrences of ‘a’ with ‘o’ in the first string using the `replace` method of the `String` class.

> **Tip**
> 
> Always validate user input in real-world applications to handle unexpected inputs and avoid runtime errors. This program does not handle invalid inputs. If the user enters a string of length less than 5 when prompted for the first string, the `substring` method will throw an `IndexOutOfBoundsException`. Similarly, if the user enters an empty string when prompted for the first string, the `charAt` method will also throw an `IndexOutOfBoundsException`.
> 
{style="tip"}



