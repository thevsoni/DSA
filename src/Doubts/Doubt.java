package Doubts;
import java.util.*;
import java.lang.*;
import java.util.stream.IntStream;
import java.util.Collections;
import java.util.Arrays;
public class Doubt {

    public static int lowestNumber(String s,int n){

        //we have to return a integer which has some size, so for now we will create a string str behalf this then
        //typecast into int at the time of returning.

        //our string size should have the size of m after removing n element.
        int m = s.length()-n;


        String str = "";

        //idea of the solution is that if we have string with the size of 7 element (suppose),and we have to remove
        // suppose 3 element then we will get 4 digit number ,to make this lowest number and condition is we are
        // not allowed to change the order as well
        // then 1st digit of our 4 digit is the minimum value of String s.charAt(0) to s.charAt(3)
        // then after getting the lowest value .-it is the first value of our new string str
        // for 2nd digit of our 4 digit is the lowest value of s.charAt(original index of our first value in String s +1)
        //  to s.charAt(4). this is why because of ,we are not allowed to change the order.and already we have got
        // first digit lowest value so we do not want to compare this that's why use +1
        //do this till the last index of string s.

        int x=0;
        for (int i=m-1;i<s.length();i++){
            int min = s.charAt(i)-'0';
            int y =i;
            for (int j=i;j>=x;j--){
                if ((s.charAt(j)-'0')<min){
                    min = s.charAt(j)-'0';
                    y=j;
                }
            }
            str += min;
            x=y+1;
        }

        return Integer.parseInt(str);
    }

    public static void main(String[] args) {

/*
//        Question
        // Given a string ‘str’ of digits and an integer ‘n’,
        // build the lowest possible number by removing ‘n’ digits from the string and not changing the order of
        // input digits.
        String s = "1234567";
// 10200
        int n=1;
        //output = 2043

        System.out.println(lowestNumber(s,n));
        System.out.println(Arrays.toString(arr));
*/


    }
}
//11-12-22
// doubt
//arena

//leetcode
//1358

