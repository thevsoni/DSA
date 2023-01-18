package ApnaCollegeDSA;


public class Video_17_Recursion_1 {

    //print sum of n
    public static int a1(int a){

      if (a==1){
          return 1;
      }
      else {
          return a+a1(a-1);
      }
    }
    public static int a2(int a){
        if (a==10){
            return 10;
        }
        else {
            return a+a2(a+1);
        }
    }
    public static void a3(int i,int n, int sum){
        if (i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        a3(i+1,n,sum);
        System.out.println(i);

    }
    //factorial
    public static int factorial(int a){
        if (a==1){
            return 1;
        }
        else {
            System.out.println(a);

            return a*factorial(a-1);

        }

    }
    public static void facto(int a,int value){
        if (a==1){
            System.out.println(value);
            return;
        }
        value *= a;
        facto(a-1,value);
        System.out.println(a);
    }
    public static void fac(int i,int n,int value){
        if (i==n){
            value *= i;
            System.out.println(value);
            return;
        }
        value *= i;
        i++;
        fac(i,n,value);

    }

    //fibonacci
    public static int fibo(int a){
        if(a==1||a==2){
            return a-1;
        }
        else {
            return fibo(a-1)+fibo(a-2);

        }
    }
    public static void fibo2(int a){
        int[] ar = new int[a];

            for (int i = 0; i <ar.length; i++) {
                if (i == 0 || i == 1) {
                  //  System.out.println(i);
                    ar[i]=i;

                } else {
                  //  System.out.println((i - 1) + (i - 2));
                    ar[i]=ar[i-2]+ar[i-1];
                }

            }
            for (int i :ar){
                System.out.print(i+" ");
            }
        }
        public static void fibo3(int f,int s,int n,int i){
        int sum =0;
        if (n==1||n==2){
            System.out.println(n-1);
            return;
        }
             sum=f+s;
            System.out.println(sum);
             f=s;
             s=sum;
             if (i==n){
                 return;
             }
            i++;
            fibo3(f,s,n,i);
        }
        public static void fibo4(int a,int b,int n){
        if (n==0){
            return;
        }
        int c=a+b;
            System.out.println(c);
            fibo4(b,c,n-1);
        }

    public static void fibo5(int a,int b,int n,int i){
        if (i==n){
            return;
        }
        int c=a+b;
        System.out.println(c);
        i++;
        fibo5(b,c,n,i);
    }

    // print x^n here stack height = n

    public static int xn(int x,int n){
        if (x==0){
            return 0;
        }
        if (n==0){
            return 1;
        }else {
            return x*xn(x,n-1);
        }
    }

    public static void xn2(int x,int n,int i){
        if (x==0){
            System.out.println("0");
            return;
        }
        if (n==0){
            System.out.println(i);
            return;
        }
        i *= x;
        xn2(x,n-1,i);
    }

    // print x^n here stack height = logn


    public static int xnlogn(int x,int n){
        if (x==0){
            return 0;
        }
        if (n==0){
            return 1;
        }

        if (n%2==0){
            return xnlogn(x,n/2)*xnlogn(x,n/2);
        }
        else {
            return x*xnlogn(x,n/2)*xnlogn(x,n/2);
        }

    }


    public static void main(String[] args) {
       // System.out.println(a1(10));
      //  System.out.println(a2(1));
      //  a3(1,10,0);
      // System.out.println(factorial(5));
    //    facto(5,1);
      //  fac(1,5,1);
      //  System.out.println(fibo(5));
     //   fibo2(5);
//        // fibo3(0,1,2,1);
//        int a=0;
//        int b=1;
//        int n =10;
//        System.out.println(a);
//        System.out.println(b);
//        // fibo4(a,b,n-2);
//        fibo5(a,b,n-2,0);
  //      System.out.println(xn(2,6));
        //   xn2(2,6,1);
        System.out.println(xnlogn(2,7));

   }
}
