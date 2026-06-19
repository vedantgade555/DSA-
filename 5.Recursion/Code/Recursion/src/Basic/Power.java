package Basic;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Base");
        int a = sc.nextInt();
        System.out.println("Enter a Exponent");
        int b = sc.nextInt();
        System.out.println(a+" raised to power of "+b+"is "+pow(a,b));
    }

//    public static int pow(int a,int n){
//        if(n==0) return 1;
//        return a*pow(a,n-1);
//    }

    public static int pow(int a,int b){
        if(b==0) return 1;
        int ans=pow(a,b/2);
        if(b%2==0) return ans*ans;
        else return a*ans*ans;
    }
}
