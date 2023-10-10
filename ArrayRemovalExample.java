public class ArrayRemovalExample {

    public static int[] removeArrayElement(int[] array, int index) {
        // Check if the index is valid
        if (index >= 0 && index < array.length) {
            // Create a new array with size one less than the original array
            int[] newArray = new int[array.length - 1];

            // Copy the elements from the original array to the new array
            for (int i = 0, j = 0; i < array.length; i++) {
                // Skip the element at the given index
                if (i == index) {
                    continue;
                }
                newArray[j] = array[i];
                j++;
            }
            return newArray;
        } else {
            System.out.println("Invalid index!");
            return array;
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

        // Remove the element at index 2
        int indexToRemove = 2;
        numbers = removeArrayElement(numbers, indexToRemove);

        // Print the updated array
        System.out.println("Updated Array:");
        printArray(numbers);
    }
}
