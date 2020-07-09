import java.util.Scanner;

class octalAddition{

    public static int octalAddition(int num1, int num2){
        int carry = 0, bin=0, pow=1;
        while(num1!=0 || num2!=0 || carry !=0){
            int rem1 = num1%10;
            num1 = num1/10;
            int rem2 = num2%10;
            num2 = num2/10;
            int rem = rem1+rem2+carry;
            carry = rem/8;
            rem = rem%8;
            bin  = bin + rem*pow;
            pow = pow*10;
        }
        return bin;
        

    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.println(octalAddition(num1, num2));
    }
}