class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < edges.length; i++) {

            for (int j = 0; j < edges[i].length; j++) {

                int value = edges[i][j];

                hm.put(value, hm.getOrDefault(value, 0) + 1);
            }
        }
        int mc=0;
        int c=0;
        for(int e:hm.keySet()){
            if(hm.get(e)>mc){
                mc=hm.get(e);
                c=e;
            }
        }
        return c;
    }
}