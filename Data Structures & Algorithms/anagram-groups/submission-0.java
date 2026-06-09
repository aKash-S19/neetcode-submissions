class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] s1=s.toCharArray();
            Arrays.sort(s1);
            String newString = new String(s1);
            map.putIfAbsent(newString,new ArrayList<>());
            map.get(newString).add(s);
        }
        return new ArrayList<>(map.values());
    }
}