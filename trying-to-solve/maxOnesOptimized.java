class maxOnesOptimized {
        public static void main (String args[]) {
                int[] nums = {0, 1, 0, 0, 1, 0};
                int max = 0, maxHere = 0;
		for (int n : nums)
			max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
		System.out.println(max);

        }
}

