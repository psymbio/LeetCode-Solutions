class merge {
        public static void main (String args[]) {
                int[] nums1 = {1, 2, 3, 0, 0, 0};
		int[] nums2 = {2, 5, 6};
		int m = 3;
		int n = 2;

		for(int i = m+n, j = n; i > 0; ) {
			if (nums2[j] > nums1[i]) {
				nums1[i]=nums1[j];
				i--;
				continue;
			}
			else {
				do {
					if (i < m+n) {
						nums1[i+1] = nums1[i];
					}
				} while(nums2[j] < nums1[i]);
			} nums1[i] = nums2[j];
			j--;
		}

		for(int i = 0; i < m+n; i++)
			System.out.println(nums1[i]);
	}
}
