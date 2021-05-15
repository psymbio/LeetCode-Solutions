class maxOnes {
	public static void main (String args[]) {
		int[] array = {1, 1, 1, 0, 1, 1, 1, 1, 0, 1};
		int count = 0;
		int max = 0;
		for (int i = 0; i < array.length; i++ ) {
			if(array[i] == 1) {
				count++;
				continue;
			}
			if(count > max)
				max = count;
			if(array[i] == 0)
				count = 0;
		}
		System.out.println(max);
	}
}
