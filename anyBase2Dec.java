import java.util.Scanner;
class anyBase2Dec{

    public static int anyBase2Dec(int sb, int n){
        int bin =0, pow =1;
        while(n>0){
            int rem = n%10;
            n = n/10;

            bin = rem*pow + bin;
            pow = pow*sb;
        }
        return bin;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the Source Base: ");
        int sb = scn.nextInt();
        System.out.print("enter the number in sb: ");
        int n = scn.nextInt();
        System.out.println(anyBase2Dec(sb, n));
    }
}