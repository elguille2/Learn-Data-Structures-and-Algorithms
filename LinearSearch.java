public class LinearSearch {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int index = linearSearch(array, 10);

        if (index == -1) {
            System.out.println("Value not found in the array");
        } else {
            System.out.println("Value found at index: " + index);
        }

    }

    private static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;

    }

}
