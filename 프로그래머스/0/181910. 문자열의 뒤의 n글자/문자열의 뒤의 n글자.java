class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] my_stringC = my_string.toCharArray();

        for(int i=0; i<n; i++){
            answer += my_stringC[my_stringC.length-n+i];
        }

        return answer;
    }
}