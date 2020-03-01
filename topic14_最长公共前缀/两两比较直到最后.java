class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String longestCommmonStr = strs[0];
        for(int i=1;i<strs.length;i++){
            while (strs[i].indexOf(longestCommmonStr)!=0){
                longestCommmonStr = longestCommmonStr.substring(0,longestCommmonStr.length()-1);
                if(longestCommmonStr.length()==0){
                    return  "";
                }
            }
        }
        return longestCommmonStr;
    }
}