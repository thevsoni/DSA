package AnujBhaiyaDSA;

import java.util.Arrays;

public class Video_6_EuclidGCD_PrimeNumbers_SieveOfEratosthenes {
    public static int gcd(int a,int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {

        //Sieve of eratosthenes


        System.out.println("Sieve of eratosthenes");
        //using Arrays.fill we can insert initial value in the array
        // to print prime number
        int[] arr = new int[5];
        // to fill array initially with some number
        Arrays.fill(arr,1);
        Arrays.fill(arr,0,2,2);

        for (int i : arr){
            System.out.print(i+" ");
        }

        //sol
        // we have to find prime numbers till 30;
        int n = 100;
        boolean[] bl = new boolean[n+1];  // bcs array will start from 0
        Arrays.fill(bl,true);
        bl[0]=false;
        bl[1]=false;

        for (int i=2;i*i<=n;i++){
            for (int j = 2*i;j<=n;j=j+i){
                bl[j]=false;
            }
        }
        for (int i=0;i<=n ; i++){
            if (bl[i]){
                System.out.println(i);
            }
        }

        //lcm
        System.out.println("lcm find");
        int n1=72;
        int n2=120;
        int lcm;
        lcm = (n1>n2) ? n1 : n2;
        while (true){
            if (lcm%n1==0 && lcm%n2==0){
                System.out.println("lcm of "+n1+" and "+n2+" is = "+lcm);
                break;
            }
            lcm++;
        }


        //GCD
        System.out.println("GCD find");
        int g1=60;
        int g2=75;
        int gcd = (n1<n2) ? n1 :n2;
        while (true){
            if (g1%gcd==0 && g2%gcd==0){
                System.out.println("gcd of "+g1+" and "+g2+" is = "+gcd);
                break;
            }
            gcd--;
        }

        // gcd has two property .using this property we are able to gcd quickly
        System.out.println("gcd using its gcd(a,b) = gcd(a-b,b)");
        //gcd(a,b) = gcd(a-b,b)
//        gcd(a,b)= gcd(b,a%b)
        int gc1 = 24;
        int gc2 =60;
        int gcMain = (gc1<gc2) ? gc1 : gc2;
        while (true){
            if (gc1==gc2){
                System.out.println(gc1);
                break;
            }
            if (gc1>gc2){
                gc1 -= gc2;
            }else if (gc2>gc1){
                gc2 -= gc1;
            }
        }

        //gcd(a,b) = gcd(b,a%b)
        System.out.println("gcd using its gcd(a,b) = gcd(b,a%b)");
        gc1 = 24;
        gc2 = 60;
        while (true){
            if (gc1==gc2){
                System.out.println(gc1);
                break;
            }else if (gc1==0){
                System.out.println(gc2);
                break;
            }else if (gc2==0){
                System.out.println(gc1);
                break;
            }
            if (gc1>gc2){
                gc1 = gc1%gc2;
            }
            else if (gc2>gc1){
                gc2 = gc2%gc1;
            }

        }
        // using recursion
        System.out.println("gcd using recursion");
        System.out.println(gcd(24,60));
        gcd2(24,60);
        System.out.println( gcd3(24,60));



    }
    public static void gcd2(int a,int b){
        if (b==0){
            System.out.println(a);
            return;
        }
        gcd2(b,a%b);
    }
    public static int gcd3(int a,int b){
        return a%b==0 ? b : gcd3(b,a%b);
    }
}
