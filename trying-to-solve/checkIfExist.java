public class checkIfExist {
    public static void main(String args[]) {
        	int[] array = new int[6];
        	int length = 0;
        	for (int i = 0; i < 6; i++) {
            		array[length++] = i;
        	}
	}
    System.out.println(exists(array));
}

public static boolean exists(int[] array) {
        if (array == null || array.length == 0)
            return false;

        for (int i = 0; i < array.length; i++)
            for(int j = 0; j < array.length; j++)
		    if(i != j)
		    	if(array[i] == 2 * array[j] || arr[j] == 2 * arr[i])
			    return true;
        
	return false;
    }
}

