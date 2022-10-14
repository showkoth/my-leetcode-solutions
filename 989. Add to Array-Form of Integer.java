class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int len = num.length;
        List<Integer> li = new ArrayList<>();
        for(int i = len - 1; i >= 0; i--){
            var val = num[i];
            li.add((val + k) % 10);
            k = (val + k) / 10;
        }
        while(k > 0){
            li.add(k % 10);
            k = k / 10;
        }
        Collections.reverse(li);
        return li;
    }
}