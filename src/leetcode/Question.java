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
        System.out.println(s.numWaterBottles(9,3));
        LinkedList<Integer> l = new LinkedList<>();

    }
}
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;

        while(numBottles>0){
            ans += numBottles/numExchange;
            int temp = numBottles%numExchange;
            numBottles /= numExchange;
            numBottles += temp;
        }
        return ans;
    }
}