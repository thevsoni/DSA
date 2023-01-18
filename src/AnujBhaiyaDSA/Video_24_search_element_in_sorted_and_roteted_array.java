package AnujBhaiyaDSA;

public class Video_24_search_element_in_sorted_and_roteted_array {
    public static void main(String[] args) {

            int[] arr = {120,130,40,50,90,100,110};
            int low=0;
            int high = arr.length-1;
            int searchValue = 100;

      /*      int mid = si+(ei-si)/2;
            if(arr[mid]==searchValue){
                System.out.println(mid);
                return;
            }else if (arr[si]<arr[mid]){
                if (arr[si]<searchValue && searchValue<arr[mid]){
                    //here binary search
                }else{
                    // otherwise linear search
                }
            }else if (arr[mid]<arr[ei]){
                if (arr[mid]<searchValue && searchValue<arr[ei]){
                    // here binary search
                }else{
                    //otherwise linear search
                }
            }
            // but aise code krne se linear search krna padega
        // isliye same binary search ka  code krenge bas usme extra condition daal denge
     */
        //
       while (low<=high){
           int mid = low+(high-low)/2;
           if (arr[mid]==searchValue){
               System.out.println(mid);
               return;
           }
           if (arr[low]<arr[mid]){
               if (arr[low]<=searchValue && searchValue<arr[mid]){
                   high = mid-1;
               }else{
                   low=mid+1;
               }
           }else{
               if (arr[mid]<searchValue && searchValue<=arr[high]){
                   low = mid+1;
               }else{
                   high = mid-1;
               }
           }
       }
    }
}
