import java.util.Scanner;

public class ReverseanArray{

    // Recursive function to reverse the array
    static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // Swap elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recurse
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse the array using recursion
        reverse(arr, 0, n - 1);

        // Print reversed array
        System.out.println("Reversed Array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
