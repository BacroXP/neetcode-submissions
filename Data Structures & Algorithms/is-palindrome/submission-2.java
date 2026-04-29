class Solution {
    public boolean isPalindrome(String s) {
        char[] inp = s.strip().replace(" ", "").replace("?", "").replace("!", "")
                      .replace(".", "").replace(",", "").replace("\'", "")
                      .replace(":", "").toCharArray();

        System.out.println(Arrays.toString(inp));

        for(int i = 0; i < inp.length / 2; i++) {
            if (Character.toLowerCase(inp[i]) != Character.toLowerCase(inp[inp.length - i - 1])) return false;
        }

        return true;
    }
}
