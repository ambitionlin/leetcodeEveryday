
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String shortString = strs[0];
        int shortStringLen = strs[0].length();
        for(int i=1;i<strs.length;i++){
            if(shortStringLen>strs[i].length()){
                shortString = strs[i];
                shortStringLen = strs[i].length();
            }
        }
        int index = shortStringLen;
        String result = "";
        while (index>0){
            String subString = shortString.substring(0,index);
            boolean isMax = true;
            for(int i=0;i<strs.length;i++){
                if(strs[i].startsWith(subString)==false){
                    isMax = false;
                    break;
                }
            }
            if(isMax){
                result = subString;
                break;
            }
            index--;
        }
        return result;
    }
}