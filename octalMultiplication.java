import java.util.Scanner;

class octalMultiplication{

    public static int prdWithSingleDigit(int n1, int d2){
        int carry = 0, bin=0, pow=1;
        while(n1>0 || carry>0){
            int d1 = n1%10;
            n1 /= 10;
            int pd = d1*d2;
            pd = pd +carry;
            carry = pd/8;
            pd = pd%8;
            bin = bin + pd*pow;
            pow = pow*10;
        } return bin;
    }

    public static int octalAddition(int n1, int n2){
        int carry=0, bin=0, pow=1;
        while(n1>0 || n2>0 || carry>0){
            int rem1 = n1%10;
            int rem2 = n2%10;
            n1 /= 10;
            n2 /= 10;

            int rem = rem1 + rem2 + carry;
            carry = rem/8;
            rem = rem%8;

            bin = bin + rem*pow;
            pow= pow*10;
        } return bin;
    }

    public static int octalMultiplication(int n1, int n2){
        int ans = 0, pow=1;
        while(n2>0){
            int d2 = n2%10;
            n2 /= 10;
            int sprd = prdWithSingleDigit(n1, d2);
            ans  = octalAddition(ans, sprd*pow);
            pow =pow*10;
        } return ans;
        
        
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.println(octalMultiplication(num1, num2));
        
    }
}