class Solution {
    public int solution(int n) {
        n = n / 2;
        int replysd = n / 2;
        int answer = 0;
        for(int i = 0;i < replysd; i++) answer += (n + 1) * 2;

        if( n % 2 > 0 ) answer += n + 1;

        return answer;
    }
}