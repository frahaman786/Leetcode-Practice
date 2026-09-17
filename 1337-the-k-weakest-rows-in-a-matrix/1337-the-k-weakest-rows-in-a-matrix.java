class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < mat.length; i++){
            map.put(i, 0);
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    map.put(i, map.get(i)+ 1);
                }
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> {
            if(a.getValue() != b.getValue()){
                return a.getValue() - b.getValue();
            }
            return a.getKey() - b.getKey();
        });
        int[] answer = new int[k];
        for(int i = 0; i < k; i++){
            answer[i] = list.get(i).getKey();
        }
        return answer;


    }
}