class removeDuplicates3 {
        public static void main(String args[]) {
                int[] nums = {1, 2, 3, 3, 3, 4, 4, 5};
                int count = 1, m = nums.length - 1;
                for (int i = 0; i < m; i++) {
                        if(nums[count] != nums[i + 1])
				nums[count++] = nums[i];
                }
                System.out.println(count);

                // remember there's a difference in ++ and + 1
		// be wise while choosing
        }
}

