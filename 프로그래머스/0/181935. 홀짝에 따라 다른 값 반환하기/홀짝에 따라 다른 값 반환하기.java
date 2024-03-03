class Solution {
    public int solution(int n) {
        int answer = 0;
        int odd = 0;
        int jjj = 0;
        for(int i = 1; i <= n; i++){
            if(i%2 == 0) jjj += i*i;
            else odd += i;
        }

        answer = n % 2 == 0 ? jjj : odd;

        return answer;
    }
}