class Solution {
    public int findComplement(int n) {

        int temp=n;
        int bits=0;

        while(temp>0)
        {
            bits++;
            temp=temp>>1;
        }

        for(int i=0;i<bits;i++)
        {
            n=n^(1<<i);
        }

        return n;
        
    }
}