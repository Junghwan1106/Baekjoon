class Solution {
    public long solution(long n) {
        long answer = 0;
        double num1 = Math.sqrt(n);
        long num2 = (long)Math.sqrt(n);
        if(num1 - num2 == 0){
            return (num2+1) * (num2+1);
        } else {
            return -1;
        }
        
    }
}