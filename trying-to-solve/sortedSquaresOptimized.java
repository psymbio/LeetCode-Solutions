class sortedSquaresOptimized {
	public static void main (String args[]) {
		int[] A = {2, 4, 3, -7, 0};
		int n = A.length;
		int[] result = new int[n];
		int i = 0, j = n-1;
		for (int p = n-1; p >= 0; p--) {
			if (Math.abs(A[i]) > Math.abs(A[j])) {
				result[p] = A[i] * A[i];
				i++;
			}
			else {
				result[p] = A[j] * A[j];
				j--;
			}
		}
		for (int k = 0; k < n; k++) {
			System.out.println(result[k]);
		}
	}
}
