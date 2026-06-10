class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] str1 = str.toCharArray();
        char[] str2 = new char[str1.length];
        for (int i = 0; i < str1.length; i++) {
            str2[i] = str1[str1.length - 1 - i];
        }
        return Arrays.equals(str1, str2);
    }
}
