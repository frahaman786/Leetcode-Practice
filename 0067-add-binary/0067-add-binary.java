class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sol = new StringBuilder();
        
        
        int k = a.length() - 1; //for a
        int m = b.length() - 1; //for b
        int carry = 0;

        while(k >= 0 || m >= 0 || carry > 0){
            int sum = carry;
            if(k >= 0){
                sum += a.charAt(k) - '0';
                k--;
            }
            if(m >= 0){
                sum += b.charAt(m) - '0';
                m--;
            }
            sol.append(sum % 2);
            carry = sum/2;
        }
        return sol.reverse().toString();
    }
}