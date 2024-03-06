class Solution {
    private static final int SIZE = 26;
    public int[] solution(String my_string) {
        int[] answer = new int[2 * SIZE];
        for(int i = 0 ; i < my_string.length() ; i++){
            char ch = my_string.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                answer[ch - 'a' + SIZE]++;
            }
            if(ch >= 'A' && ch <= 'Z'){
                answer[ch - 'A']++;
            }
        }
        return answer;
    }
}