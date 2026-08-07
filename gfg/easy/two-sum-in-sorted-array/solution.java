class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        int left=0;
        int n=arr.length;
        int right=arr.length-1;
        ArrayList<Integer> li=new ArrayList<>();
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                li.add(left+1);
                li.add(right+1);
                return li;
            }
            if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        
       
            li.add(-1);
            li.add(-1);
        
        return li;
    }
}