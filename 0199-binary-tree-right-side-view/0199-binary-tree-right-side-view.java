/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> store = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        store.offer(root);
        while(!store.isEmpty()){
            int size = store.size();
            while(size > 0){
                TreeNode node = store.poll();
                if(node.left != null){
                    store.offer(node.left);
                }
                 if(node.right != null){
                    store.offer(node.right);
                }
                size--;
                if(size == 0){
                    res.add(node.val);
                }
            }
        }
        return res;
    }
}