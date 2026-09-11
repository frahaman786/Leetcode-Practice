class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> sol = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sol.put(arr[i], sol.getOrDefault(arr[i], 0) + 1);
        }

        int largest = -1;

        for (Map.Entry<Integer, Integer> ans : sol.entrySet()) {
            if (ans.getKey().equals(ans.getValue())) {
                largest = Math.max(largest, ans.getKey());
            }
        }

        return largest;
    }
    
}