package ApnaCollegeDSA;

public class BinarySearch_AnujBhaiya {
    public static int binarySearch(int[] a,int value){
        int low=0;
        int high = a.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (value==a[mid]){
                return mid;
            } else if (value<a[mid]) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }
    //binary search using recursion
    public static int binarySearchUsingRecursion(int[] a,int value,int low,int high){
        if (low>high){
            return -1;
        }
        int mid = low+(high-low)/2;
        if (a[mid]==value){
            return mid;
        } else if (value<a[mid]) {
            return binarySearchUsingRecursion(a,value,low,mid-1);
        }else  {
            return binarySearchUsingRecursion(a,value,mid+1,high);
        }
    }
    public static void main(String[] args) {
        int[] a = {-4,-1,3,4,5,6,7,10,11};

        // binary search using different methods
        System.out.println("binary search using different methods");
        int value = 11;
        System.out.println(binarySearch(a,value));

        //binary search using recursion
        System.out.println("binary search using recursion");
        System.out.println(binarySearchUsingRecursion(a,value,0,a.length-1));

        //using inside main function
        System.out.println("using inside main function");
        int low = 0;
        int high = a.length-1;
        int mid=0;
        int value2 = -1;
        boolean bl=false;
        while (low<=high){
            mid = low+(high-low)/2;
            if (a[mid]==value2){
                System.out.println(mid);
                bl=true;
                break;
            } else if (value2<a[mid]) {
                high = mid-1;
            }else {
                low=mid+1;
            }
        }
        if (bl){
            System.out.println(value2+" is placed at "+mid);
        }else {
            System.out.println(value2+" is not found");
        }

    }
}
