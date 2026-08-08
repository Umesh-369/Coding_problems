class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n=arr.length;
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            ans=Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}
