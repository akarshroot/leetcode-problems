class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        String res = "";
        while(i >= 0 && j >= 0) {
            int sum =  (num1.charAt(i) - '0') + (num2.charAt(j) - '0');
            if(carry > 0) {
                sum += carry;
                carry = 0;
            }
            if(sum > 9) {
                carry = sum/10;
                sum %= 10;
            }
            res = Integer.toString(sum) + res;
            i--;
            j--;
        }
        while(i >= 0) {
            int sum = num1.charAt(i) - '0';
            if(carry > 0) {
                sum += carry;
                carry = 0;
            }
            if(sum > 9) {
                carry = sum/10;
                sum %= 10;
            }
            res = Integer.toString(sum) + res;
            i--;
        }
        while(j >= 0) {
            int sum = num2.charAt(j) - '0';
            if(carry > 0) {
                sum += carry;
                carry = 0;
            }
            if(sum > 9) {
                carry = sum/10;
                sum %= 10;
            }
            res = Integer.toString(sum) + res;
            j--;
        }
        if(carry > 0) res = carry + res;
        return res;

    }
}
