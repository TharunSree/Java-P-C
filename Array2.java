import java.util.Scanner;

public class Array2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter total Elements to enter in array: ");
        int n = in.nextInt();
        int arr[] = new int[n + 1];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter Element %d: ", i + 1);
            arr[i] = in.nextInt();
        }
        System.out.print("Current Array: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.printf("\nEnter Position to Insert: ");
        int pos = in.nextInt();
        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        System.out.printf("Enter Element: ");
        arr[pos - 1] = in.nextInt();
        
        System.out.print("New Array: ");
        for (int i = 0; i < n + 1; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
