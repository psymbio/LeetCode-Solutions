class mergeSorted {
        public static void main (String arg[]) {
                int[] nums1 = {1, 2, 3, 0, 0, 0};
                int[] nums2 = {2, 5, 6};
                        for (int i = 0, j = 0; i < nums1.length; i++, j++) {
				if (nums2[j] < nums1[i])
					for(int k = nums1.length; k > i; k--)
						nums1[k + 1] = nums1[k];
				nums1[i] = nums2[j];
                }
                for (int i = 0; i < n; i++)
                        System.out.println(nums1[i]);
        }
}

