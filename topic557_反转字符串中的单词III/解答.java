class Solution {
    public String reverseWords(String s) {
        if(s==null||s.length()==0){
            return s;
        }
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i=0;i<words.length;i++){
            StringBuilder reverseword = new StringBuilder(words[i]);
            result.append(reverseword.reverse()+" ");
        }
        return result.toString().trim();
    }
}