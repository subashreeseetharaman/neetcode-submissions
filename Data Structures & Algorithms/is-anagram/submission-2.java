public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] Sort1 = s.toCharArray();
        char[] Sort2 = t.toCharArray();
        Arrays.sort(Sort1);
        Arrays.sort(Sort2);
        return Arrays.equals(Sort1, Sort2);
    }
}