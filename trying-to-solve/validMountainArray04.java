class validMountainArray4 {
        public static void main (String args[]) {
                int[] A = {1, 2, 3, 2, 1};
                int flaginc = 1, flagpivot=1, flagdec = 1, count = 0;
                if (A.length == 0 || A.length == 1) {
                     System.out.println("false");
		     System.exit(0);
		}
                for (int i = 0; i < (A.length - 1); i++) {
                        if(A[i + 1] > A[i])
                                flaginc = 0;
                        else {
                                flagpivot = 0;
                                break;
                        }
                        count++;
                }
                count = count;
                for (int i = count; i < (A.length - 1); i++) {
                        if(A[i + 1] < A[i])  
                                flagdec = 0;
                        else {  
                                flagdec = 1;
                                break;       
                        }
                }
                if (flaginc == 0 && flagdec == 0 && flagpivot == 0)
                        System.out.println("true");
                else
                        System.out.println("false");
                System.out.println(flaginc);
                System.out.println(flagdec);
		System.out.println(flagpivot);
        }
}

