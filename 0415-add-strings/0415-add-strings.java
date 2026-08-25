class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sol = new StringBuilder();
        int carry = 0;
        int k = num1.length() - 1;
        int m = num2.length() - 1;
        while(k >= 0 || m >= 0){
            int sum = carry;
            if(k >= 0){
                sum += num1.charAt(k) - '0';       

                k--;
            }
            if(m >= 0){
                sum += num2.charAt(m) - '0';
                m--;
            }
            sol.append(sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            sol.append(carry);
        }
        sol.reverse();
        return sol.toString();
    }
}