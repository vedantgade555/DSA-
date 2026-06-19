package Basic;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(10,20));
    }

//    public static int gcd(int a, int b) {
//        int hcf=1;
//        for(int i=2;i<Math.min(a,b);i++)
//        {
//            if(a%i==0 && b%i==0)
//            {
//                hcf=i;
//            }
//        }
//        return hcf;
//    }

//    Using Recursion

    public static int gcd(int a, int b) {
        if(a==0) return b;
        return gcd(b%a,a);
    }
}

