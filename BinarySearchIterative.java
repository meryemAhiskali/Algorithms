public class BinarySearchIterative {

    public static void main(String[] args) {
    int [] sortedArray = {1,2,4,6,9,12,43,56,66,99,265};
    int target = 99;
    int result = binarySearchIterative(sortedArray,target);
    if (result!=-1)
        System.out.println(target + " is found at index "+ result + " index");
    else
        System.out.println(target + " is NOT found");
    }

    public static int binarySearchIterative(int[] sortedArray, int target) {
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (sortedArray[mid] == target) {
                return mid; //target is found
            } else if (sortedArray[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; //target not found
    }


}

