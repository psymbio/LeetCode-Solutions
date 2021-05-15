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

	else {
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

			else(nums[i] > max3) {
				max3 = nums[i];
			}
		}
	}
	// AAAHHHH! this solution doesn't cut it either... Am I missing somthing???
	//
	// I know I shouldn't quit but fuck, it's such a simple problem
	// I'm gonna head over to the discussion section
	return max3;
}
}



