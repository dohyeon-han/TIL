package sort;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            boolean isSwap = false;
            for (int j = 0; j < size - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    isSwap = true;
                }
            }
            if (!isSwap) break; // 이미 정렬된 경우 O(n)으로 줄일 수 있다.
        }
    }
}
