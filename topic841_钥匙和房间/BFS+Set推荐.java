class Solution{
    public boolean canVisitAllRooms(List<List<Integer>> rooms){
        Set<Integer> set = new HashSet<>();
        set.add(0);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size-->0){
                int num = queue.poll();
                for(int key:rooms.get(num)){
                    if(set.contains(key)){
                        continue;
                    }
                    set.add(key);
                    if(set.size()==rooms.size()){
                        return true;
                    }
                    queue.add(key);
                }
            }
        }
        return set.size()==rooms.size();
    }
}