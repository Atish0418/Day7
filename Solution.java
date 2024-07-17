package Day7;

// Valid Anagram
class Solution {
    public boolean isAnagram(String s1, String s2) {
        
        int[] f1 = new int[26];
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            f1[ch - 'a']++;
        }

        int[] f2 = new int[26];
        for(int i=0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            f2[ch - 'a']++;
        }

        for(int i=0; i<26; i++){
            if(f1[i] != f2[i]){
                return false;
            }
        }
        return true;
    }
}
