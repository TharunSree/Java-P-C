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