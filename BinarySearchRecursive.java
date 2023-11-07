public class BinarySearchRecursive {

    public static void main(String[] args) {
        int [] sortedArray = {1,34,56,67,78,87,94,103,456};
        int target = 34;
        int result = binarySearchRecursive(sortedArray,0,sortedArray.length-1,target);
        if(result!=-1)
            System.out.println("Target found at index: "+result);
        else
            System.out.println("Target not found");
    }

    public static int binarySearchRecursive(int [] sortedArray,int left,int right,int target)
    {
        int mid = (left + right) / 2;

        if(left<=right)//base case to terminate recursive
        {
            if (sortedArray[mid]==target)
            {
                return mid;//target found
            }else if(sortedArray[mid]<target)
            {
                return binarySearchRecursive(sortedArray,mid+1,right,target);
            }else
            {
                return binarySearchRecursive(sortedArray,left,mid-1,target);
            }

        }
        return -1;//target not found
    }


}

