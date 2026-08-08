class Solution {
    int stockBuySell(int arr[]) {
        int minprice=Integer.MAX_VALUE;
        int n=arr.length;
        int ans=0;
        for(int i=1;i<n;i++){
           if(arr[i]>arr[i-1]){
               ans+=arr[i]-arr[i-1];
           }
        }
        return ans;
    }
}
