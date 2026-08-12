class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] temp = new int[encoded.length + 1];
        temp[0] = first;
        int k = 0;
        for(int i = 1; i < temp.length; i++){
            
            temp[i] = temp[i-1] ^ encoded[k];
            k++;

        }
        return temp;
    }
}