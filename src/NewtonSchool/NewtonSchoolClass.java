package NewtonSchool;
import java.util.*;
import java.lang.*;
import java.io.*;

// 30-10-22
public class NewtonSchoolClass {
    public static void main(String[] args) throws Exception{

        int[][] arr= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

        for (int i=0;i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int rows = 0;
        int rowe = arr.length-1;
        int cols = 0;
        int cole = arr[0].length-1;

        while(rowe>=rows && cole>=cols){

            // row start to col end
            for(int col=cols; col<=cole; col++){
                System.out.println(arr[rows][col]+" ");
            }
            rows = rows+1;

            // row start to row end
            for(int row=rows; row<=rowe; row++){
                System.out.println(arr[row][cole]+" ");
            }
            cole = cole-1;

            // col end to col start
            for(int col=cole; col>=cols; col--){
                System.out.println(arr[rowe][col]+" ");
            }
            rowe = rowe-1;

            // row end to row start
            for(int row=rowe; row>=rows; row--){
                System.out.println(arr[row][cols]+" ");
            }
            cols = cols+1;

        }

    }
}
