package leetcode;
import ApnaCollegeDSA.Video_32_BinaryTree;
import ApnaCollegeDSA.Video_33_BinarySearchTree;
import com.sun.source.tree.ArrayAccessTree;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;
import java.util.stream.IntStream;
import java.util.Collections;


public class Question {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[][] arr= {{3,50},{7,10},{12,25}};
        int income = 10;
        System.out.println(s.calculateTax(arr,income));
    }
}
class Solution {
    public double calculateTax(int[][] brakets, int income) {
        if(income==0){
            return (double)(0);
        }
        double ans = (double)0;

        for(int i=0; i<brakets.length; i++){
            if(income==0){
                break;
            }
            if(i==0){
                if(brakets[i][0]<=income){
                    ans += (double)((double)brakets[i][0]*(double)brakets[i][1])/(double)100;
                    income -= brakets[i][0];
                }else{
                    ans += (double)((double)income*(double)brakets[i][1])/(double)100;
                    break;
                }
            }
            else{
                if(brakets[i][0]-brakets[i-1][0] <=income){
                    ans += (double)((double)(brakets[i][0]-brakets[i-1][0])*(double)brakets[i][1])/(double)100;
                    income -= (brakets[i][0]-brakets[i-1][0]);
                }else{
                    ans += ((double)income*(double)brakets[i][1])/(double)100;
                    break;
                }
            }
        }

        return ans;
    }
}