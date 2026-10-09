class Solution {
    public char findTheDifference(String s, String t) {
        int [] freq1=new int [26];
        int [] freq2=new int [26];
        for(char ch:t.toCharArray())
        {
            freq2[ch-'a']++;
        }
        for(char ch:s.toCharArray())
        {
            freq2[ch-'a']--;
        }
        char c='a';
        for(int i=0;i<26;i++)
        {
            if(freq2[i]==1)
            {
                c=(char)(i+'a');
                break;
            }
        }
        return c;
        
    }
}