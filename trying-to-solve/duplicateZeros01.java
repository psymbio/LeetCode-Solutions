class duplicateZeros {
	public static void main (String args[]) {
		int[] arr = {1, 0, 0, 2, 3, 4, 0};
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				for(int j = n; j >= i; j--) {
					arr[i + 1] = arr[i];
				}
				arr[i] = 0;
				// i++;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}

