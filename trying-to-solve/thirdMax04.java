class Solution {
    public int thirdMax(int[] nums) {
        // change
        Integer max = null, max2 = null, max3= null;
                for (int i = 0; i < nums.length; i++) {
                        if (nums[i] > max) {
                                max3 = max2;
                                max2 = max;
                                max = nums[i];
                        }

                        else if (nums[i] > max2) {
                                max3 = max2;
                                max2 = nums[i];
                        }

                        else if(nums[i] > max3) {
                                max3 = nums[i];
                        }
                }
        // Null pointer exception, ftw
        return max3 == null? max : max3;
}
}

