class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {

            res[i] = -1; // default: no greater element

            for (int j = 0; j < m; j++) {

                if (nums1[i] == nums2[j]) {

                    // Check elements to the right
                    for (int k = j + 1; k < m; k++) {

                        if (nums2[k] > nums2[j]) {
                            res[i] = nums2[k];
                            break;
                        }
                    }

                    // We found nums1[i], so stop searching nums2
                    break;
                }
            }
        }

        return res;
    }
}