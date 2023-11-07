public class InsertionSort {

    public static void main(String[] args) {
        int [] unsortedArray = {2,3,1,4,3,9,0};
        System.out.print("Before insertion sort: ");
        print(unsortedArray);
        System.out.println();
        System.out.print("After  insertion sort: ");
        print(insertionSort(unsortedArray));
    }

    public static int[] insertionSort(int[] array) {

        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;

            while (i >=0  && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
        return array;
    }

    public static void print (int [] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
}