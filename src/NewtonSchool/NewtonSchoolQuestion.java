package NewtonSchool;

import java.util.ArrayList;
import java.util.Scanner;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewtonSchoolQuestion {

    // input tab tak lo jab tak input 0 na aa jaye then print it
    public static void printAllInputIntegerOfAllLines(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        while (true){
            int a = sc.nextInt();
            al.add(a);
            if (a==0){
                break;
            }
        }
        for (int a:al){
            System.out.print(a+" ");
        }

    }
    //taking input using buffered reader to solve some problems like delete spaces and doing something like this with this

    public static void useBufferedReaderForInput(){

        try{

            BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
            String[] str;
            //doubt that how it is storing data in array;
            str = bi.readLine().split(" ");
            int[] arr = new int[str.length];
            for (int i=0;i< arr.length;i++){
                arr[i] = Integer.parseInt(str[i]);
            }
            for (int a : arr){
                System.out.print(a);
            }


        }catch (Exception e){
            System.out.println(e);
        }

    }

    // question
    public static void bidding(){

        // by simply method it has done.
        try{
            BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

            Scanner sc = new Scanner(System.in);
            // taking 1 input from user for no. of cases
            int x = sc.nextInt();
            String[] nameStored = new String[x];
            String[] str;
            //taking 3 input for each cases from users
            for(int i=0;i<x;i++){
                str = bi.readLine().split(" ");
                int[] arr = new int[str.length];
                for (int j=0;j< arr.length;j++){
                    arr[j] = Integer.parseInt(str[j]);
                }
                if(arr[0]>=arr[1] && arr[0]>=arr[2]){
                    nameStored[i]="Alice";
                }else if(arr[1]>=arr[0] && arr[1]>=arr[2]){
                    nameStored[i]="Bob";
                }else if(arr[2]>=arr[0] && arr[2]>=arr[1]){
                    nameStored[i]="Charlie";
                }
            }

            for(String s:nameStored){
                System.out.print(s+" ");
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
    // is alphabet
    public static void isAlphabet(){
        // is alphabet without using conditional sentence
// there are more ways like
        /*
        if(Character.isAlphabetic()){
        sout("yes")}
        like this

        and
        char c = ;
        if((c>='a' && c<='z') || (c>='A' && c<='Z') ){
        sout(yes)
        else no;
        like this

         */

        // using ternary operator
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ? "YES" : "NO";

        System.out.println(output);

    }
    //Race
    public static void race(){
        int a=1;//1
        int b=2;//7
        int c=5;//5


        int k=0;
        int i=0;
        int j=0;
        for ( i=a,j=a,k=0;i<=c || j>=c;i++,j--,k++){
            if (i==c){
                break;
            }
            if (j==c){
                break;
            }
        }

        int l=0;
         i=0;
        j=0;
        for ( i=b,j=b,l=0;i<=c || j>=c;i++,j--,l++){
            if (i==c){
                break;
            }
            if (j==c){
                break;
            }
        }
        // now compare between k and l
        if (k<l){
            System.out.println("N");
        }else if (k>l){
            System.out.println("S");
        }else {
            System.out.println("D");
        }

    }
    //saras phone
    public static void sarasPhone(){
        String s ="44";
        Long l = Long.parseLong(s);
        System.out.println(l);
        int N=10;
        int K=3;
        int M=10;
        if(M<=N*K){
            float m=M;
            float k =K;
            System.out.println(M);
            System.out.println(m);
            System.out.println((int)(Math.ceil(m/k)));
        }else{
            System.out.println(-1);
        }
    }
    public static void main(String[] args) {

        // input tab tak lo jab tak input 0 na aa jaye then print it
        //  printAllInputIntegerOfAllLines();
        System.out.println();

        //taking input using buffered reader to solve some problems like delete spaces and doing something like this with this
        // useBufferedReaderForInput();
        System.out.println();

        // Bidding
       // bidding();

        // is alphabet without using conditional sentence
        // isAlphabet();

//        int a =3;
//        int b=4;
//        char c = a>b ? 'a' : 'b';
//        System.out.println(c);

//        race();
        sarasPhone();
        }
    }

