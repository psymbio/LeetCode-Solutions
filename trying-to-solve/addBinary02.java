class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length(), j = b.length(), carry = 0, sum = 0, p = 0, q = 0;
        while (i > 0 || j > 0) {
            sum = carry;
            if (i > 0 && i < a.length())
                p = a.charAt(i) - '0';
            if (j > 0 && j < b.length())
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

	// this solution exceeds the time limit though
	// sigh...
	//
	// oh, just realized I put in j++ and i++ instead of j-- and i--
	// man, am I dumb
    }
}
