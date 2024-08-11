public class MergeSort {

    public static void main(String[] args) {

        int[] array = {8, 7, 9, 2, 3, 6, 1, 5, 4};

        mergeSort(array);

        for (int i: array){
            System.out.print(i + " ");
        }

    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1) return;

        int mid = length / 2;

        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for (int i = 0; i < mid; i++){
            left[i] = array[i];
        }

        for (int i = mid; i < length; i++){
            right[i - mid] = array[i];
        }

        mergeSort(left);
        mergeSort(right);
        auxiliarMergeSort(array, left, right);

    }

    private static void auxiliarMergeSort(int[] array, int[] left, int[] right){

        int leftLength = left.length;
        int rightLength = right.length;

        int i = 0, l = 0, r = 0;

        // Check the conditions to merge the arrays
        while (l < leftLength && r < rightLength){
            if (left[l] < right[r]){
                array[i] = left[l];
                l++;
            } else {
                array[i] = right[r];
                r++;
            }
            i++;
        }

        // Copy the remaining elements of left array
        while (l < leftLength){
            array[i] = left[l];
            l++;
            i++;
        }

        // Copy the remaining elements of right array
        while (r < rightLength){
            array[i] = right[r];
            r++;
            i++;
        }

    }

}
