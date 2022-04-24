package sort;

public class SelectionSort {
    public static void sort(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }
            if (i == idx)
                continue;
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
    }
}
