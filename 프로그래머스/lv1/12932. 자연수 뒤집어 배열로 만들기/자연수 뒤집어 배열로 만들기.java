class Solution {
    public int[] solution(long n) {
        String str_temp = Long.toString(n);
        StringBuilder str_n = new StringBuilder(str_temp);
        int[] answer = new int[str_n.length()];
        
        str_n.reverse();
        
        for(int i = 0; i < str_n.length(); i++){
            char temp = str_n.charAt(i);
            int num = Character.getNumericValue(temp);
            answer[i] = num;
            
        }
        
        return answer;
    }
}