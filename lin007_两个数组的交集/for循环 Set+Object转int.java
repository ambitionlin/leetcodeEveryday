
import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>  set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(set1.contains(nums2[j])){
                set2.add(nums2[j]);
            }
        }

        Object[] intRes = set2.toArray();
        int[] result = new int[intRes.length];
        for(int i=0;i<intRes.length;i++){
            result[i] = (int) intRes[i];
        }
        return result;
    }
}