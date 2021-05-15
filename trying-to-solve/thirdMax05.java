class Solution {
    public int thirdMax(int[] nums) {
        // change
        Integer max = null, max2 = null, max3= null;
                for (Integer i : nums) {
                    if(i.equals(max) || i.equals(max2) || i.equals(max3)) continue;
                        if (max == null || i > max) {
                                max3 = max2;
                                max2 = max;
                                max = i;
                        }

                        else if (max2 == null || i > max2) {
                                max3 = max2;
                                max2 = i;
                        }

                        else if(max2 == null || i > max3) {
                                max3 = i;
                        }
                }
        // replaced all nums[i] with i because I changed the loop to for(Integer i: nums)
        return max3 == null? max : max3;
}
}
