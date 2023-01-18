package ApnaCollegeDSA;


public class Video_16_Sorting {
    public static void main(String[] args) {

        // insertion using while loop

        int[] ar = {7, 8, 3, 1, 2};
        for (int i = 1; i < ar.length; i++) {
            int current = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] > current) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j+1] = current;
        }
            for (int i:ar){
                System.out.print(i+" ");
            }
            System.out.println();


        // insertion sort
        //using  for loop

        int[] arr = {7, 8, 3, 1, 2};
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j =i-1;
            for (j = i-1;j>=0 && arr[j]>current ; j--){
                arr[j+1] = arr[j];

            }
            arr[j+1]=current;

        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}

    /*    //selection sort

        int [] arr = {7,8,3,1,2};
        for (int i=0;i< arr.length-1;i++){
            int sm=i;
            for (int j =i;j<arr.length-1;j++){
                if (arr[sm]>arr[j+1]){
                    int temp = arr[sm];
                    arr[sm] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    }
       // bubble sort descending sort
        int[] arr = {7, 8, 3, 1, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }

}

        // bubble sort ascending order
        int [] arr = {7,8,3,1,2};
        for (int i = 0 ;i< arr.length-1;i++){
            for (int j =0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        int [] arr2 = {7,8,3,1,2};
        for (int i = 0 ;i< arr2.length-1;i++){
            for (int j =0;j<arr2.length-1-i;j++){
                if (arr2[j]>arr2[j+1]){
                    int temp = arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;

                }
            }
        }
        for (int i:arr2){
            System.out.print(i+" ");
        }
    }
    }

        int [] arr = {2,4,5,6,7,1};
        int mi = Integer.MIN_VALUE;
        boolean b= true;
        for (int i = 0;i< arr.length;i++){
            if (arr[i]>=mi){
                mi = arr[i];
            }else {
                System.out.println("not sort");
                b = false;
                break;
            }
        }
        if (b){
            System.out.println("this is sorting array");
        }
        int arr2[] = { 1,2,311,589,4,5,6,7,9,8};

        for (int i = 0 ;i< arr2.length-1;i++){
            if (arr2[i]<=arr2[i+1]){
                continue;
            }
            else {
               int a = arr2[i];
               arr2[i] = arr2[i+1];
               arr2[i+1] = a;
            }
        }

        for (int i:arr2){
            System.out.print(i+" ");
        }
    }
}

public class TypeCasting {
    public static void main(String[] args) {
      String s = "8123";
      //         int a = (int)s;
        int i = Integer.parseInt(s);
        float f = Float.parseFloat(s);
        double d = Double.parseDouble(s);
        Double D = Double.parseDouble(s);

        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(D);

    }
}
*/