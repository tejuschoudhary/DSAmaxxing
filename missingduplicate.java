//missing element from an array of duplicates
import java.util.ArrayList;
import java.util.List;

public class missingduplicate {
    static List<Integer> missing(int []arr){
        List<Integer> res=new ArrayList<>();
        int n=arr.length;
        //index marking 
        for(int i=0;i<n;i++){
            int value=Math.abs(arr[i]);
            int pos=value-1;

            if(arr[pos]>0){
                arr[pos]=-arr[pos];
            }
        }
        //adding element in array which is not present
        for(int j=0;j<n;j++){
                if(arr[j]>0){
                    res.add(j+1);
                }
            }
        
        return res;

    }
    public static void main(String[] args) {
        int arr[]={4,4,2,3};
       System.out.println( missing(arr));


    }

    
}

