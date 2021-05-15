class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0, k = 0;
        // sorta looks like insertion sort
        for (int i = 0, j = nums.length-1; i < nums.length; i++) {
                if (nums[i] == val) {
                        k = i;
                        while(k < nums.length-1) {
                            nums[k] = -1;
                            k++;
                            count++;
                        }
                }                                                
        }
        return nums.length - count;
    }
}
