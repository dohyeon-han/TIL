package sort;

public class InsertionSort {
    public static void insertion(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            int target = arr[i];
            for (int j = i-1; j >= 0; j--) {
                if(target < arr[j]){
                    arr[j+1] = arr[j];
                }
                else{
                    arr[j+1] = target;
                    break;
                }
            }
        }
    }
}
