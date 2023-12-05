import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // declare local variables
        int[] arr = new int[20];
        int i, j, k, size;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Define the number of elements in an array: ");
        size = scanner.nextInt();

        System.out.println("Enter " + size + " elements of an array:");
        // use for loop to enter the elements one by one in an array
        for (i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // use nested for loop to find the duplicate elements in array
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                // use if statement to check duplicate element
                if (arr[i] == arr[j]) {
                    // delete the current position of the duplicate element
                    for (k = j; k < size - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    // decrease the size of array after removing duplicate element
                    size--;

                    // if the position of the elements is changes, don't increase the index j
                    j--;
                }
            }
        }

        /* display an array after deletion or removing of the duplicate elements */
        System.out.print("\nArray elements after deletion of the duplicate elements: ");
        // for loop to print the array
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }

        scanner.close();
    }
}
