class Armstrong{
    public static void main(String[] args){
        int num = 153;
         int ori=num;
        int sum=0;
       
        while(num!=0){
            int digit = num%10;
            sum+= Math.pow(digit,3);
            num = num/10;
        }

        if(ori==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}