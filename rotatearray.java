class rotatearray {
    public int[] rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        int ans[]=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=nums[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=nums[i];
        }
        return ans;
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
     public void reverse(int []nums,int st,int end){
            while(st<=end){
                int temp=nums[st];
                nums[st]=nums[end];
                nums[end]=temp;
                st++;
                end--;
            }

        }

        
}
        
    }
}