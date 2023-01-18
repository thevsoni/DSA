package ApnaCollegeDSA;

public class Video_23_QuickSorting {
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j=low;j<high;j++){
            if (arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
//        arr[i]=arr[high];
        arr[high]=temp;

        return i;
    }
    public static void quickSort(int [] arr,int low,int high){
        if (low>=high){
            return;
        }
        int pidx = partition(arr,low,high);
        quickSort(arr, low, pidx-1);
        quickSort(arr, pidx+1, high);

    }
    public static void main(String[] args) {
        int [] arr = {6,3,9,5,2,8};
        quickSort(arr,0, arr.length-1);
        for (int i:arr){
            System.out.print(i);
        }
    }
}
