class Solution {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] next = new int[n];
        Arrays.fill(next,0);
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && T[stack.peek()]<T[i]){
                int pop = stack.pop();
                next[pop] = i-pop;
            }
            stack.push(i);
        }
        return next;
    }
}