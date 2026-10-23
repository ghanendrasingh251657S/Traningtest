public class BuyandSell {
    public static void main(String[] args) {
        int max=0;
        int result=0;
        int prices[]={7,1,5,6,0};
        for(int i=0;i<prices.length;i++){
            max=0;
            for(int j=i+1;j<prices.length;j++){
                
                if(prices[j]>prices[i]){
                    max=prices[j]-prices[i];

                   
                }
                 if(result<max){
                    result=max;
                    }
                
            }
        }
        System.out.println(result);
        // result is a profit. 
    }
}
