class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
       Arrays.sort(s);
       int i = 0;
       int k = 0;
       int count = 0;
       while(i < g.length && k < s.length){
            if(g[i] <= s[k]){
                count++;
                i++;
                k++;
            }else{
                k++;
            }
       }
       return count;
    }
}