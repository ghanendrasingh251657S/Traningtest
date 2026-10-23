public class BestPair {
    

      public static void main(String[] arg){
        int nums[]={11,7,2,15};
       int n=nums.length;
       int index=0;
       int index2=0;

        int target=9;
        for(int i=0;i<nums.length;i++){
           for(int j=0;j<n;j++){
            if(target==nums[i]+nums[j]){
               // System.out.println(i + " "+ j);
                 index=i;
                 index2=j;
            }
           }
        }
        System.out.println(" The target indexes :-   "+index +" , "+ index2 );
        



    }
}
