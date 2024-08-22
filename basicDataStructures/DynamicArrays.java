package basicDataStructures;

public class DynamicArrays {

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArrays() {
        this.array = new Object[capacity];
    }

    public DynamicArrays(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if (size == capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if (size == capacity){
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;

    }

    public void delete(Object data) {
        // Iterate through the array to find the element to delete
        for (int i = 0; i < size; i++) {
            // Check if the current element matches the data to be deleted
            if (array[i] == data) {
                // Shift elements to the left to fill the gap created by the deleted element
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }
                // Set the last element to null since it's no longer needed
                array[size - 1] = null;
                size--;
                if (size <= (capacity / 3)) {
                    shrink();
                }
                // Exit the loop after deleting the first occurrence of the data
                break;
            }
        }
    }


    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public String toString() {
        String string = "";
        for (int i = 0; i < size; i++) {
            string += array[i] + ", ";
        }
        if (string.length() > 0) {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        if (string.length() == 0) {
            string = "[]";
        }
        return string;
    }

    public static void main(String[] args) {

        DynamicArrays dynamicArray = new DynamicArrays();
//        System.out.println("The capacity of the array is: " + dynamicArray.capacity);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        System.out.println(dynamicArray);

        System.out.println("Is the array empty? " + dynamicArray.isEmpty());
        System.out.println("The size of the array is: " + dynamicArray.size);
        System.out.println("The capacity of the array is: " + dynamicArray.capacity);

        dynamicArray.insert(1, "A-");
        System.out.println(dynamicArray);
        System.out.println("Now, the size of the array is: " + dynamicArray.size);

        dynamicArray.delete("A");
        System.out.println("After delete, the array is: " + dynamicArray);
        System.out.println("Now, the size of the array is: " + dynamicArray.size);

        System.out.println("The index of the element 'B' is: " + dynamicArray.search("B"));
        System.out.println("The index of the element 'X' is: " + dynamicArray.search("X"));

        //Grow
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");
        dynamicArray.add("H");
        dynamicArray.add("I");
        dynamicArray.add("J");
        System.out.println("After adding more elements, the array is: " + dynamicArray);
        System.out.println("After adding more elements, the capacity is: " + dynamicArray.capacity);
        dynamicArray.add("K");
        System.out.println("After surpassing the capacity, the array is: " + dynamicArray);
        System.out.println("After surpassing the capacity, the capacity is: " + dynamicArray.capacity);
        //Shrink
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("A-");
        dynamicArray.delete("D");
        dynamicArray.delete("E");
        dynamicArray.delete("F");
        System.out.println("After deleting more elements, the array is: " + dynamicArray);
        System.out.println("After deleting more elements, the capacity is: " + dynamicArray.capacity);

    }

}
