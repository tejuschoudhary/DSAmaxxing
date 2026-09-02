public class sortcolor {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int left=0;
        int mid=0;
        int right=n-1;
        while(mid<=right){
            if(nums[mid]==0){
                nums[mid]=nums[left];
                nums[left]=0;
                left++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                nums[mid]=nums[right];
                nums[right]=2;
                right--;
            }
        }


        // int zero=0;
        // int one=0;
        // int two=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==0){
        //         zero++;
        //     }
        //     else if(nums[i]==1){
        //         one++;
        //     }
        //     else{
        //         two++;
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     if(zero>0){
        //         nums[i]=0;
        //         zero--;
        //     }
        //     else if(one>0){
        //         nums[i]=1;
        //         one--;
        //     }
        //     else{
        //         nums[i]=2;
        //         two--;
        //     }
        // }
        
    }
}
}
