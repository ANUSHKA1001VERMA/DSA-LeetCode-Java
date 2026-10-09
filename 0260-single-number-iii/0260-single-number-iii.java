class Solution {
    public int[] singleNumber(int[] nums) {
        
        int [] ans = new int [2];
        
        int xor=0;
        for(int num : nums)
        {
            xor^=num;
        }
        int bit = xor&(-xor);
        int a=0;
        int b=0;
        for(int num:nums)
        {
            if((num & bit)==0)
            {
                a^=num;
            }
            else
            {
                b^=num;
            }
        }
        ans[0]=a;
        ans[1]=b;
        return ans;
    }
}