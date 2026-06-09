class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        else{
            int[] arr = new int[26];

            for(char c : s.toCharArray()){
                arr[c - 'a']++;
            }
            for (char p : t.toCharArray()){
                arr[p - 'a']--;
            }
            for(int num : arr){
                if(num != 0){
                    return false;
                }
            }
            return true;

        }
    }
}
