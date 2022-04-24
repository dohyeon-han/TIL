package sort;

public class MergeSort {
    private static int[] tmp;

    public static void sort(int[] arr, int size) {
        tmp = new int[size];
        sort(arr, 0, size - 1);
    }

    private static void sort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1, idx = left;

        while (i <= mid || j <= right) {
            if (j > right || (i <= mid && arr[i] < arr[j])) {
                tmp[idx++] = arr[i++];
            } else {
                tmp[idx++] = arr[j++];
            }
        }
        for (int k = left; k <= right; k++) {
            arr[k] = tmp[k];
        }
    }
}
