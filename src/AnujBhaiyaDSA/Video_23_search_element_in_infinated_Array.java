package AnujBhaiyaDSA;

public class Video_23_search_element_in_infinated_Array {
    public static int binarySearch(int[] arr,int low,int high,int key){
        if (low>high){
            return -1;
        }
        int mid = low+((high-low)/2);
        if (key==arr[mid]){
            return mid;
        }else if (key<arr[mid]){
            return binarySearch(arr,low,mid,key);
        }else {
            return binarySearch(arr,mid,high,key);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,12,13,45,56,78,89,98,99,100,123,234,345,567,789};

        int key = 89;
        int low=0;
        int high = 1;
        while (arr[high]<key){
            low=high;
            high=high*2;
        }
        int output = binarySearch(arr,low,high,key);
        System.out.println(output);
    }
}
