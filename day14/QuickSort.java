public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 434, 34, 75, 4};
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        if (start > end) {
            return;
        }
        int base = arr[i];

        while (start != end) {
            while (true) {
                if (end <= start || arr[end] < base) {
                    break;
                }
                end--;
            }
            while (true) {
                if (end <= start || arr[start] > base) {
                    break;
                }
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        quickSort(arr, i, start - 1);
        quickSort(arr, end + 1, j);
    }
}
