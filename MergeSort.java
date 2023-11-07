public class MergeSort {

    public static void main(String[] args) {
        int [] unsortedArray = {1,5,0,3,9,2,8,7,4};
        System.out.print("Before sorting: ");
        print(unsortedArray);
        System.out.println();
        System.out.print("After Sorting: ");
        mergeSort(unsortedArray,0,8);
        print(unsortedArray);


    }

    public static void mergeSort(int [] array, int low, int high)
    {
        if(low==high)
            return;

        int mid = (low + high)/2;

        mergeSort(array,low,mid);
        mergeSort(array,mid+1,high);
        merge(array,low,mid,high);
    }

    //merge two sub array of base array
    //first sub array is arr[low...mid]
    //second sub array is arr[mid...high]
    //mid,high,low are index of our array
    public static void merge(int [] array, int low, int mid, int high)
    {
        //sizes of array
        int leftSubArrayLength = (mid-low+1);
        int rightSubArrayLength = high-mid;

        //creating temp arrays
        int [] leftSubArray  = new int [leftSubArrayLength];
        int [] rightSubArray = new int [rightSubArrayLength];

        //copy data to temp arrays
        for (int i = 0; i < leftSubArrayLength; i++) {
            leftSubArray[i]=array[low+i];
        }
        for (int i = 0; i <rightSubArrayLength; i++) {
            rightSubArray[i]=array[mid+1+i];
        }


        //merge two array
        int i=0,j=0;
        int k =low;

        while(i<leftSubArrayLength && j<rightSubArrayLength)
        {
            if(leftSubArray[i]>rightSubArray[j])
            {
                array[k++]=rightSubArray[j++];
            }
            else
            {
                array[k++]=leftSubArray[i++];
            }
        }

        //if size of array not even we have to check  remain index
        while(i<leftSubArrayLength)
        {
            array[k++]=leftSubArray[i++];
        }

        while(j<rightSubArrayLength)
        {
            array[k++]=rightSubArray[j++];
        }

    }

    public static void print(int [] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }



}