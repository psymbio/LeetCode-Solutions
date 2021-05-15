class removeDuplicates2 {
        public static void main(String args[]) {
                int[] nums = {1, 2, 3, 3, 3, 4, 4, 5};
                int count = 0, m = nums.length - 1;
                for (int i = 0; i <= m; i++) {
                        if(i != 0)
                        if(nums[i] != nums[i--])
                                count++;
                }
                System.out.println(count);

                // couple of things wrong here:
                // I don't get why this program doesn't even run.
                // Like it's so simple and I'm concluding O(n) sucks.
                // Maybe I should shift over to C++ now.
                // It's a better language for competitive coding.
		//
		// Edit: I do get why the program doesn't run
		// I just created hella botched up code
		// Using i as the counter and the comparer and literally everythin
		// bad idea.
		// I guess it's back to using as many flags as physically possibble.
        }
}

