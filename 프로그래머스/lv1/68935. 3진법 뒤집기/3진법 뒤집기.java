class Solution {
    public int solution(int n) {
        String tri = "";
        
        while(n != 0){
            tri += n % 3;    
            n /= 3;
        }
        int sum = 0;
        for(int i = 0; i < tri.length(); i++){
            sum += Character.getNumericValue(tri.charAt(tri.length()-1-i)) * Math.pow(3, i);
        }

        return sum;
    }
} 