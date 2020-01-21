class Solution {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] out = new int[n];
        Arrays.fill(out,0);
        for(int i=0;i<n;i++){
            int t = T[i];
            for(int j = i+1;j<n;j++){
                if(T[j]>t){
                    out[i]=j-i;
                    break;
                }
            }
        }
        return out;
    }
}