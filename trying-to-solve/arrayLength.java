class arrayLength {
	public static void main() {
		int[] array = new int[6];
		int length = 0;
		for (int i = 0; i < 3; i++) {
			array[i] = i * i;
			length++;
		}
		System.out.println("The array has capacity of " + array.length);
		System.out.println("The array has a length of " + length);
	}
}


