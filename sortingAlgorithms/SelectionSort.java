package sortingAlgorithms;

public class SelectionSort {

    public static void main(String[] args) {

        int array[] = {8, 7, 9, 2, 3, 6, 1, 5, 4};

        selectionSort(array);

        for (int i: array){
            System.out.print(i + " ");
        }

    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++){
            int min = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

    }

}
