class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> dupl = new HashMap<>();
        
        for (int num: nums) {
            if (dupl.containsKey(num)) return true;
            dupl.put(num, true);
        }

        return false;
    }
}