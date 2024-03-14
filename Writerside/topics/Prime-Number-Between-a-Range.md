# Prime Number Between a Range

This Java program is designed to find all prime numbers within a given range. The user is prompted to enter the start and end of the range, and the program outputs all prime numbers within that range.

## Code Breakdown

```Java
import java.util.Scanner;

public class Prime {
    public static void findPrimesBetween(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Start of Range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the End of Range: ");
        int end = scanner.nextInt();
        findPrimesBetween(start, end);
        scanner.close();
    }
}
```
{collapsible="true"}

## Key Components

- `findPrimesBetween(int start, int end)`: This method takes two integers as arguments, representing the start and end of the range, respectively. It iterates over each number in the range and checks if it’s a prime number using the `isPrime(int number)` method. If the number is prime, it’s printed to the console.
- `isPrime(int number)`: This method checks if a given number is prime. It returns `false` if the number is less than or equal to 1. For numbers greater than 1, it checks if the number is divisible by any number up to its square root. If it finds a divisor, it returns `false`; otherwise, it returns `true`.
- `main(String[] args)`: This is the entry point of the program. It creates a `Scanner` object to read the user’s input, prompts the user to enter the start and end of the range, and calls the `findPrimesBetween(int start, int end)` method with the user’s input. Finally, it closes the `Scanner` object.

> **Tips**
> 
> - Remember that a prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself. The method `isPrime(int number)` uses this definition to check if a number is prime.
> - The `findPrimesBetween(int start, int end)` method uses a for loop to iterate over each number in the given range. It’s a good practice to use loops when you need to perform an operation multiple times.
> 
{style="tip"}

> **Warnings**
> - Be careful with the range you enter. If the range is too large, the program may take a long time to find all the prime numbers.
> - Always close the `Scanner` object after you’re done using it to prevent resource leaks.
> 
{style="warning"}

> **Note**
> - The `System.out.printf("%d ", i);` statement in the `findPrimesBetween(int start, int end)` method prints each prime number followed by a space. If you want each number to be printed on a new line, you can replace it with `System.out.println(i);`.
> 
{style="note"}