package searchingAlgorithms;

public class BinarySearch {

    public static void main(String[] args) {

        int array[] = new int[1000000];
        int target = 777777;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

//        int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if (index < 0) {
            System.out.println("Value not found in the array");
        } else {
            System.out.println("Value found at index: " + index);
        }

    }

    private static int binarySearch(int[] array, int target) {

            int left = 0;
            int right = array.length - 1;

            while (left <= right) {
                int middle = (left + right) / 2;

                System.out.println("Middle: " + middle);

                if (array[middle] == target) {
                    return middle;
                } else if (array[middle] < target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }

            return -1;
    }

}
