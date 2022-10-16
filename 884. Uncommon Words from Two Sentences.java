class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words1 = s1.split("\\s+");
        String[] words2 = s2.split("\\s+");
        Map<String, Integer> hmap = new HashMap<>();
        List<String> result = new ArrayList<>();
        for(String word : words1){
            int freq = hmap.getOrDefault(word, 0);
            hmap.put(word, ++freq);
        }
        for(String word : words2){
            int freq = hmap.getOrDefault(word, 0);
            hmap.put(word, ++freq);
        }
        for(String key : hmap.keySet()){
            if(hmap.get(key) == 1) result.add(key);
        }
        return result.toArray(new String[0]);
    }
}