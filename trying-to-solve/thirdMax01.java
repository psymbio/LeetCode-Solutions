class Solution {
    public int thirdMax(int[] nums) {
        int max = nums[0], max2 = nums[0], max3= nums[0];
        if(nums.length < 3) {
            for (int i = 0; i < nums.length; i++) {
                if (max < nums[i])
                    max = nums[i];
            }
            return max;
        }
	// can't understand why this doesn't work
        else {
            for (int i = 0; i < nums.length; i++) {
                if (max < nums[i])
                    max = nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                if (max2 < nums[i] && max2 < max)
                    max2 = nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                if (max3 < nums[i] && max3 < max && max3 < max2) 
                    max3 = nums[i];
            }
            // not max3 != max2 but max3 < max2
            return max3;
        }
    }
}
