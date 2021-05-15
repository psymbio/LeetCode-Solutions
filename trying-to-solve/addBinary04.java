class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0, sum = 0, p = 0, q = 0;
        // duh, there were some stupid as shit errors like a.length "- 1"
	// i ">=" 0
	//
	// I still don't get the whole array number shenanigans
	// so many stupid array index out of bounds errors you can potentially run into
	// it's like so problematic and on the other hand I haven't had someone explain all this noob stuff.
	//
	//
	// also, this answer wasn't accepted either
	while (i >= 0 || j >= 0) {
            sum = carry;
            if (i >= 0 && i < a.length())
                p = a.charAt(i) - '0';
            if (j >= 0 && j < b.length())
                q = b.charAt(j) - '0';
            sum = (p + q) % 2;
            carry = (p + q) / 2;
            sb.append(sum);
            i--;
            j--;
        }
        if(carry==1) sb.append(carry);
        sb.reverse();
        String ans = sb.toString();
        return ans;
    }
}
