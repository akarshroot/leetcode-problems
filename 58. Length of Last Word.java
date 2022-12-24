class Solution {
    public int lengthOfLastWord(String s) {
        Boolean charFound = false;
        int res = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ' && charFound) return res;
            if(s.charAt(i) == ' ' && !charFound) continue;
            else {
                charFound = true;
                res++;
            }
        }
        return res;
    }
}
