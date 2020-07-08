import java.util.*;
class dec2Bin{

    public static int dec2Bin(int n){
        int bin = 0, pow = 1;
        while(n>0){
            int rem = n%2;
            n = n/2;
            bin = rem*pow + bin;
            pow = pow*10;
        }
        return bin;

    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the decimal number: ");
        int n = scn.nextInt();
        System.out.println(dec2Bin(n));
    }
}