import java.util.Scanner;

public class BinarySearch {

    // Binary Search method
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid; // Target found
            }

            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                // If target is smaller, ignore right half
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }

    // Main method to test the binary search
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Taking array elements input
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Taking target element input
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Calling binary search
        int result = binarySearch(numbers, target);

        // Printing result
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }
}
