package tmall;

import java.util.*;

class Solution {
    public String addBinary(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int i = lenA-1, j = lenB-1;
        int carry = 0;
        StringBuilder result = new StringBuilder("");
        while (i>=0||j>=0){
            int tmpA , tmpB;
            if(i>=0){
                tmpA = a.charAt(i)-'0';
                i--;
            }else{
                tmpA=0;
            }
            if(j>=0){
                tmpB = b.charAt(j)-'0';
                j--;
            }else {
                tmpB=0;
            }
            int sum = tmpA+tmpB+carry;
            result.append(sum%2);
            carry = sum/2;
        }
        if(carry==1){
            result.append(1);
        }
        return result.reverse().toString();
    }
}