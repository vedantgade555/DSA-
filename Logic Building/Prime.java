class Prime{
    public static void main(String[] args){
        int num=5;
        int flag=0;

        for(int i=2;i<num/2;i++){
            if(num%i==0){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("Prime");
        }
        else{
             System.out.println("Not Prime");
        }
    }
}