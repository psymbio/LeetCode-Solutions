class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0, j = nums.length-1; i < nums.length; i++) {
                if (nums[i] == val) {
                        int temp = nums[i];
                        nums[i] = -1;
                        nums[i] = temp;
                        j = j - 1;
                        count = count + 1;
                }                                                
        }
        return nums.length - count;
    }
}
