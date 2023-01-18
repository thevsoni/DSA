package ApnaCollegeDSA;


// video 5 pattern question from apna college DSA

//solid rectangle
class Pattern1{

    public Pattern1(){
        int n = 4;
        int m = 5;
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
//hollow rectangle
class Pattern2 {
    public Pattern2() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print("* ");

            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                    //  a = false;
                }
            } else {
                for (int j = 0; j < n - 1; ) {
                    System.out.print("  ");
                    j++;
                    if (j == n - 1) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

class Pattern2_2 {
    public Pattern2_2(){
        int n = 4;
        int m = 5;
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=m;j++){
                if (i==1 || i==n || j==1 || j==m){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        System.out.println();
    }
}
//half pyramid
class Pattern3{
    public Pattern3(){
        int n = 4;
        int m = 5;
        for (int i =1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
// inverted half pyramid
class Pattern4{
    public Pattern4(){
        int n=4;
        int m = 5;
        for (int i=1;i<=n+1;i++){
            for (int j = m;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
class Pattern4_2{
    public Pattern4_2(){
        int n=4;
        int m =5;
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
// inverted half pyramid rotated by 180 degree
class Pattern5{
    public Pattern5(){
        int n=4;
        int m=5;
        for (int i=n+1;i>=1;i--){
            for (int j=1;j<=m;j++){

                if (i==j || j>i){
                    System.out.print("*");
                }
                else if (i!=j){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
class Pattern5_2{
    public Pattern5_2(){
        int n = 4;
        int m  =5;
        for (int i = 1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
// half pyramid rotated by 360 degree

class Pattern6{
    public Pattern6(){
        int n = 4;
        int m = 5;
        for (int i=1;i<=n+1;i++){
            for (int j = 1;j<=m;j++){
                if (i==j || i<j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
//half pyramid numbers
class Pattern7{
    public Pattern7(){
        int n = 5;
        int m = 5;
        for (int i =1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
}

//inverted half pyramid with numbers
class Pattern8{
    public Pattern8(){
        int n = 5;
        int m = 5;
        for (int i =n;i>=1;i--){
            for (int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
}
class Pattern8_2{
    public Pattern8_2(){
        int n = 5;
        int m = 5;
        for (int i =1;i<=n;i++){
            for (int j =1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
}

//floyd's triangle

class Pattern9{
    public Pattern9(){
        int n=5;
        int m=5;
        int k =1;
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=m;j++){
                System.out.print(k+" ");
                k++;
                if (i==j){
                    break;
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
class Pattern9_2{
    public Pattern9_2(){
        int n = 5;
        int m = 1;
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
        System.out.println();
    }
}
// 0-1 Triangle
class Pattern10{
    public Pattern10(){
        int n = 7;
        int m = 1;
        for (int i =1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                if ((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)  ){
                   m=1;
                }
                System.out.print(m+" ");
                m=0;

            }
            System.out.println();
        }
        System.out.println();
    }
}
class Pattern10_2{
    public Pattern10_2(){
        int n = 5;
        int m =5;
        for (int i = 1;i<=n;i++){
            for (int j = 1; j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
public class Video5_9BestPatteren {
    public static void main(String[] args) {
        Pattern1 p1 = new Pattern1();
        Pattern2 p2 = new Pattern2();
        Pattern2_2 p2_2 = new Pattern2_2();
        Pattern3 p3 = new Pattern3();
        Pattern4 p4 = new Pattern4();
        Pattern4_2 p4_2 = new Pattern4_2();
        Pattern5 p5 = new Pattern5();
        Pattern5_2 p5_2 = new Pattern5_2();
        Pattern6 p6 = new Pattern6();
        Pattern7 p7 = new Pattern7();
        Pattern8 p8 = new Pattern8();
        Pattern8_2 p8_2 = new Pattern8_2();
        Pattern9 p9 = new Pattern9();
        Pattern9_2 p9_2 = new Pattern9_2();
        Pattern10 p10 = new Pattern10();
        Pattern10_2 p10_2 = new Pattern10_2();

    }
}