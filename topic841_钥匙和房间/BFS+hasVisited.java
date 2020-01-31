class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] hasVisited = new boolean[n];
        Arrays.fill(hasVisited,false);
        hasVisited[0] = true;
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0;i<rooms.get(0).size();i++){
            queue.add(rooms.get(0).get(i));
        }
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size-->0){
                int num = queue.poll();
                hasVisited[num]=true;
                for(int i=0;i<rooms.get(num).size();i++){
                    if(hasVisited[rooms.get(num).get(i)]){
                        continue;
                    }
                    queue.add(rooms.get(num).get(i));
                }
            }
        }
        for(int i=0;i<n;i++){
            if(hasVisited[i]==false){
                return false;
            }
        }
        return true;
    }
}