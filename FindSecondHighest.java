public class FindSecondHighest {
    
    public static void main(String []arg){
        int arr[]={1,3,5};

        int max=arr[0];
        int prev=0;

        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                prev=max;
            }
            max=arr[i];
        }
        System.out.print(prev);
    }

}