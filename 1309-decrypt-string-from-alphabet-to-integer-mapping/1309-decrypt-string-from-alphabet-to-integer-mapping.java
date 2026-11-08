class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            if (s.charAt(i) == '#') {

                int num = Integer.parseInt(s.substring(i - 2, i));
                ans.append((char) (num + 96));

                i -= 3;
            }
            else {

                int num = s.charAt(i) - '0';
                ans.append((char) (num + 96));

                i--;
            }
        }

        return ans.reverse().toString();
    
    }
}