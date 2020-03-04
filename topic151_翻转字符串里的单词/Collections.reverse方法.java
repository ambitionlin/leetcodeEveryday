class Solution {
    public String reverseWords(String s) {
        if(s==null||s.length()==0){
            return s;
        }
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ",words);
    }
}