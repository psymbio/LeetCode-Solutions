class merge2 {
        public static void main (String args[]) {
                int[] nums1 = {1, 2, 3, 0, 0, 0};
                int[] nums2 = {2, 5, 6};
                int m = 3;
                int n = 2;
		int f = m;
		int i = 0, j = 0;

                while(i < m+n && j < n) {
			if(nums2[j] > nums1[i])
				nums1[f++] = nums2[j];
			/*else {
                                do {
                                        if (i < m+n) {
                                                nums1[i+1] = nums1[i];
                                        }
                                } while(nums2[j] < nums1[i]);
			}*/
		}
                for(i = 0; i < m; i++)
                        System.out.println(nums1[i]);
        }
}

