class removeDuplicates {
	public static void main(String args[]) {
		int[] nums = {1, 2, 3, 3, 3, 4, 4, 5};
		int count = 1, m = nums.length - 1;
		for (int i = 0; i <= m; i++) {
			if(i != 0)
			if(nums[count] != nums[i])
				count++;
		}
		System.out.println(count);

		// couple of things wrong here:
		// I don't get why this program doesn't even run.
		// Like it's so simple and I'm concluding O(n) sucks.
		// Maybe I should shift over to C++ now.
		// It's a better language for competitive coding.
	}
}
