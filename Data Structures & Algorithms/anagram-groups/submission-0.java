class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> mapa = new HashMap<>();
        for(String str: strs){
            List<Integer> a = new ArrayList<>(26);
            for(int i=0;i<26;i++)
                a.add(0);
            for(char ch: str.toCharArray()){
                
                a.set(ch-'a', a.get(ch-'a')+1);
            }
            if(mapa.get(a) == null){
                List<String> strList = new ArrayList<>();
                strList.add(str);
                mapa.put(a, strList);
            }
            else{
                mapa.get(a).add(str);
            }

        }
        return mapa.values().stream().toList(); 
    }
}
