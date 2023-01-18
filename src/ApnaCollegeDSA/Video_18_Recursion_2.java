package ApnaCollegeDSA;


// whenever we call recursion ,in that time we have to very care about i-- and i-1 like this

import java.util.HashSet;
import java.util.Scanner;

public class Video_18_Recursion_2 {
    // TOWER OF HANOI
    public static void towerOfHanoi(int n,String source,String helper,String destination){
        if (n==1){
            System.out.println("transfer disk "+n+" from "+source+" to "+destination);
            return;
        }
        towerOfHanoi(n-1,source,destination,helper);
        System.out.println("transfer disk "+n+" from "+source+" to "+destination);
        towerOfHanoi(n-1,helper,source,destination);

    }

    //print a string in reverse
    public static void psr(StringBuilder name,int a){
        if (a==0){
            return;
        }
        System.out.print(name.charAt(a-1));
        a--;
        psr(name,a);
    }
    public static void psr2(String name,int index){
        if (index == -1){
            return;
        }
        System.out.print(name.charAt(index));
        psr2(name,index-1);
    }


    // find the first and last occurrence of a element in string
    // "abaacdaefaah"
    public static int first=-1; // using this ,in stack there will not be create extra variables for these two elements
    public static int last = -1;

    public static void flo(String name,char a,int i){
        if (i==name.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
       // char curChar = name.charAt(i);
        if (name.charAt(i)==a){
            if (first==-1){
                first = i;
            }else {
                last = i;
            }
        }
        i++;
        flo(name, a, i);
    }
     //check if an array sorted (strictly increasing)

    public static void crs(int [] ar,int arl){
        if (arl==0){
            System.out.println("sorted");
            return;
        }
        if (ar[arl]<ar[arl-1]){
            System.out.println("not sorted");
            return;
        }
        crs(ar, arl-1);
    }

    public static boolean crs2(int [] ar ,int idx){
        if (idx== ar.length-1){
            return true;
        }
        if (ar[idx]<ar[idx+1]){
            return crs2(ar,idx+1);
        }else {
            return false;
        }
    }


    public static boolean crs3(int [] ar ,int idx){
        if (idx== ar.length-1){
            return true;
        }
        if (ar[idx]>=ar[idx+1]){
            return false;
        }
        return crs3(ar,idx+1);

    }

    // move all 'x' to the end of the string
    public static void maxte(String name,int i,String sb,String sb2) {
        if (i==name.length()){
           sb = sb+ sb2;
            System.out.println(sb);
            return;
        }
        if (name.charAt(i)!='x'){
            sb = sb+name.charAt(i);
        }else {
            sb2 = sb2+'x';
        }
    //    if (name.charAt(i)=='x'){
    //        sb2 = sb2+'x';
    //    }
        // maxte(name ,i++) it will give stackflow error because pahle i chale jayega fir i ka value increase hoga jiska ko sence nahi hoga.
        i++;
        maxte(name, i,sb,sb2);
    }

    // move all x to the end of the string using loop
    public static void maxte2(String name,int i,String sb,int count) {
        if (i==name.length()){
            System.out.print(sb);
            for (int j=0;j<count;j++){
                System.out.print('x');
            }
            return;
        }
        if (name.charAt(i)!='x'){
            sb = sb+name.charAt(i);
            i++;
            maxte2(name, i,sb,count);
        }else {
            count++;
            i++;
            maxte2(name, i,sb,count);
        }
    }

    // remove duplicates in a string "abbccda" to "abcd"

    public static void rd(String name,int i,String name2){
        if (i==name.length()){
            System.out.println(name2);
            return;
        }
        boolean bl = true;
        for (int j = 0;j<i;j++){
            if (name.charAt(i)==name.charAt(j)){
                bl = false;
                break;
            }
        }
        if (bl){
            name2 += name.charAt(i);
        }
        i++;
        rd(name,i,name2);
    }
   public static boolean[] bl = new boolean[26];
    public static void rd2(String name,int i,String name2){
        if (i==name.length()){
            System.out.println(name2);
            return;
        }
        if (bl[name.charAt(i)-'a']==true){
            i++;
            rd2(name,i,name2);
        }else {
            name2 += name.charAt(i);
            bl[name.charAt(i)-'a']=true;
            i++;
            rd2(name,i,name2);
        }
    }

    //print all subsequences of a string
    // abc

    public static int num =0;
    public static void ss(String str,int i,String newStr){

        if (i==str.length()){
            System.out.println(newStr);
        //    num += 1;
       //     System.out.println(num);
            return;
        }

        char cc = str.charAt(i);
        //to be
        ss(str,i+1,newStr+cc);
        //to not be
        ss(str,i+1,newStr);
    }

    //print all unique subsequences of a string
    // aaa
    public static void ss2(String str, int i, String newStr, HashSet<String> set ){
        if (i==str.length()){
            if (set.contains(newStr)){
                return;
            }else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(i);
        // to be
        ss2(str,i+1,newStr+currChar,set);
        //not to be
        ss2(str,i+1,newStr,set);
    }

    // print keyboard combination

    public static String [] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str,int idx,String combination){
        if (idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for (int i=0;i<mapping.length();i++){
            printComb(str,idx+1,combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
//        int n =3;
//        towerOfHanoi(n,"s","h","d");
//        StringBuilder name=new StringBuilder("abcd");
//          int a=name.length();
//        psr(name,a);
//        String name = "abcd";
//        psr2(name,name.length()-1);
//        String name = "baacdaefaah";
//          flo(name,'a',0);
//        int[] ar = {1,2,6,3,4,5};
//        crs(ar,ar.length-1);
//            int[] ar = {1,2,3,4,5,5,6};
//        System.out.println(crs2(ar,0));
//     int [] ar ={1,2,3,4,5,6,7};
//     System.out.println(crs3(ar,0));
//       String name = "axbcxxd";
//        maxte(name,0,"","");
//        String name = "axbcxxd";
//        maxte2(name,0,"",0);
//        String name = "abbcceeefgthhhttggffda";
//        rd(name,0,"");
//        String name2 = "abbcceeefgthhhttggffda";
//             rd2(name2,0,"");
//        String str= "abc";
//        ss(str,0,"");
//       String str = "aaa";
//        ss2(str,0,"");
//        String name = "abc";
//        HashSet<String> set = new HashSet<>();
//        ss2(name,0,"",set);

        // print keypad combination
        String str ="33";
        printComb(str,0,"");


    }

}


