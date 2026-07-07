class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>>map=new HashMap<>();
        for(String str:strs)
        {
            char[] ch=str.toCharArray();
            Arrays.sort(ch);

            String value=new String(ch);
            if(!map.containsKey(value))
            {
                map.put(value,new ArrayList<>());
            }
            map.get(value).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}
