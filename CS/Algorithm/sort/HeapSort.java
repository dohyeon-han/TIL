package sort;

public class HeapSort {
    public static void sort(int[] arr, int size) {
        // bottom up construction
        for (int i = (size - 1) / 2; i >= 0; i--) {
            heapify(arr, i, size);
        }
        for (int i = size - 1; i >= 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }

    // down heap
    private static void heapify(int[] arr, int par, int size) {
        while (par * 2 + 1 < size) {
            int left = par * 2 + 1;
            int right = par * 2 + 2;
            int mx = par;
            if (size > left && arr[mx] < arr[left]) {
                mx = left;
            }
            if (size > right && arr[mx] < arr[right]) {
                mx = right;
            }
            if (par != mx) {
                swap(arr, par, mx);
            } else break;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
