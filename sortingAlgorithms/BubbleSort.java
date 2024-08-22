package sortingAlgorithms;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {5, 3, 1, 8, 4, 6, 9, 7, 2};

        for (int i : array) {
            System.out.print(i);
        }
        bubbleSort(array);
        System.out.println("\nAfter sorting");
        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

}
