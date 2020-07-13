import java.util.Scanner;

class octalSubtraction{

    public static int octalSubtraction(int n1, int n2){
        int carry = 0, bin=0, pow=1;
        while(n1>0){
            int rem1 = n1%10;
            int rem2 = n2%10;
            n1 /= 10;
            n2 /=10;
            rem1 = rem1 +carry;
            int rem = 0;
            if(rem1>=rem2){
                carry =0;
                rem = rem1-rem2;
            }else{
                carry = -1;
                rem = rem1+8-rem2;
            }
            bin = bin + rem*pow;
            pow=pow*10;
        } return bin;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        if(num1>num2){
            System.out.println(octalSubtraction(num1, num2));
        }else{
            System.out.println(octalSubtraction(num2, num1));
        }
        
    }
}