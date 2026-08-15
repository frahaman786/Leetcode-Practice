class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        for (int r = 0; r <= rowIndex; r++) {
            ans.add((int)nCr(rowIndex, r));
        }

        return ans;
    }

    public long nCr(int n, int r) {
        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i) / (i + 1);
        }

        return res;
    }
    
}