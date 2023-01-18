package ApnaCollegeDSA;

class Video6_Pattern {
    // butterfly pattern
    //first how i code for this
    public void p1() {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == j || i + j == n + 1 ||
                        ((i + j == 5 || i + j == 6 || i + j == 7 || i + j == 8) && i > j) ||
                        ((i + j == 10 || i + j == 11 || i + j == 12 || i + j == 13 || i + j == 14 || i + j == 15) && j > i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void p1_2() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (2 * n) - (2 * i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (2 * n) - (2 * i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //solid rhombus

    public void p2() {
        int n = 5;
        //    int m = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            // is third condition ko print bhi nhi karwaye to bhi result same aayega
            System.out.println();
        }
    }

    // hollow rhombus
    public void p3() {

//        int n =5;
//        int m =5;
//        int num =1;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=m;j++){
//                if (i==1||i==n||j==1||j==m){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 3; j++) {
                if (i == 1 || i == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Number pyramid
    public void p4() {
        int n = 5;
        //  int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "   ");
                //    System.out.print("  ");
            }
            //  m++;
            System.out.println();
        }
        System.out.println();
    }

    // palindromic pattern
    public void p5() {
        int n = 5;
      //  int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
      //      m=i;
            for (int j = i;j>=1;j--){
                System.out.print(j+" ");
        //        m--;
            }
            for (int j = 2;j<=i;j++){
                System.out.print(j+" ");
       //         m++;
            }
            System.out.println();

        }
        System.out.println();
    }
    public void p6(){
        int n = 4;
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j =1;j<=i;j++){
                System.out.print("* ");
            }
            for (int j = 1;j<=i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n;i>=1;i--){
            for (int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j =1;j<=i;j++){
                System.out.print("* ");
            }
            for (int j = 1;j<=i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void p6_2(){
        int n = 6;
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j =1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = n;i>=1;i--){
            for (int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j =1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
    }
}


public class Video6_AdvancedPattern {
    public static void main(String[] args) {
        Video6_Pattern p = new Video6_Pattern();
        p.p1();
        p.p1_2();
        p.p2();
        p.p3();
        p.p4();
        p.p5();
        p.p6();
        p.p6_2();

    }
}
