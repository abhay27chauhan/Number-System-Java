import java.util.Scanner;
class dec2AnyBase{

    public static int dec2AnyBase(int n, int dB){
        int bin = 0, pow=1;
        while(n>0){
            int rem = n%dB;
            n = n/dB;
            bin = rem*pow + bin;
            pow = pow*10;
        }
        return bin;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the decimal number: ");
        int n = scn.nextInt();
        System.out.print("enter the Destination Base: ");
        int dest = scn.nextInt();
        System.out.println(dec2AnyBase(n, dest));
    }
}