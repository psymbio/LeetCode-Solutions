public static boolean linearSearch(int[] array, int length, int element) {
	if (array == null || length == 0)
		return false;
	for(int i = 0; i < length; i++)
		if(array[i] == element)
			return true;
	return false;
}
class arraySearch {
	public static void main (String args[]) {
		int[] array = new int[6];
		int length = 0;
		for(int i = 0; i < 6; i++) {
			array[length++] = i;
		}
	System.out.println("Is 5 there? " + arraySearch.linearSearch(array, length, 5));
	}
}
