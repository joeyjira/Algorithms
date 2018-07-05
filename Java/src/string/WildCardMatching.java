package string;

class WildCardMatching {
    public boolean isMatch(String s, String p) {
        char nextMatch;
        char nextPattern;
        int j = 0;

        for (int i = 0; i < p.length(); i++) {
            nextMatch = s.charAt(j);
            if (p.charAt(i) == '*') {
                
            }
        }
        
        return true;
    }
}
