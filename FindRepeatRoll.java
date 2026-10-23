

public class FindRepeatRoll {
    

    public static void main(String arg[]){


        int roll[]={1,2,3,4,1};

        

        boolean a=false;
        for(int i=0;i<roll.length;i++){
           for(int j=i+1;j<roll.length;j++){
                if(roll[j]<=roll[i]){
                    a=true;
                    break;
                }
                
                
           }
        
          
        }
         System.out.println(a);
    }
}
