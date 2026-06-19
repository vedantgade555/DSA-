package Basic;

public class CountStairWays
{
    public static void main(String[] args)
    {
        System.out.println(countWays(5));
    }
    public static int countWays(int n)
    {
        if(n<=2) return n;
        return countWays(n-1)+countWays(n-2);
    }
}
