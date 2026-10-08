public class ArrayReverseRec {
    static void swap(int a[], int i, int n) {
        int temp = a[i];
        a[i] = a[n];
        a[n] = temp;
    }

    public static void arrayRev(int i, int n, int a[]) {
        if (i >= n) {
            return;
        }
        swap(a, i, n);
        arrayRev(i + 1, n - 1, a);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        arrayRev(0, n - 1, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
