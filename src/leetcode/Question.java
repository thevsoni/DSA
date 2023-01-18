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

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<students.length; i++){
            queue.add(students[i]);
        }
        for(int i=sandwiches.length-1; i>=0; i--){
            stack.push(sandwiches[i]);
        }

        int ans = 0;
        int temp;
        while(!queue.isEmpty()){
            if(queue.peek()==stack.peek()){
                queue.remove();
                stack.pop();
            }else{
                if(!stack.contains(queue.peek())){
                    ans = queue.size();
                    break;
                }else{
                    queue.add(queue.remove());
                }
            }
        }
        return ans;
    }
}
public class Question {

    public static void main(String[] args) {
       int[] student = {1,1,1,0,0,1};
       int[] sandwiches = {1,0,0,0,1,1};

       Solution s = new Solution();
        System.out.println(s.countStudents(student,sandwiches));

    }
}
