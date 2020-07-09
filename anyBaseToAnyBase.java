import java.util.Scanner;

class anyBaseToAnyBase{

    public static int anyBaseToDec(int sb, int n){
        int bin =0, pow =1;
        while(n>0){
            int rem = n%10;
            n = n/10;

            bin = bin + rem*pow;
            pow = pow*sb;
        }
        return bin;
    }

    public static int decToAnyBase(int n, int db){
        int bin = 0, pow=1;
        while(n>0){
            int rem = n%db;
            n = n/db;
            bin  = bin + rem*pow;
            pow = pow*10;
        }

        return bin;
    }

    public static void anyBaseToAnyBase(int sb, int db, int n){
        int decN = anyBaseToDec(sb, n);
        int ans = decToAnyBase(decN, db);
        System.out.println(ans);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Source Base: ");
        int sb = scn.nextInt();
        System.out.print("Enter the Destination Base: ");
        int db = scn.nextInt();
        System.out.print("Enter the number in sb: ");
        int n = scn.nextInt();
        anyBaseToAnyBase(sb, db, n);
    }
}