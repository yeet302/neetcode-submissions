class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        for(int i =0; i< s.length(); i++) {
            mapS.put(
                s.charAt(i), 
                mapS.getOrDefault(s.charAt(i), 0) + 1
            );
        }

        HashMap<Character, Integer> mapT = new HashMap<>();
        for(int j =0; j < t.length(); j++) {
            mapT.put(t.charAt(j), mapT.getOrDefault(t.charAt(j), 0) +1);
        }

        return mapS.equals(mapT);
    }
}
