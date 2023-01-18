package AnujBhaiyaDSA;
import java.util.*;
import java.util.HashSet;

public class Video_4_XOR {

    public static void main(String[] args) {
        // find the only non repeating element in an array where every element repeat twice;
        //using for loop
        System.out.println("find the only one non repeating element in an array where every element repeat twice");
        int[] arr = {5, 4, 1, 4, 3, 5, 1};
        for (int i = 0; i < arr.length; i++) {
            boolean bl = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    bl = true;
                }
            }
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    bl = true;
                }
            }
            if (bl == false) {
                System.out.println(arr[i]);
            }

        }
        //using hashSet
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
                    if (hs.contains(arr[i])){
                        hs.remove(arr[i]);
                    }else {
                        hs.add(arr[i]);
                    }
           }
        System.out.println(hs);

        //using xor
        int res =0;
        for (int i=0;i< arr.length;i++){
            res = res^arr[i];
        }
        System.out.println(res);

        // find the two non repeating element in an array where every element repeat twice;
        System.out.println("find the two non repeating element in an array where every element repeat twice");
        int[] b ={5,4,1,4,3,5,1,2};
        int result = 0;

        //
        // find the one non repeating element in an array where every element repeat thrice;



    }
}