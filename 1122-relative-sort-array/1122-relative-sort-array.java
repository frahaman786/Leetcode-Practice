class Solution {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int pos = 0;

        // Place elements according to arr2
        for (int i = 0; i < arr2.length; i++) {

            for (int j = pos; j < arr1.length; j++) {

                if (arr1[j] == arr2[i]) {

                    // Swap arr1[pos] and arr1[j]
                    int temp = arr1[pos];
                    arr1[pos] = arr1[j];
                    arr1[j] = temp;

                    pos++;
                }
            }
        }

        // Sort remaining elements
        mergeSort(arr1, pos, arr1.length - 1);

        return arr1;
    }

    // Merge Sort
    private void mergeSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    // Merge two sorted parts
    private void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Remaining left part
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Remaining right part
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy back
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }
}