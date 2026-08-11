public class linear {
    static boolean linearSearch(int arr[] , int num){
        int size=arr.length;
        for(int i=0;i<size;i++){
            if(arr[i]==num){
                return true;
            }
        }
            return false;
            }
            static void main(String []args){
                int arr[]={2,3,4,5};
                int num=4;
                System.out.println(linearSearch(arr,num));
        

    
            }
    
}
