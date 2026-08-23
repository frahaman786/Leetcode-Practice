class Solution {
    public String[] findRelativeRanks(int[] score) {
       HashMap<Integer, String> sol = new HashMap<>();

        
        int[] sorted = score.clone();

      
        Arrays.sort(sorted);

      
        for (int i = sorted.length - 1; i >= 0; i--) {

            int rank = sorted.length - i;

            if (rank == 1) {
                sol.put(sorted[i], "Gold Medal");
            } 
            else if (rank == 2) {
                sol.put(sorted[i], "Silver Medal");
            } 
            else if (rank == 3) {
                sol.put(sorted[i], "Bronze Medal");
            } 
            else {
                sol.put(sorted[i], String.valueOf(rank));
            }
        }

        String[] result = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            result[i] = sol.get(score[i]);
        }

        return result;
    }
}