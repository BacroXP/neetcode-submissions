class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = s.length();

        for (int j = 0; j < t.length(); j++) {
            if (i == 0) return true;
            if (t.charAt(t.length() - j - 1) == s.charAt(i - 1)) i--;
        }

        return (i == 0);
    }
}