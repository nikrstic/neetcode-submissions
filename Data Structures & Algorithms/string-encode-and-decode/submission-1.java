class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        int positionOfBreak = 0;
        for(String str: strs){
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }
        System.out.println(sb.toString());
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        
        int pointer = 0;
        while(pointer < str.length()){
            StringBuilder number = new StringBuilder();
            
            while(str.charAt(pointer) != '#'){
                number.append(str.charAt(pointer));
                pointer++;
            }
            
            int num = Integer.parseInt(number.toString());
            StringBuilder sb = new StringBuilder();
            pointer++;
            int tmp = pointer;
            while(pointer<tmp+num){
                sb.append(str.charAt(pointer));
                pointer++;
            }
            
            list.add(sb.toString());
            
            
        }
        return list;
    }
}
