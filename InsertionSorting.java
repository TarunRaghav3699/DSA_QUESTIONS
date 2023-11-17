public class InsertionSorting {
    public static void main(String[] args) {
        int temp;
        int arr[] = {1,4,6,8,0,3,2,5,9,7};
        for (int i = 0; i < (arr.length - 1); i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    i = j;
                }else if (arr[i] > arr[j]){ // in this, loop will stop at 8,0
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    // after this we have the new array which is {1,4,6,0,8,...}
                    // then it will loop again go to jth loop and check again 
                    // then we get new array which will be {1,4,0,6,...}
                    // then {1,0,4,...}
                    // then {0,1,...}
                }
            }
        }
        // Print the sorted array
        for (int value : arr) {
            System.out.print(value + " ");
        }
    } 
}
