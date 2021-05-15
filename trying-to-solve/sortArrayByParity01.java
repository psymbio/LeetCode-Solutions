class Solution {
    public int[] sortArrayByParity(int[] A) {
	int temp, j = 0;
	// the thing about this question is knowing you need a
	// new counter like j
	//
	// how I thought about it was whenever you encounter an
	// even integer just swap it with a place before except
	// even that place before needs a shifting counter.
	// pretty easy question
	//
	// I'm gonna optimize the swapping little more
        for (int i = 0; i <= A.length; i++) {
		if (A[i] % 2 == 0) {
			temp = A[j];
			A[j] = A[i];
			A[i] = temp;
			j++;
		}
		
		// this XOR techniques doesn't work for all cases
		/*
		if (A[i] % 2 == 0) {
                        A[j] = A[j] ^ A[i];
                        A[i] = A[j] ^ A[i];
                        A[j] = A[j] ^ A[i];
                        j++;
                }
		*/
	}
	return A;
    }
}

