/*这道题就是遍历整个图，所以遍历时候要记录已经访问点，我们用一个字典记录。本题采用DFS解法
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
class Solution {
    public Node cloneGraph(Node node) {
        Map<Node,Node> map = new HashMap<>();
        return dfs(node,map);
    }
    public Node dfs(Node node,Map<Node,Node> map){
        if(node==null){
            return null;
        }
        if(map.containsKey(node)){
            return map.get(node);
        }
        Node clone = new Node(node.val,new ArrayList<>());
        map.put(node,clone);
        for(Node n:node.neighbors){
            clone.neighbors.add(dfs(n,map));
        }
        return clone;
    }
}