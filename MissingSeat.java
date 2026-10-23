class MissingSeat{
    public static void main(String[] arg){
        int nums[]={3,0,1};
       int n=nums.length;

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int wholesum=(n*(n+1)/2);

        int output=wholesum-sum;

        System.out.println(output);



    }
}