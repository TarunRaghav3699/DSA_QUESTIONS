public class SelectionSorting {
    public static void main(String[] args) {
        int minInd;
        int temp;
        int arr[] = { 1, 6, 3, 5, 9, 2, 4, 8, 7, 0 };
        for (int i = 0; i < (arr.length - 1); i++) {
            minInd = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minInd]) {
                    minInd = j;
                }
            }
            temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
