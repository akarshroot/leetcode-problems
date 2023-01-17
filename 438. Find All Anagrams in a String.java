class Solution {
    static Boolean checkAnagram(String  s, int l, int r, HashMap<Character, Integer> sMap, HashMap<Character, Integer> pMap) {
        if(sMap.getOrDefault(s.charAt(l), 0) == 1) sMap.remove(s.charAt(l));
        else sMap.put(s.charAt(l), sMap.get(s.charAt(l)) - 1);
        if(r + 1 < s.length()) sMap.put(s.charAt(r + 1), sMap.getOrDefault(s.charAt(r + 1), 0) + 1);
        return sMap.equals(pMap);
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length() < p.length()) return res;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> pMap = new HashMap<>();
        for(int i = 0; i<p.length(); i++) {
            char currentCharS = s.charAt(i);
            char currentCharP = p.charAt(i);
            sMap.put(currentCharS, sMap.getOrDefault(currentCharS, 0) + 1);
            pMap.put(currentCharP, pMap.getOrDefault(currentCharP, 0) + 1);
        }
        if(sMap.equals(pMap)) {
            res.add(0);
        }
        int i = 0;
        int j = i + p.length() - 1;
        while(i < (s.length() - p.length())) {
            char currentChar = s.charAt(i);
            if(checkAnagram(s, i, j, sMap, pMap)) {
                res.add(i + 1);
            }
            i++;
            j++;
        }
        return res;
    }
}
