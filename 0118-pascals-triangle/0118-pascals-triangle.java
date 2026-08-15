class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int row = 1; row <= numRows; row++){
            List<Integer> curRow = new ArrayList<>();
            for(int col = 1; col <= row; col++){
                int value = nCr(row-1, col-1);
                curRow.add(value);
            }
            result.add(curRow);
        }
        return result;
    }
    private int nCr(int n, int r){
        int res = 1;
        for(int i = 0; i < r; i++){
            res = res*(n-i)/(i+1);
        }
        return res;

     }
    
}