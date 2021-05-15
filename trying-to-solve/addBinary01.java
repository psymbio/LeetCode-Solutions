class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0, carry = 0, sum = 0, p = 0, q = 0;
	// need to figure out why this doesn't work
	//
	// Edit: I just figured it out
	// We need to add strings starting from the end
	// 
        while (i < (a.length()-1) || j < (b.length()-1)) {
            sum = carry;
            if (i > -1)
                p = a.charAt(i) - '0';
            if (j > -1)
                q = b.charAt(j) - '0';
            sum = (p + q) % 2;
            carry = (p + q) / 2;
            sb.append(sum);
            i++;
            j++;
        }
        if(carry==1) sb.append(carry);
        sb.reverse();
        String ans = sb.toString();
        return ans;
    }
}
