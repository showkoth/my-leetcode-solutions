class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 60; j++){
                if(Integer.bitCount(i) + Integer.bitCount(j) == turnedOn){
                    if(j < 10) list.add(String.format("%d:0%d",i,j));
                    else list.add(String.format("%d:%d",i,j));
                }
            }
        }
        return list;
    }
}