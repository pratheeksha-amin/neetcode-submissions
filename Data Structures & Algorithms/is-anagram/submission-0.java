class Solution {
    public boolean isAnagram(String s, String t) {
        int len=s.length();
        int len2=t.length();
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        char arr2[]=t.toCharArray();
        Arrays.sort(arr2);
        if(Arrays.equals(arr, arr2))
        {
            return true;
        }
        else
        {
            return false;
        }

        


    }
}
