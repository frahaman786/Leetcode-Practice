class Solution {
    public String reverseStr(String s, int k) {
        char[] sol = s.toCharArray();
        int n = sol.length;
        for(int i = 0; i < n; i+= 2*k){
            int first = i;
            int end = Math.min(i+k-1, n-1);

            while(first < end){
                char temp = sol[first];
                sol[first] = sol[end];
                sol[end] = temp;

                first++;
                end--;
            }
        }
        return new String(sol);
    }
}