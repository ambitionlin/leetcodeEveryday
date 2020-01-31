/**总体思路与辅助栈法一致，不同点在于将 [ 和 ] 分别作为递归的开启与终止条件：
*	当 s[i] == ']' 时，返回当前括号内记录的 res 字符串与 ] 的索引 i （更新上层递归指针位置）；
*	当 s[i] == '[' 时，开启新一层递归，记录此 [...] 内字符串 tmp 和递归后的最新索引 i，并执行 res + multi * tmp 拼接字符串。
*	遍历完毕后返回 res。
*
*复杂度分析：
*	时间复杂度 O(N)O(N)，递归会更新索引，因此实际上还是一次遍历 s；
*	空间复杂度 O(N)O(N)，极端情况下递归深度将会达到线性级别。
*/

public class Solution{
    public String decodeString(String s){
        return dfs(s,0)[0];
    }
    public String[] dfs(String s, int i){
        StringBuilder res = new StringBuilder();
        int multi = 0;
        while(i<s.length()){
            char c = s.charAt(i);
            if(c>='0'&&c<='9'){
                multi = multi*10+Integer.parseInt(String.valueOf(c));
            }else if(c=='['){
                String[] tmp = dfs(s,i+1);
                i = Integer.parseInt(tmp[0]);
                while(multi>0){
                    res.append(tmp[1]);
                    multi--;
                }
            }else if(c==']'){
                return new String[]{String.valueOf(i),res.toString()};
            }else{
                res.append(c);
            }
            i++;
        }
        return new String[]{res.toString()};
    }
}