package sort;

public class QuickSort {
    public static void sort(int[] arr, int size) {
        sort(arr, 0, size - 1);
    }

    private static void sort(int[] arr, int left, int right) {
        if (left >= right) return;

        int pivot = arr[left];
        int i = left, j = right;
        while (i < j) {
            while (i < j && pivot < arr[j]) // 오른쪽은 피벗 초과의 수
                j--;
            while (i < j && arr[i] <= pivot) // 왼쪽은 피벗 이하의 수
                i++;

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        arr[left] = arr[i];
        arr[i] = pivot;

        sort(arr, left, i - 1);
        sort(arr, i + 1, right);
    }
}
