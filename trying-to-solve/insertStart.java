class insertStart {
	public static void main (String args[]) {
		int[] array = new int[10];
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;
		array[5] = 5;
		for (int i = 6; i >= 0; i--) {
			array[i + 1] = array[i];
		}
		array[0] = -1;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
