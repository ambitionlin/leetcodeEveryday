class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if(numRows==0){
            return lists;
        }
        List<Integer> one = new ArrayList<>();
        one.add(1);
        lists.add(one);
        if(numRows==1){
            return lists;
        }
        for(int i=1;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                List<Integer> prev = lists.get(i-1);
                row.add(prev.get(j-1)+prev.get(j));
            }
            row.add(1);
            lists.add(row);
        }
        return lists;
    }
}