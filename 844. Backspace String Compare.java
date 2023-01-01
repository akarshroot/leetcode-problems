class Solution {
    public boolean backspaceCompare(String s, String t) {
        LinkedList<Character> finalS = new LinkedList<>();
        LinkedList<Character> finalT = new LinkedList<>();
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == '#') {
                if(!finalS.isEmpty()) finalS.pop();
            }
            else {
                finalS.push(s.charAt(i));
            }
        }
        for(int i = 0; i<t.length(); i++) {
            if(t.charAt(i) == '#') {
                if(!finalT.isEmpty()) finalT.pop();
            }
            else {
                finalT.push(t.charAt(i));
            }
        }
        if(finalS.size() != finalT.size()) return false;
        for(int i = 0; i < finalS.size(); i++) {
            if(finalS.get(i) != finalT.get(i)) return false;
        }
        return true;
    }
}
