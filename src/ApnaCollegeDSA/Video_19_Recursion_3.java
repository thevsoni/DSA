package ApnaCollegeDSA;

import java.util.ArrayList;

public class Video_19_Recursion_3 {

    // print all permutation of a string "abc"
    public static void pt(String str,String permutation){
        if (str.length()==0){
            System.out.println(permutation);
            return;
        }

        for (int i=0;i<str.length();i++){
            char cuuChar = str.charAt(i);
            String newString = str.substring(0,i)+str.substring(i+1);
            pt(newString,permutation+cuuChar);
        }
    }
    // print total paths in a maze to move from (0,0) to (n,m)

    public static int countPaths(int i,int j,int n,int m){
        if (i==n-1&&j==m-1){
            return 1;
        }
        if (i==n||j==m){
            return 0;
        }
        int downpath = countPaths(i+1,j,n,m);
        int rightath = countPaths(i,j+1,n,m);
        return downpath+rightath;

    }
    // place tiles of size 1*m in a floor of size n*m
    //n=4,m=2

    public static int placeTiles(int n,int m){
        if (n==m){
            return 2;
        }
        if (n<m){
            return 1;
        }
        int vertPlace = placeTiles(n-m,m);
        int horPlace = placeTiles(n-1,m);
        return vertPlace+horPlace;
    }
    //find the number of ways in which you can invite n people to your party single or in pairs
    public static int callGuests(int n){

        if (n<=1){
            return 1;
        }

        // call single
        int ways1 = callGuests(n-1);

        //call pairs
        int ways2 = (n-1)*callGuests(n-2);

        return ways1+ways2;
    }

    // print all the subset of a set of first n natural numbers .
    // for n=3 -> (1,2,3),(1,2),(1,3),(2,3),(1)(2)(3)(.)

    public static void printSubSet(ArrayList<Integer> subSet){
        for (int i=0;i< subSet.size();i++){
            System.out.print(subSet.get(i));
        }
        System.out.println();
    }
    public static void findSubSet(int n,ArrayList<Integer> subSet){
        if (n==0){
            printSubSet(subSet);
            return;
        }
        // add hoga
        subSet.add(n);
        findSubSet(n-1,subSet);

        //add nahi hoga
        subSet.remove(subSet.size()-1);
        findSubSet(n-1,subSet);
    }

    public static void main(String[] args) {

//         print all permutation of a string "abc"
//        String str = "abc";
//        pt(str,"");
//
//         print total paths in a maze to move from (0,0) to (n,m)
//        int n =3;
//        int m =4;
//        System.out.println(countPaths(0,0,n,m));

//         place tiles of size 1*m in a floor of size n*m
//        n=4,m=2
//        int n=4,m=2;
//        System.out.println(placeTiles(n,m));

//         find the number of ways in which you can invite n people to your party ,single or pair (n=4)
//        int n=4;
//        System.out.println(callGuests(n));

        // print all the subset of set of first n natural number .
        // for n=3 -> (1,2,3),(1,2),(1,3),(2,3),(1)(2)(3)(.)

        int n=3;
        ArrayList<Integer> subSet = new ArrayList<>();
        findSubSet(n,subSet);
    }
}
