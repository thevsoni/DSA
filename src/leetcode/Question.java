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
        int[] height = {1,8,6,2,5,4,8,3,7};
        Solution s = new Solution();
        System.out.println(s.maxArea(height));
    }
}
class Solution {
    public int maxArea(int[] height) {
        int ans = 0;

        for(int i=0; i<height.length; i++){
            for(int j=0; j<i; j++){
                ans = Math.max(ans,Math.min(height[i],height[j])*(i-j));
            }
        }
        return ans;
    }
}