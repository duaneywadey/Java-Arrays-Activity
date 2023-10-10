public class ArrayUpdateExample {

    public static void updateArrayElement(int[] array, int index, int newValue) {
        // Check if the index is valid
        if (index >= 0 && index < array.length) {
            // Update the element at the given index
            array[index] = newValue;
        } else {
            System.out.println("Invalid index!");
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array:");
        printArray(numbers);

        // Update the element at index 2
        int indexToUpdate = 2;
        int newValue = 10;
        updateArrayElement(numbers, indexToUpdate, newValue);

        // Print the updated array
        System.out.println("Updated Array:");
        printArray(numbers);
    }
}



