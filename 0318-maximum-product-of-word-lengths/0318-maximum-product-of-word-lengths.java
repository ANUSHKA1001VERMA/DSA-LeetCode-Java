class Solution {
    public int maxProduct(String[] words) {
        
        int n=words.length;
        int [] masks = new int[n];
        
        for(int i=0;i<n;i++)
        {
            int mask=0;
            for(char ch : words[i].toCharArray())
            {
                mask=mask|(1<<(ch-'a'));
            }
            masks[i]=mask; 
        }
        
        int maxprod=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((masks[i] & masks[j]) == 0)
                {
                    int prod=words[i].length() * words[j].length();
                    maxprod=Math.max(prod,maxprod);
                }
            }
        }

        return maxprod;
   }
}