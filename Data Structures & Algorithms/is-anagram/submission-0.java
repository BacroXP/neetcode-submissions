class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c: s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (char c: t.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) - 1);
        }

        for (int i: hm.values()) {
            if (i != 0) return false;
        }

        return true;
    }
}
