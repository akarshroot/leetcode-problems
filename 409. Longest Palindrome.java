class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int evens = 0;
        int odds = 0;
        for(char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int maxOdd = 0;
        int numOdds = 0;
        for(Map.Entry<Character, Integer> x : map.entrySet()) {
            int i = x.getValue();
            if(i%2 == 0) {
                evens += i;
            } 
            else {
                if(i > maxOdd) maxOdd = i;
                numOdds++;
                odds += i;
            }
        }
        if(evens == 0) return odds - numOdds + 1;
        return odds == 0 ? evens : evens + odds - numOdds + 1;
    }
}
