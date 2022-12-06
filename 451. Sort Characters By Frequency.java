class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            else    
                map.put(s.charAt(i), 1);            
        }
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        
        map.entrySet().stream().sorted(Map.Entry.comparingByValue().reversed()).forEach(System.out::println)
        Collections.sort(list, (e1, e2) -> e2.getValue() - e1.getValue());
        
        String res = "";
        for(Map.Entry<Character, Integer> e : list) {
            for(int i = 0; i<e.getValue(); i++) res += e.getKey();
        }
        return res;
    }
}
