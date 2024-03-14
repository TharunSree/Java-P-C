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