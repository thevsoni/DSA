package ApnaCollegeDSA;

import java.util.Scanner;
// video 13 String builder


// video 15 bit manipulation
public class Video_15 {
    public static void main(String[] args) {

        // get bit
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        if ((bitMask & n )==0){
            System.out.println("zero");
        }else {
            System.out.println("one");
        }

        // set bit
        int m  = 5;
        int pos2 = 1;
        int bitMask2 = 1<<1;

        int newNumber = bitMask2 | m;
        System.out.println(newNumber);

        //clear bit
        int nn = 5;
        int poss = 2;
        int bitMask3 = 1<<poss;
        System.out.println(5 & ~(bitMask3));
        System.out.println(bitMask3);

    }
}

/*
public class Video_13 {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("tony");
//        String s = new String("tony");
//        System.out.println(sb.charAt(0));
//        System.out.println(sb.indexOf("o"));
//        System.out.println(s.replace('t','n'));
//        sb.setCharAt(0,'n');
//        System.out.println(sb);
//        sb.insert(0,'i');
//        System.out.println(sb);
//        sb.deleteCharAt(0);
//        System.out.println(sb);
//        sb.delete(1,2);
//        System.out.println(sb);

      StringBuilder sb = new StringBuilder("hello");
      for (int i = 0;i<sb.length()/2;i++){
          char front = sb.charAt(i);
          char back = sb.charAt(sb.length()-i-1);
          sb.setCharAt(i,back);
          sb.setCharAt(sb.length()-i-1,front);

      }
        System.out.println(sb);

        for (int i = 0;i<sb.length()/2;i++){
          //  char front = sb.charAt(i);
          //  char back = sb.charAt(sb.length()-i-1);
            char z = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(sb.length()-i-1));
            sb.setCharAt(sb.length()-i-1,z);

        }
        System.out.println(sb);

      String s = new String("hanji");
        System.out.println(s);
      for (int i = 0 ; i < s.length()/2 ; i++){
          char f = s.charAt(i);
          s.replace(s.charAt(i),s.charAt(s.length()-i-1));
          s.replace(s.charAt(s.length()-i-1),f);


      }
        System.out.println(s);
      s.replace('h','a');
        System.out.println(s);
        System.out.println(s.replace('h','a'));

      int [] a = {1,2,3,4,5};
      for (int i = 0 ; i < a.length/2 ; i++){
          int b = a[i];
          int c = a[a.length - i - 1];
          a[a.length - i - 1] = b;
          a[i]=c;

      }
      for (int b:a){
          System.out.print(b+" ");
      }

      int [] x = {6,7,8,9,10};
      for (int i = 0 ; i < x.length/2 ; i++){
          int b = x[i];
          x[i] = x[x.length-i-1];
          x[x.length-i-1] = b;
      }
        for (int b:x){
            System.out.print(b+" ");
        }
    }
}


public class Video12_String {
    public static void main(String[] args) {
      String a  = "tnhuhiihhhaoni";
      String b = "soni";
      if (a.compareTo(b)==0){
          System.out.println("equal");
      }else {System.out.println("not equal");
      }
     if (a.compareToIgnoreCase(b)==0){
         System.out.println("equal");
     }else {
         System.out.println("not equal");
     }
     System.out.println(a.compareToIgnoreCase(b));
     System.out.println(a.compareTo(b));

        String aa = "ram";
         aa = "aar";
        System.out.println(aa);
        System.out.println(aa.indexOf("r"));

        for (int i = 0;i<aa.length();i++){
            System.out.println(aa.charAt(i));
        }


    }

}
*/